package parallelizer.model;

import gen.CPPParser;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by milderhc on 16/05/17.
 */
public class Block {
    private List<CPPParser.InstructionContext> instructions;

    public Block () {
        instructions = new LinkedList<>();
    }

    public void addInstruction (CPPParser.InstructionContext inst) {
        instructions.add(inst);
    }

    public List<CPPParser.InstructionContext> getInstructions() {
        return instructions;
    }
}
