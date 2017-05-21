package visitors;

import gen.CPPBaseVisitor;
import gen.CPPParser;
import parallelizer.Program;
import parallelizer.Translator;

/**
 * Created by milderhc on 20/05/17.
 */
public class GlobalVisitor<T> extends CPPBaseVisitor<T> {

    private Program program;

    public GlobalVisitor(Program program) {
        this.program = program;
    }

    @Override
    public T visitCpp(CPPParser.CppContext ctx) {
        ctx.global().forEach(global -> {
            if (global.function() == null)
                program.add(Translator.getText(global));
        });

        return null;
    }
}
