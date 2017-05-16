package visitors;

import gen.CPPBaseVisitor;
import gen.CPPParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import parallelizer.Program;

import java.util.List;

/**
 * Created by milderhc on 16/05/17.
 */
public class FunctionVisitor<T> extends CPPBaseVisitor<T> {

    private Program program;

    public Program getProgram() {
        return program;
    }

    public FunctionVisitor (Program program) {
        this.program = program;
    }

    private void addText (ParserRuleContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        program.add(ctx.start.getInputStream().getText(interval));
    }

    @Override
    public T visitFunction (CPPParser.FunctionContext ctx) {
        StringBuilder name = new StringBuilder(ctx.id().getText());
        if( ctx.parameters() != null ) {
            List<CPPParser.DatatypeContext> datatype = ctx.parameters().datatype();
            datatype.forEach(currentType -> {
                name.append("-" + currentType.getText());
            });
        }

        program.getDefinedFunctions().add(name.toString());

        return null;
    }

}
