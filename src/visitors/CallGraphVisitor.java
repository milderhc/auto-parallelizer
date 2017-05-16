package visitors;

import gen.CPPBaseVisitor;
import gen.CPPParser;
import parallelizer.Program;
import parallelizer.model.Function;

import java.util.LinkedList;

/**
 * Created by milderhc on 16/05/17.
 */
public class CallGraphVisitor<T> extends CPPBaseVisitor<T> {

    private Program program;

    public CallGraphVisitor (Program program) {
        this.program = program;
    }

    private String currentParent;

    @Override
    public T visitMain (CPPParser.MainContext ctx) {
        currentParent = "main";
        program.getCallGraph().put(new Function("main"), new LinkedList<>());
        return visitChildren(ctx);
    }


    @Override
    public T visitFunction (CPPParser.FunctionContext ctx) {
        currentParent = Function.getVirtualName(ctx);
        if (!program.getCallGraph().containsKey(new Function(currentParent)))
            program.getCallGraph().put(new Function(Function.getVirtualName(ctx)), new LinkedList<>());
        return visitChildren(ctx);
    }

    @Override
    public T visitCallSomething (CPPParser.CallSomethingContext ctx) {
        Function parent = program.getDefinedFunctions().get(currentParent);
        if (parent == null)
            return visitChildren(ctx);

        LinkedList<Function> neighbors = (LinkedList<Function>) program.getCallGraph().get(parent);
        if (ctx.callFunction() != null) {
            Function neighbor = new Function(Function.getVirtualName(ctx));
            if (program.getDefinedFunctions().containsKey(neighbor.getId())) {
                neighbor = program.getDefinedFunctions().get(neighbor.getId());
                neighbors.add(neighbor);
                if (!program.getCallGraph().containsKey(neighbor))
                    program.getCallGraph().put(neighbor, new LinkedList<>());
            }
        }

        return visitChildren(ctx);
    }
}
