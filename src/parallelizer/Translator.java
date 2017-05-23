package parallelizer;

import gen.CPPLexer;
import gen.CPPParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import parallelizer.model.Function;
import visitors.CallGraphVisitor;
import visitors.FunctionVisitor;
import visitors.GlobalVisitor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by milderhc on 12/05/17.
 */
public class Translator {

    public static Program program;

    private void visitFunctions (CPPParser parser) {
        parser.reset();
        ParseTree tree = parser.cpp();
        FunctionVisitor visitor = new FunctionVisitor(program);
        visitor.visit(tree);
    }

    private void buildCallGraph (CPPParser parser) {
        parser.reset();
        ParseTree tree = parser.cpp();
        CallGraphVisitor visitor = new CallGraphVisitor(program);
        visitor.visit(tree);
    }

    private LinkedList<Function> topoSort () {
        Queue<Function> q = new LinkedList<>();
        Map<Function, Integer> degree = new TreeMap<>();
        program.getCallGraph().forEach((f, list) -> degree.put(f, 0));
        program.getCallGraph().forEach((f, list) ->
            list.forEach(current -> degree.put(current, degree.get(current) + 1)));
        program.getCallGraph().forEach((f, list) -> {
            if (degree.get(f) == 0)
                q.add(f);
        });

        LinkedList<Function> order = new LinkedList<>();
        while (!q.isEmpty()) {
            Function f = q.poll();
            order.push(f);
            program.getCallGraph().get(f).forEach(current -> {
                degree.put(current, degree.get(current) - 1);
                if (degree.get(current) == 0)
                    q.add(current);
            });
        }

        return order;
    }

    private void deadCodeElimination (Function current,
                                                        Set<Function> visited, LinkedList<Function> newOrder) {
        visited.add(current);
        program.getCallGraph().get(current).forEach(neigh -> {
            if (!visited.contains(neigh))
                deadCodeElimination(neigh, visited, newOrder);
        });
        newOrder.add(current);
    }

    private LinkedList<Function> deadCodeElimination (LinkedList<Function> order) {
        Set<Function> visited = new TreeSet<>();
        LinkedList<Function> newOrder = new LinkedList<>();

        order.forEach(f -> {
            if (f.getId().equals("main"))
                deadCodeElimination(f, visited, newOrder);
        });

        return newOrder;
    }

    private void findDependencies(LinkedList<Function> functionsOrder ) {
        functionsOrder.forEach( f -> f.findDependencies() );
    }

    private void buildDependencyGraph(LinkedList<Function> functionsOrder) {
        functionsOrder.forEach( f -> f.buildDependencyGraph() );
    }

    private void findIslands(LinkedList<Function> functionsOrder) {
        functionsOrder.forEach( f -> f.findIslands() );
    }

    private void addGlobalStatements (CPPParser parser) {
        parser.reset();
        TokenStream inputStream = parser.getInputStream();
        for (int i = 0; i < inputStream.size(); ++i) {
            Token token = inputStream.get(i);
            if (token.getChannel() == 1) {
                program.add(token.getText() + "\n");
            }
        }

        parser.reset();
        ParseTree tree = parser.cpp();
        GlobalVisitor visitor = new GlobalVisitor(program);
        visitor.visit(tree);
    }

    private void parallelize(LinkedList<Function> functionsOrder) {
        functionsOrder.forEach( f -> program.add(f.parallelize()) );
    }

    public void translate (String inputFilename) throws IOException {
        ANTLRInputStream input;
        if (inputFilename == null)
            input = new ANTLRInputStream(System.in);
        else
            input = new ANTLRInputStream(new FileInputStream(inputFilename));
        CPPLexer lexer = new CPPLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPPParser parser = new CPPParser(tokens);

        program = new Program();

        visitFunctions(parser);
        buildCallGraph(parser);
        LinkedList<Function> functionsOrder = topoSort();

        System.out.println("FUNCTIONS");
        program.getDefinedFunctions().forEach((xd, nothing) -> System.out.println(xd));

        System.out.println("CALLGRAPH");
        program.getCallGraph().forEach((f, neigh) -> {
            System.out.println(f.getId() + " --");
            neigh.forEach(n -> System.out.print(n.getId()));
            System.out.println();
        });

        System.out.println("ORDER");
        functionsOrder.forEach(current -> System.out.println(current.getId()) );

        System.out.println();
        functionsOrder.forEach( f -> {
            f.buildFlowGraph();
        });

        System.out.println();
        findDependencies(functionsOrder);

        functionsOrder = deadCodeElimination(functionsOrder);

        functionsOrder.forEach( f -> {
            System.out.println("FUNCTION " + f.getId() );
            System.out.println("FLOW GRAPH");
            f.printFlowGraph();
        });


        buildDependencyGraph(functionsOrder);

        System.out.println("\nDEPENDENCY GRAPHS");
        functionsOrder.forEach( f -> {
            System.out.println("FUNCTION " + f.getId());
            System.out.println("DEPENDENCY GRAPH");
            f.printDependencyGraph();
        });

        findIslands(functionsOrder);

        System.out.println("BLOCKS ORDER");
        functionsOrder.forEach(f -> {
            System.out.println("FUNCTION " + f.getId());
            System.out.println("BLOCKS ORDER");
            f.getBlocksOrder().forEach(xd -> {
                System.out.println(xd.getKey().getId() + " in island " + xd.getValue());
            });
            System.out.println();
        });

        addGlobalStatements(parser);

        parallelize(functionsOrder);

        program.exportCode("output.cpp");
    }

    public static String getText (ParserRuleContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        return ctx.start.getInputStream().getText(interval) + "\n";
    }

    public static void main(String[] args) throws IOException {
//        String source = "input-code/DanielK/782D.cpp";
        String source = "input-code/Examples/task_parallelization.cpp";

        Translator translator = new Translator();
        translator.translate(source);


    }
}
