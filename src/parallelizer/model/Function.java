    package parallelizer.model;

    import gen.CPPParser;
    import javafx.util.Pair;
    import parallelizer.Translator;

    import java.util.*;

    /**
 * Created by milderhc on 16/05/17.
 */
public class Function implements Comparable<Function> {

    private LinkedList<Block> flowGraph;
    private Map<Block, Set<Block>> dependencyGraph;
    private LinkedList<Pair<Block, Integer>> blocksOrder;

    private String id;
    private CPPParser.FunctionBodyContext ctx;
    private Set<String> aliveVariables, deadVariables; //in case a Block is just a function call

    public Function(String id, CPPParser.FunctionBodyContext ctx) {
        this.id = id;
        this.ctx = ctx;
        this.flowGraph = new LinkedList<>();
        this.dependencyGraph = new TreeMap<>();
    }

    public Function(String id) {
        this(id, null);
    }

    public String getId() {
        return id;
    }

    public CPPParser.FunctionBodyContext getCtx() {
        return ctx;
    }

    public Set<String> getAliveVariables() { return aliveVariables; }

    public Set<String> getDeadVariables() { return deadVariables; }


    public void buildFlowGraph () {
        if (ctx == null)
            return;
        int index = 0;

        Block currentBlock = new Block(index++);
        for (CPPParser.InstructionContext inst : ctx.instruction()) {
            if ( isScope(inst) ) {
                flowGraph.add(currentBlock);
                if( currentBlock.getInstructions().isEmpty() ) currentBlock.addInstruction( inst );
                else {
                    Block controlBlock = new Block(index++);
                    controlBlock.addInstruction( inst );
                    flowGraph.add( controlBlock );
                }
                currentBlock = new Block(index++);
            }
            else {
                currentBlock.addInstruction(inst);
            }
        }

        if (!currentBlock.getInstructions().isEmpty())
            flowGraph.add(currentBlock);
    }

    private boolean isScope(CPPParser.InstructionContext inst) {
        return inst.forBlock() != null || inst.whileBlock() != null || inst.doWhileBlock() != null
                || inst.scope() != null    || inst.ifBlock() != null    ||
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
        if (ctx == null)
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
        StringBuilder name = new StringBuilder(ctx.id().getText());
//        if( ctx.parameters() != null ) {
//            List<CPPParser.DatatypeContext> datatype = ctx.parameters().datatype();
//            datatype.forEach(currentType -> {
//                name.append("-" + currentType.getText());
//            });
//        }

        if (ctx.parameters() != null) {
            name.append("-" + ctx.parameters().datatype().size());
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

    public boolean checkDependency (Set<String> alive, Set<String> dead) {
        for (String a : alive) {
            if (dead.contains(a))
                return true;
        }
        return false;
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


    public LinkedList<Pair<Block, Integer>> getBlocksOrder() {
        return blocksOrder;
    }
}
