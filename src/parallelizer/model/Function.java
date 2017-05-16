package parallelizer.model;

import gen.CPPParser;

import java.util.Map;

/**
 * Created by milderhc on 16/05/17.
 */
public class Function implements Comparable<Function> {

    private Map<Block, Block> flowGraph;
    private String id;
    private CPPParser.FunctionBodyContext ctx;

    public Function(String id, CPPParser.FunctionBodyContext ctx) {
        this.id = id;
        this.ctx = ctx;
    }

    public Function(String id) {
        this.id = id;
    }

    public Map<Block, Block> getFlowGraph() {
        return flowGraph;
    }

    public String getId() {
        return id;
    }

    public CPPParser.FunctionBodyContext getCtx() {
        return ctx;
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
