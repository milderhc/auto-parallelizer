package parallelizer.model;

import gen.CPPParser;
import parallelizer.Translator;
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

//    int a;
//    int c;
//    c = 10;
//    for (...) {
//        int x = 2;
//        for (int ...) {
//            a += x;
//            j = h;
//        }
//        e = 10 + c;
//    }
//
//    int a =0 ;
//        for ()
//                for ()
//    a += 2;

    public void getAliveDeadVariablesControlStructureBody (CPPParser.ControlStructureBodyContext body) {
        if (body.scope() != null)
            getAliveDeadVariables(new LinkedList<>(body.scope().instruction()));
        else if (body.instruction() != null) {
            LinkedList temp = new LinkedList<CPPParser.InstructionContext>();
            temp.add(body.instruction());
            getAliveDeadVariables(temp);
        }
    }
    
    public void getAliveDeadVariablesFor (CPPParser.ForBlockContext inst) {
        if (inst.classicFor() != null) {
            if (inst.classicFor().forExpression().size() == 1) {
                if (inst.classicFor().getText().indexOf(';') == 0)
                    new VariableVisitor(inst.classicFor().forExpression(0), aliveVariables, deadVariables);
            } else if (inst.classicFor().forExpression().size() == 2) {
                new VariableVisitor(inst.classicFor().forExpression(1), aliveVariables, deadVariables);
            }
        }

        getAliveDeadVariablesControlStructureBody(inst.controlStructureBody());

        if (inst.classicFor() != null) {
            if (inst.classicFor().expression() != null)
                new VariableVisitor(inst.classicFor().expression(), aliveVariables, deadVariables);
            if (inst.classicFor().forExpression().size() == 1) {
                if (inst.classicFor().getText().indexOf(';') != 0)
                    new VariableVisitor(inst.classicFor().forExpression(0), aliveVariables, deadVariables);
            } else if (inst.classicFor().forExpression().size() == 2) {
                new VariableVisitor(inst.classicFor().forExpression(0), aliveVariables, deadVariables);
            }
        } else {
            new VariableVisitor(inst.forEach(), aliveVariables, deadVariables);
        }
    }

    public void getAliveDeadVariablesControlStructure (CPPParser.InstructionContext inst) {
        if (inst.forBlock() != null) {
            getAliveDeadVariablesFor(inst.forBlock());
        } else if (inst.scope() != null) {
            getAliveDeadVariables(new LinkedList<>(inst.scope().instruction()));
        } else if (inst.ifBlock() != null) {
            inst.ifBlock().controlStructureBody().forEach(
                    body -> getAliveDeadVariablesControlStructureBody(body));
            new VariableVisitor(inst.ifBlock().expression(), aliveVariables, deadVariables);
        } else if (inst.whileBlock() != null) {
            getAliveDeadVariablesControlStructureBody(inst.whileBlock().controlStructureBody());
            new VariableVisitor(inst.whileBlock().expression(), aliveVariables, deadVariables);
        } else if (inst.switchBlock() != null) {
            //TODO switch body
        } else {
            new VariableVisitor(inst.doWhileBlock().expression(), aliveVariables, deadVariables);

            CPPParser.DoWhileBodyContext body = inst.doWhileBlock().doWhileBody();
            if (body.scope() != null)
                getAliveDeadVariables(new LinkedList<>(body.scope().instruction()));
            else if (body.instruction() != null) {
                LinkedList temp = new LinkedList<CPPParser.InstructionContext>();
                temp.add(body.instruction());
                getAliveDeadVariables(temp);
            }
        }
    }

    public void getAliveDeadVariables(LinkedList<CPPParser.InstructionContext> instructions) {
        if (instructions.isEmpty())
            return;
        Iterator<CPPParser.InstructionContext> it = instructions.descendingIterator();
        while (it.hasNext()) {
            CPPParser.InstructionContext next = it.next();
            if (isScope(next))
                getAliveDeadVariablesControlStructure(next);
            else
                new VariableVisitor(next, aliveVariables, deadVariables);
        }
    }

    public void getAliveDeadVariables() {
        this.aliveVariables = new HashSet<>();
        this.deadVariables = new HashSet<>();
        getAliveDeadVariables(this.instructions);
    }

    private boolean isScope(CPPParser.InstructionContext inst) {
        return inst.forBlock() != null || inst.whileBlock() != null || inst.doWhileBlock() != null
                || inst.scope() != null  || inst.ifBlock() != null || inst.switchBlock() != null;
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

    public String getText(int tabs) {
        String prefix = "";
        while (tabs-- > 0) prefix = prefix + "\t";
        StringBuilder builder = new StringBuilder();
        String finalPrefix = prefix;
        instructions.forEach(inst -> builder.append(finalPrefix + Translator.getText(inst)));
        return builder.toString();
    }
}
