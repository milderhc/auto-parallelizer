import gen.CPPBaseVisitor;
import gen.CPPParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

/**
 * Created by milderhc on 12/05/17.
 */
public class CPPVisitor<T> extends CPPBaseVisitor<T> {

    private Program program;


    public Program getProgram() {
        return program;
    }

    public CPPVisitor () {
        program = new Program();
    }

    private void addText (ParserRuleContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        program.add(ctx.start.getInputStream().getText(interval));
    }

    @Override
    public T visitCpp(CPPParser.CppContext ctx) {
        addText(ctx);
        return visit(ctx);
    }
}
