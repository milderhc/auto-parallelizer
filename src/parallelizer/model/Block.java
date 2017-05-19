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
        if( isScope(instructions.poll()) ) {
            //In this case the instructions inside the scope are going to be visited from top to bottom
            //we have to invert this order.
        }
        else {
            Iterator<CPPParser.InstructionContext> it = instructions.descendingIterator();
            while (it.hasNext()) {
                new VariableVisitor(it.next(), aliveVariables, deadVariables);
            }
            this.aliveVariables = new HashSet<>( aliveVariables );
            this.deadVariables = new HashSet<>( deadVariables );
        }
    }

    private boolean isScope(CPPParser.InstructionContext inst) {
        return inst.forBlock() != null || inst.whileBlock() != null || inst.doWhileBlock() != null
                || inst.scope() != null    || inst.ifBlock() != null || isFunction( inst );
    }

    private boolean isFunction(CPPParser.InstructionContext inst) {
        return (inst.callSomething() != null && inst.callSomething().callFunction() != null &&
                Translator.program.getDefinedFunctions().containsKey( Function.getVirtualName(inst.callSomething())));
    }

}
