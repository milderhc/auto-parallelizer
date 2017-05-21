package visitors;

import gen.CPPBaseVisitor;
import gen.CPPParser;
import javafx.util.Pair;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import parallelizer.Translator;
import parallelizer.model.Function;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by danielk on 5/17/2017.
 */
public class VariableVisitor<T> extends CPPBaseVisitor<T> {

    Set<String> aliveVariables, deadVariables;

    public VariableVisitor(Set<String> aliveVariables, Set<String> deadVariables) {
        this.aliveVariables = aliveVariables;
        this.deadVariables = deadVariables;
    }

    public VariableVisitor(CPPParser.InstructionContext inst, Set<String> aliveVariables, Set<String> deadVariables) {
        this(aliveVariables, deadVariables);
        visitChildren(inst);
    }

    public VariableVisitor(CPPParser.ForExpressionContext inst, Set<String> aliveVariables, Set<String> deadVariables) {
        this(aliveVariables, deadVariables);
        visitChildren(inst);
    }

    public VariableVisitor(CPPParser.ExpressionContext inst, Set<String> aliveVariables, Set<String> deadVariables) {
        this(aliveVariables, deadVariables);
        analyzeExpression(analyze(getText(inst)));
    }

    public VariableVisitor(CPPParser.ForEachContext inst, Set<String> aliveVariables, Set<String> deadVariables) {
        this(aliveVariables, deadVariables);
        visitChildren(inst);
    }

    private String getText (ParserRuleContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        return ctx.start.getInputStream().getText(interval);
    }

    private Pair<List<String>, Integer> analyze (String text) {
        StringBuilder current = new StringBuilder();

        List<String> variables = new LinkedList<>();

        int type = 0;
        for (char c : text.toCharArray()) {
            if (c == '(') {
                current = new StringBuilder();
            }
            else if (c == '[') {
                if (current.length() > 0) {
                    variables.add(current.toString());
                }
                current = new StringBuilder();
            }

            if ("=!<>+-*/%&|^~([]), ".indexOf(c) == -1) {
                if ("0123456789".indexOf(c) == -1 || current.length() > 0)
                    current.append(c);
            } else {
                if (current.length() > 0) {
                    String id = current.toString();
                    if (!id.equals("or") && !id.equals("and") && !id.equals("xor")) {
                        variables.add(id);
                    }

                    if (id.equals("cin")) {
                        type = 1;
                    } else if (id.equals("cout"))
                        type = 2;
                    current = new StringBuilder();
                }
            }
        }
        if (current.length() > 0) {
            String id = current.toString();
            if (!id.equals("or") && !id.equals("and") && !id.equals("xor")) {
                variables.add(id);
            }

            if (id.equals("cin")) {
                type = 1;
            } else if (id.equals("cout"))
                type = 2;
        }

        return new Pair<>(variables, type);
    }

    private void analyzeExpression (Pair<List<String>, Integer> pair) {
        List<String> variable = pair.getKey();
        int type = pair.getValue();
        if (type == 0) {
            variable.forEach(id -> {
//                deadVariables.remove(rightId);
                aliveVariables.add(id);
            });
        } else if (type == 1) {
            variable.forEach(id -> {
                aliveVariables.remove(id);
                deadVariables.add(id);
            });
            aliveVariables.add("cin");
        } else if (type == 2) {
            variable.forEach(id -> {
//                deadVariables.remove(id);
                aliveVariables.add(id);
            });
            deadVariables.add("cout");
        }
    }

    @Override
    public T visitProperDeclaration (CPPParser.ProperDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitProperAssignment (CPPParser.ProperAssignmentContext ctx) {
        analyzeExpression(analyze(getText(ctx.expression())));
        System.out.println();

        return visitChildren(ctx);
    }

    @Override
    public T visitAccessBrackets (CPPParser.AccessBracketsContext access) {
        access.expression().forEach(expr -> {
            analyzeExpression(analyze(getText(expr)));
        });

        return null;
    }

    @Override
    public T visitAssignment (CPPParser.AssignmentContext ctx) {
        if (ctx.properAssignment().assignmentOp(0).getText().equals("=")) {
            String leftId = ctx.callSomething().id().getText();
            aliveVariables.remove(leftId);
            deadVariables.add(leftId);
        } else {
            String leftId = ctx.callSomething().id().getText();
//            deadVariables.remove(leftId);
            aliveVariables.add(leftId);
        }

        return visitChildren(ctx);
    }

    @Override
    public T visitCallSomething (CPPParser.CallSomethingContext ctx) {
        if( ctx.callFunction() != null ) {
            String name = Function.getVirtualName(ctx);
            if( Translator.program.getDefinedFunctions().containsKey(name) ) {
                Function f = Translator.program.getDefinedFunctions().get(name);
                System.out.println(name + " " +f);
                f.getDeadVariables().forEach(var -> {
                    aliveVariables.remove(var);
                    deadVariables.add(var);
                });
                f.getAliveVariables().forEach(var -> {
//                    deadVariables.remove(var);
                    aliveVariables.add(var);
                });
            }
            if( ctx.callFunction().functionArguments() != null ) {
                ctx.callFunction().functionArguments().expression().forEach( expr -> {
                    analyzeExpression(analyze(getText(expr)));
                });
            }
        } else if (ctx.increaseOp() != null) {
            analyzeExpression(analyze(getText(ctx)));
        }

        return visitChildren(ctx);
    }

    @Override
    public T visitExpression (CPPParser.ExpressionContext ctx) {
        if (ctx.unOp2() != null && ctx.unOp2().increaseOp() != null) {
            analyzeExpression(analyze(getText(ctx)));
        }

        return null;
    }
}
