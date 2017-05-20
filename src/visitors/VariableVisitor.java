package visitors;

import gen.CPPBaseVisitor;
import gen.CPPParser;
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
        analyze(getText(inst)).forEach(rightId -> {
            deadVariables.remove(rightId);
            aliveVariables.add(rightId);
        });
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

    private List<String> analyze (String text) {
        StringBuilder current = new StringBuilder();
        int cont1 = 0, cont2 = 0;

        List<String> variables = new LinkedList<>();

        for (char c : text.toCharArray()) {
            if (c == '(') {
                ++cont2;
                current = new StringBuilder();
            }
            else if (c == '[') {
                ++cont1;
                current = new StringBuilder();
            }


            if (cont1 > 0 || cont2 > 0) {
                if (c == ')') --cont2;
                else if (c == ']') --cont1;
            } else {
                if ("=!<>+-*/%&|^~ ".indexOf(c) == -1) {
                    if ("0123456789".indexOf(c) == -1 || current.length() > 0)
                        current.append(c);
                } else {
                    if (current.length() > 0) {
                        String id = current.toString();
                        if (!id.equals("or") && !id.equals("and") && !id.equals("xor")) {
                            variables.add(id);
                        }
                        current = new StringBuilder();
                    }
                }
            }
        }
        if (current.length() > 0) {
            String id = current.toString();
            if (!id.equals("or") && !id.equals("and") && !id.equals("xor")) {
                variables.add(id);
            }
        }

        return variables;
    }

    @Override
    public T visitProperDeclaration (CPPParser.ProperDeclarationContext ctx) {
        ctx.id().forEach(id -> {
            deadVariables.add(id.getText());
            aliveVariables.remove(id.getText());
        });

        return visitChildren(ctx);
    }

    @Override
    public T visitProperAssignment (CPPParser.ProperAssignmentContext ctx) {
//        System.out.println("Expression ->>>> " + getText(ctx.expression()));
//        System.out.println("ids");
        analyze(getText(ctx.expression())).forEach(rightId -> {
            deadVariables.remove(rightId);
            aliveVariables.add(rightId);

//            System.out.print(rightId + " ");
        });
        System.out.println();

        return visitChildren(ctx);
    }

    @Override
    public T visitAccessBrackets (CPPParser.AccessBracketsContext access) {
        access.expression().forEach(expr -> {
            analyze(getText(expr)).forEach(rightId -> {
                deadVariables.remove(rightId);
                aliveVariables.add(rightId);
            });
        });

        return null;
    }

    @Override
    public T visitAssignment (CPPParser.AssignmentContext ctx) {
        if (ctx.properAssignment().assignmentOp(0).getText().equals("=")) {
            String leftId = ctx.callSomething().id().getText();
            aliveVariables.remove(leftId);
            deadVariables.add(leftId);
        }

        return visitChildren(ctx);
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
                ctx.callFunction().functionArguments().expression().forEach( expr -> {
                    analyze(getText(expr)).forEach(rightId -> {
                        deadVariables.remove(rightId);
                        aliveVariables.add(rightId);
                    });
                });
            }
        } else if (ctx.increaseOp() != null) {
            analyze(getText(ctx)).forEach(rightId -> {
                deadVariables.remove(rightId);
                aliveVariables.add(rightId);
            });
        }

        return visitChildren(ctx);
    }

    @Override
    public T visitExpression (CPPParser.ExpressionContext ctx) {
        if (ctx.unOp2() != null && ctx.unOp2().increaseOp() != null) {
            analyze(getText(ctx)).forEach(rightId -> {
                deadVariables.remove(rightId);
                aliveVariables.add(rightId);
            });
        }

        return null;
    }
}
