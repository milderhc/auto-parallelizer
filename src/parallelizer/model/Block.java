package parallelizer.model;

import gen.CPPParser;
import visitors.VariableVisitor;

import java.util.*;

/**
 * Created by milderhc on 16/05/17.
 */
public class Block implements Comparable<Block> {
    private LinkedList<CPPParser.InstructionContext> instructions;
    private Set<String> aliveVariables, deadVariables;
    private int id;

    public Block (int id) {
        instructions = new LinkedList<>(); this.id = id;
    }

    public void addInstruction (CPPParser.InstructionContext inst) {
        instructions.add(inst);
    }

    public List<CPPParser.InstructionContext> getInstructions() {
        return instructions;
    }

    public void getAliveDeadVariables() {
        this.aliveVariables = new HashSet<>();
        this.deadVariables = new HashSet<>();
//        System.out.println();
        if( isScope(instructions.peek()) ) {
            //In this case the instructions inside the scope are going to be visited from top to bottom
            //we have to invert this order.
        }
        else {
            Iterator<CPPParser.InstructionContext> it = instructions.descendingIterator();
            while (it.hasNext()) {
                new VariableVisitor(it.next(), aliveVariables, deadVariables);
            }
        }
    }

    private boolean isScope(CPPParser.InstructionContext inst) {
        return inst.forBlock() != null || inst.whileBlock() != null || inst.doWhileBlock() != null
                || inst.scope() != null  || inst.ifBlock() != null;
    }

    @Override
    public String toString () {
        StringBuilder builder = new StringBuilder("Block #" + id + "\nInstructions\n");
        instructions.forEach( inst -> builder.append(inst.getText() + "\n") );
        builder.append("Alive variables [ ");
        aliveVariables.forEach(alive -> builder.append(alive + " "));
        builder.append("]\nDead variables [ ");
        deadVariables.forEach(dead -> builder.append(dead + " "));
        builder.append("]");
        return builder.toString();
    }

    public Set<String> getAliveVariables() {
        return aliveVariables;
    }

    public Set<String> getDeadVariables() {
        return deadVariables;
    }

    public int getId() {
        return id;
    }


    @Override
    public int compareTo(Block o) {
        return id - o.getId();
    }
}
