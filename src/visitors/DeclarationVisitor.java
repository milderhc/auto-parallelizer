package visitors;

import gen.CPPBaseVisitor;
import parallelizer.Program;

/**
 * Created by milderhc on 20/05/17.
 */
public class DeclarationVisitor<T> extends CPPBaseVisitor<T> {

    private Program program;

    public DeclarationVisitor(Program program) {
        this.program = program;
    }

//    @Override
//    public T visitScope () {
//
//    }
}
