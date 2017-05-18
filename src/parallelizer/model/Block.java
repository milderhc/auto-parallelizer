package parallelizer.model;

import gen.CPPParser;
import parallelizer.Translator;
import visitors.VariableVisitor;

import java.util.*;

/**
 * Created by milderhc on 16/05/17.
 */
public class Block {
    private LinkedList<CPPParser.InstructionContext> instructions;
    private Set<String> aliveVariables, deadVariables;

    public Block () {
        instructions = new LinkedList<>();
    }

    public void addInstruction (CPPParser.InstructionContext inst) {
        instructions.add(inst);
    }

    public List<CPPParser.InstructionContext> getInstructions() {
        return instructions;
    }

    public void print() {
        instructions.forEach( inst -> System.out.println( inst.getText() ) );
    }

    public void getAliveDeadVariables( Set<String> aliveVariables, Set<String> deadVariables ) {
        Iterator<CPPParser.InstructionContext> it = instructions.descendingIterator();
        while( it.hasNext() ) {
            new VariableVisitor( it.next(), aliveVariables, deadVariables );
            //updateAliveDeadVariables( it.next(), liveVariables, deadVariables );
        }
        this.aliveVariables = new HashSet<>( aliveVariables );
        this.deadVariables = new HashSet<>( deadVariables );
    }

    /*
    private void updateAliveDeadVariables( CPPParser.InstructionContext inst, Set<String> liveVariables, Set<String> deadVariables ) {
        if( isScope(inst) ) {

        } else if( inst.declarationBlock() != null ) {

        } else if( inst.assignmentBlock() != null ) {

        } else if( inst.ifBlock() != null ) {

        } else if( inst.callSomething() != null ) {

        } else if( inst.expression() != null ) {

        }
    }

    private boolean isScope(CPPParser.InstructionContext inst) {
        return inst.forBlock() != null || inst.whileBlock() != null || inst.doWhileBlock() != null
                || inst.scope() != null    || inst.ifBlock() != null    ||
                (inst.callSomething() != null && inst.callSomething().callFunction() != null &&
                        Translator.program.getDefinedFunctions().containsKey( Function.getVirtualName(inst.callSomething())));
    }*/
}
