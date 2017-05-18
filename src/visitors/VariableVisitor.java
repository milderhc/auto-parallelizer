package visitors;

import gen.CPPBaseVisitor;
import gen.CPPParser;

import java.util.Set;

/**
 * Created by danielk on 5/17/2017.
 */
public class VariableVisitor<T> extends CPPBaseVisitor<T> {

    Set<String> aliveVariables, deadVariables;
    String lastId;

    public VariableVisitor(CPPParser.InstructionContext inst, Set<String> aliveVariables, Set<String> deadVariables) {
        this.aliveVariables = aliveVariables;
        this.deadVariables = deadVariables;
        visitChildren( inst );
    }

    @Override
    public T visitProperDeclaration (CPPParser.ProperDeclarationContext ctx) {
        ctx.id().forEach( id -> {
            deadVariables.remove( id.getText() );
            aliveVariables.remove( id.getText() );
        });
        return visitChildren(ctx);
    }

    @Override
    public T visitAssignment (CPPParser.AssignmentContext ctx) {
        lastId = ctx.callSomething().id().getText();
        aliveVariables.remove( lastId );
        deadVariables.add( lastId );
        return visitChildren(ctx);
    }

    @Override
    public T visitProperAssignment (CPPParser.ProperAssignmentContext ctx) {
        int sz = ctx.assignmentOp().size();
        for( int i = 0 ; i < sz; ++i ) {
            // The difference between callSomething and expression
            //                        a                 2+a
        }
        return null;
    }

}
