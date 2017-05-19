    package parallelizer.model;

import gen.CPPParser;
import parallelizer.Translator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

    /**
 * Created by milderhc on 16/05/17.
 */
public class Function implements Comparable<Function> {

    private LinkedList<Block> flowGraph;
    private String id;
    private CPPParser.FunctionBodyContext ctx;
    private Set<String> aliveVariables, deadVariables; //in case a Block is just a function call

    public Function(String id, CPPParser.FunctionBodyContext ctx) {
        this.id = id;
        this.ctx = ctx;
        this.flowGraph = new LinkedList<>();
    }

    public Function(String id) {
        this.id = id;
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
        Block currentBlock = new Block();
        for (CPPParser.InstructionContext inst : ctx.instruction()) {
            if ( isScope(inst) ) {
                flowGraph.add(currentBlock);
                if( currentBlock.getInstructions().isEmpty() ) currentBlock.addInstruction( inst );
                else {
                    Block controlBlock = new Block();
                    controlBlock.addInstruction( inst );
                    flowGraph.add( controlBlock );
                }
                currentBlock = new Block();
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
        int index = 0;
        for( Block block : flowGraph ) {
            System.out.println( "Block#" + (index++) );
            block.print();
        }
    }

    public void parallelizeBlocks() {
        getAliveDeadVariables();
        //Make the dependencies between blocks with the information of live and dead variables
        //Parallelize the blocks that don't have dependencies
    }

    private void getAliveDeadVariables() {
        aliveVariables = new HashSet<>();
        deadVariables = new HashSet<>();
        Iterator<Block> it = flowGraph.descendingIterator();
        while( it.hasNext() ) {
            it.next().getAliveDeadVariables( aliveVariables, deadVariables );
        }
        //We have to remove the parameters that are not pointers because they were just copies
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
}
