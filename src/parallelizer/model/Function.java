    package parallelizer.model;

    import gen.CPPParser;
import javafx.util.Pair;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import parallelizer.Translator;

import java.util.*;

    /**
 * Created by milderhc on 16/05/17.
 */
public class Function implements Comparable<Function> {

    private LinkedList<Block> flowGraph;
    private Map<Block, Set<Block>> dependencyGraph;
    private LinkedList<Pair<Block, Integer>> blocksOrder;

    private Block declarationBlock;
    private Block returnBlock;

    private String id;
    private CPPParser.ScopeContext bodyCtx;
    private ParserRuleContext functionCtx;
    private Set<String> aliveVariables, deadVariables; //in case a Block is just a function call

    public Function(String id, CPPParser.ScopeContext bodyCtx, ParserRuleContext functionCtx) {
        this.id = id;
        this.bodyCtx = bodyCtx;
        this.functionCtx = functionCtx;
        this.flowGraph = new LinkedList<>();
        this.dependencyGraph = new TreeMap<>();
    }

    public Function(String id) {
        this(id, null, null);
    }

    public String getId() {
        return id;
    }

    public Set<String> getAliveVariables() { return aliveVariables; }

    public Set<String> getDeadVariables() { return deadVariables; }


    public void buildFlowGraph () {
        if (bodyCtx == null)
            return;

        returnBlock = null;
        declarationBlock = null;
        int index = 1;

        Block currentBlock = new Block(index++);
        for (CPPParser.InstructionContext inst : bodyCtx.instruction()) {
            if ( isScope(inst) ) {
                flowGraph.add(currentBlock);
                if (currentBlock.getInstructions().isEmpty()) currentBlock.addInstruction(inst);
                else {
                    Block controlBlock = new Block(index++);
                    controlBlock.addInstruction(inst);
                    flowGraph.add(controlBlock);
                }
                currentBlock = new Block(index++);
            } else if (inst.returnBlock() != null) {
                returnBlock = new Block(index++);
                returnBlock.addInstruction(inst);
            } else if (inst.declarationBlock() != null) {
                if (declarationBlock == null)
                    declarationBlock = new Block(0);
                declarationBlock.addInstruction(inst);
            } else {
                currentBlock.addInstruction(inst);
            }
        }

        if (!currentBlock.getInstructions().isEmpty())
            flowGraph.add(currentBlock);
    }

    private boolean isScope(CPPParser.InstructionContext inst) {
        return inst.forBlock() != null || inst.whileBlock() != null || inst.doWhileBlock() != null
                || inst.scope() != null || inst.ifBlock() != null ||
                (inst.callSomething() != null && inst.callSomething().callFunction() != null &&
                Translator.program.getDefinedFunctions().containsKey( Function.getVirtualName(inst.callSomething())));
    }

    public void printFlowGraph() {
        flowGraph.forEach(block -> System.out.println(block));
    }

    public void printDependencyGraph () {
        dependencyGraph.forEach((block, neighbors) -> {
            System.out.print(block.getId() + " -> ");
            neighbors.forEach(neigh -> System.out.print(neigh.getId() + " "));
            System.out.println();
        });
    }

    public void findDependencies() {
        if (bodyCtx == null)
            return;
        getAliveDeadVariables();
        //Make the dependencies between blocks with the information of live and dead variables
        //Parallelize the blocks that don't have dependencies
    }

    private void getAliveDeadVariables() {
        aliveVariables = new HashSet<>();
        deadVariables = new HashSet<>();
        Iterator<Block> it = flowGraph.descendingIterator();
        while( it.hasNext() ) {
            it.next().getAliveDeadVariables();
        }
    }

    @Override
    public int compareTo(Function o) {
        return id.compareTo(o.getId());
    }

    public static String getVirtualName (CPPParser.FunctionContext ctx) {
        StringBuilder name = new StringBuilder(ctx.functionSign().id().getText());
//        if( bodyCtx.parameters() != null ) {
//            List<CPPParser.DatatypeContext> datatype = bodyCtx.parameters().datatype();
//            datatype.forEach(currentType -> {
//                name.append("-" + currentType.getText());
//            });
//        }

        if (ctx.functionSign().parameters() != null) {
            name.append("-" + ctx.functionSign().parameters().datatype().size());
        }

        return name.toString();
    }

    public static String getVirtualName (CPPParser.CallSomethingContext ctx) {
        StringBuilder name = new StringBuilder(ctx.id().getText());

        if (ctx.callFunction().functionArguments() != null) {
            name.append("-" + ctx.callFunction().functionArguments().expression().size());
        }

        return name.toString();
    }

    public void buildDependencyGraph() {
        if (flowGraph.isEmpty())
            return;

        ArrayList<Block> blocks = new ArrayList<>(flowGraph.size());

        for (Block block : flowGraph) {
            dependencyGraph.put(block, new TreeSet<>());
            blocks.add(block);
        }

        for (int i = flowGraph.size() - 1; i >= 0; --i) {
            for (String alive : flowGraph.get(i).getAliveVariables())
                for (int j = i - 1; j >= 0; --j)
                    if (flowGraph.get(j).getDeadVariables().contains(alive)) {
                        dependencyGraph.get(blocks.get(j)).add(blocks.get(i));
                        break;
                    }

            for (String dead : flowGraph.get(i).getDeadVariables())
                for (int j = i - 1; j >= 0; --j)
                    if (flowGraph.get(j).getAliveVariables().contains(dead)) {
                        dependencyGraph.get(blocks.get(j)).add(blocks.get(i));
                    }
        }
    }

    private void findIslands (Block block, Set<Block> visited,
                              LinkedList<Pair<Block, Integer>> toposort, int currentIsland) {
        visited.add(block);
        Set<Block> neighbors = dependencyGraph.get(block);
        neighbors.forEach(neigh -> {
            if (!visited.contains(neigh))
                findIslands(neigh, visited, toposort, currentIsland);
        });

        toposort.push(new Pair<>(block, currentIsland));
    }

    public void findIslands() {
        Set<Block> visited = new TreeSet<>();
        blocksOrder = new LinkedList<>();

        int currentIsland = 0;
        for (Map.Entry<Block, Set<Block>> entry : dependencyGraph.entrySet()) {
            if (!visited.contains(entry.getKey()))
                findIslands(entry.getKey(), visited, blocksOrder, currentIsland++);
        }
    }

    private String getText (ParserRuleContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        return ctx.start.getInputStream().getText(interval);
    }

    public LinkedList<Pair<Block, Integer>> getBlocksOrder() {
        return blocksOrder;
    }

    public String parallelize () {
        if (functionCtx == null)
            return "";

        StringBuilder parallelized = new StringBuilder();

        if (functionCtx instanceof CPPParser.FunctionContext)
            parallelized.append( getText( ((CPPParser.FunctionContext) functionCtx).functionSign() ) );
        else
            parallelized.append( getText( ((CPPParser.MainContext) functionCtx).mainSign() ) );

        parallelized.append(" {\n");

        List<List<Block>> sections = new LinkedList<>();
        TreeMap<Integer, Integer> currentSection = new TreeMap<>();

        for (Pair<Block, Integer> block : blocksOrder) {
            int blockSection, island = block.getValue();
            if (!currentSection.containsKey(island))
                blockSection = 0;
            else
                blockSection = currentSection.get(island);

            currentSection.put(island, blockSection + 1);
            if (blockSection == sections.size())
                sections.add(new LinkedList<>());

            sections.get(blockSection).add(block.getKey());
        }

        if (declarationBlock != null)
            parallelized.append(declarationBlock.getText(1));

        sections.forEach(section -> {
            if (section.size() > 1) {
                parallelized.append("\t#pragma omp parallel sections\n\t{\n");
                section.forEach(block -> {
                    parallelized.append("\t\t#pragma omp section\n\t\t{\n");
                    List<CPPParser.InstructionContext> instructions = block.getInstructions();
                    if (!instructions.isEmpty() && instructions.get(0).forBlock() != null) {
                        Map<String, List<String>> reduction = checkReduction(instructions.get(0).forBlock().controlStructureBody());
                        parallelizeReduction(block, reduction, parallelized, 3);
                    } else
                        parallelized.append(block.getText(3));
                    parallelized.append("\t\t}\n");
                });
                parallelized.append("\t}\n");
            } else {
                List<CPPParser.InstructionContext> instructions = section.get(0).getInstructions();
                if (!instructions.isEmpty() &&
                        instructions.get(0).forBlock() != null) {
                    Map<String, List<String>> reduction = checkReduction(instructions.get(0).forBlock().controlStructureBody());
                    parallelizeReduction(section.get(0), reduction, parallelized, 1);
                } else
                    parallelized.append(section.get(0).getText(1));
            }
        });

        if (returnBlock != null)
            parallelized.append(returnBlock.getText(1));
        parallelized.append("}\n");

        return parallelized.toString();
    }

    private void parallelizeReduction(Block block, Map<String, List<String>> reduction, StringBuilder parallelized, int tabs) {
        if (reduction != null && !reduction.isEmpty()) {
            String prefix = "";
            for (int i = 0; i < tabs; ++i) prefix = prefix + "\t";

            parallelized.append(prefix + "#pragma omp parallel for");
            reduction.forEach((op, ids) -> {
                parallelized.append(" reduction(" + op + ":");
                for (int i = 0; i < ids.size(); ++i) {
                    if (i > 0)
                        parallelized.append(",");
                    parallelized.append(ids.get(i));
                }
                parallelized.append(")");
            });
            parallelized.append("\n");
        }

        parallelized.append(block.getText(tabs));
    }

    private boolean checkAssignment (CPPParser.AssignmentContext assign, Map<String, String> reductionVariables) {
        //Only scalar assignments are valid
        if (assign.callSomething().accessBrackets().isEmpty()) {
            String left = assign.callSomething().getText();

            if (reductionVariables.containsKey(left))
                return false;

            if (assign.properAssignment().assignmentOp().size() != 1) return false;

            String op = assign.properAssignment().assignmentOp().get(0).getText();
            String code = Translator.getText(assign.properAssignment().expression());
            Pair<List<String>, Integer> analyzed = analyze( code );

            if (analyzed.getValue() != 0)
                return false;

            List<String> right = analyzed.getKey();
            int occurrences = 0;
            for (String id : right) {
                if (reductionVariables.containsKey(id))
                    reductionVariables.remove(id);
                if (id.equals(left))
                    ++occurrences;
            }

            if ("=".contains(op)) {
                if (occurrences != 1) return false;
                if( assign.properAssignment().expression().expression2() != null)
                    return checkMinMax(left, assign.properAssignment().expression().expression2(), reductionVariables);
                else {
                    //TODO support direct assignments

                    return false;
                }
            }
            if ("+=@-=@*=@|=@&=@^=".contains(op) && occurrences != 0) return false;

            reductionVariables.put(left, op.replace("=", ""));
        }

        return true;
    }

        private boolean checkMinMax(String left, CPPParser.Expression2Context expr2, Map<String, String> reductionVariables) {
            while( expr2.expression() != null && expr2.expression().size() == 1 ) {
                if( expr2.expression().get(0).expression2() == null ) return false;
                expr2 = expr2.expression().get(0).expression2();
            }
            if( expr2.callSomething() == null )
                return false;
            String callSomId = expr2.callSomething().id().getText();
            if( !(callSomId.equals("min") || callSomId.equals("max")) )
                return false;
            CPPParser.FunctionArgumentsContext fac = expr2.callSomething().callFunction().functionArguments();
            if( fac.expression().size() != 2 )
                return false;
            List<String> leftExpressionIds = analyze( Translator.getText( fac.expression(0) ) ).getKey();
            List<String> rightExpressionIds = analyze( Translator.getText( fac.expression(1) ) ).getKey();
            boolean idFound = false;
            if( leftExpressionIds.size() == 1 )
                idFound |= leftExpressionIds.get(0).equals( left+"\n" );
            if( rightExpressionIds.size() == 1 )
                idFound |= rightExpressionIds.get(0).equals( left+"\n" );
            if( idFound )
                reductionVariables.put(left, callSomId);
            return idFound;
        }

        private Map<String, List<String>> checkReduction(CPPParser.ControlStructureBodyContext ctx) {
        Map<String, String> reductionVariables = new TreeMap<>();

        //if one assignment does not support reduction, the entire 'for' neither
        if (ctx.scope() != null) {
            for (CPPParser.InstructionContext inst : ctx.scope().instruction()) {
                if (inst.assignmentBlock() != null) {
                    for (CPPParser.AssignmentContext assign : inst.assignmentBlock().assignment()) {
                        if (!checkAssignment(assign, reductionVariables))
                            return null;
                    }
                }
            }
        } else if (ctx.instruction() != null) {
            if (ctx.instruction().assignmentBlock() != null) {
                for (CPPParser.AssignmentContext assign : ctx.instruction().assignmentBlock().assignment()) {
                    if (!checkAssignment(assign, reductionVariables))
                        return null;
                }
            }
        }
        
        Map<String, List<String>> reductionOperations = new TreeMap<>();
        reductionVariables.forEach((id, op) -> {
            if (!reductionOperations.containsKey(op))
                reductionOperations.put(op, new LinkedList<>());

            reductionOperations.get(op).add(id);
        });

        return reductionOperations;
    }


    public static Pair<List<String>, Integer> analyze (String text) {
        StringBuilder current = new StringBuilder();

        List<String> variables = new LinkedList<>();

        int type = 0;
        for (char c : text.toCharArray()) {
            if (c == '(') {
                current = new StringBuilder();
            }
            else if (c == '[') {
                if (current.length() > 0) {
                    variables.add(current.toString());
                }
                current = new StringBuilder();
            }

            if ("=!<>+-*/%&|^~([])'\"{}#, ".indexOf(c) == -1) {
                if ("0123456789".indexOf(c) == -1 || current.length() > 0)
                    current.append(c);
            } else {
                if (current.length() > 0) {
                    String id = current.toString();
                    if (!id.equals("or") && !id.equals("and") && !id.equals("xor")) {
                        variables.add(id);
                    }

                    if (id.equals("cin")) {
                        type = 1;
                    } else if (id.equals("cout"))
                        type = 2;
                    current = new StringBuilder();
                }
            }
        }
        if (current.length() > 0) {
            String id = current.toString();
            if (!id.equals("or") && !id.equals("and") && !id.equals("xor")) {
                variables.add(id);
            }

            if (id.equals("cin")) {
                type = 1;
            } else if (id.equals("cout"))
                type = 2;
        }

        return new Pair<>(variables, type);
    }
}
