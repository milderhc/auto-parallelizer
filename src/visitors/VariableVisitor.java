package visitors;

import gen.CPPBaseVisitor;
import gen.CPPParser;
import parallelizer.Translator;
import parallelizer.model.Function;

import java.util.Set;

/**
 * Created by danielk on 5/17/2017.
 */
public class VariableVisitor<T> extends CPPBaseVisitor<T> {

    Set<String> aliveVariables, deadVariables;

    public VariableVisitor(CPPParser.InstructionContext inst, Set<String> aliveVariables, Set<String> deadVariables) {
        this.aliveVariables = aliveVariables;
        this.deadVariables = deadVariables;
        visitChildren( inst );
    }

    @Override
    public T visitProperDeclaration (CPPParser.ProperDeclarationContext ctx) {
        int index = 0;
        for (CPPParser.IdContext id : ctx.id()) {
            deadVariables.remove( id.getText() );
            aliveVariables.remove( id.getText() );
            //declarationType is missing
            ++index;
        }
        return visitChildren(ctx);
    }

    @Override
    public T visitAssignment (CPPParser.AssignmentContext ctx) {

        return null;
    }

    @Override
    public T visitCallSomething (CPPParser.CallSomethingContext ctx) {
        if( ctx.callFunction() != null ) {
            String name = Function.getVirtualName(ctx);
            if( Translator.program.getDefinedFunctions().containsKey(name) ) {
                Function f = Translator.program.getDefinedFunctions().get(name);
                f.getDeadVariables().forEach(var -> {
                    aliveVariables.remove(var);
                    deadVariables.add(var);
                });
                f.getAliveVariables().forEach(var -> {
                    deadVariables.remove(var);
                    aliveVariables.add(var);
                });
            }
            if( ctx.callFunction().functionArguments() != null ) {
                ctx.callFunction().functionArguments().expression().forEach( exp -> {
                    //Update alive and dead variables for each expression
                });
            }
        }
        return null;
    }




}
