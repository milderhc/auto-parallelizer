package visitors;

import gen.CPPBaseVisitor;
import gen.CPPParser;
import parallelizer.Program;
import parallelizer.model.Function;

/**
 * Created by milderhc on 16/05/17.
 */
public class FunctionVisitor<T> extends CPPBaseVisitor<T> {

    private Program program;

    public FunctionVisitor (Program program) {
        this.program = program;
    }

    @Override
    public T visitMain (CPPParser.MainContext ctx) {
        program.setMain(new Function("main", ctx.scope(), ctx));
        program.getDefinedFunctions().put("main", program.getMain());
        return null;
    }

    @Override
    public T visitFunction (CPPParser.FunctionContext ctx) {
        if (ctx.functionRem().scope() == null)
            return null;

        String name = Function.getVirtualName(ctx);
        program.getDefinedFunctions().put(name, new Function(name, ctx.functionRem().scope(), ctx));

        return null;
    }

}
