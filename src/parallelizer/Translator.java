package parallelizer;

import gen.CPPLexer;
import gen.CPPParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parallelizer.model.Function;
import visitors.CPPVisitor;
import visitors.CallGraphVisitor;
import visitors.FunctionVisitor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created by milderhc on 12/05/17.
 */
public class Translator {

    public static Program program;

    private void visitFunctions (CPPParser parser) {
        ParseTree tree = parser.cpp();
        FunctionVisitor visitor = new FunctionVisitor(program);
        visitor.visit(tree);
    }


    private void temp (CPPParser parser) throws FileNotFoundException, UnsupportedEncodingException {
        ParseTree tree = parser.cpp();

        CPPVisitor visitor = new CPPVisitor();
        program = visitor.getProgram();

        TokenStream inputStream = parser.getInputStream();
        for (int i = 0; i < inputStream.size(); ++i) {
            Token token = inputStream.get(i);
            if (token.getChannel() == 1) {
                program.add(token.getText() + "\n");
            }
        }

        visitor.visit(tree);
        visitor.getProgram().exportCode("output.cpp");
    }

    private void buildCallGraph (CPPParser parser) {
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
        parser.reset();
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
        functionsOrder.forEach(current -> System.out.println(current.getId()));
    }

    public static void main(String[] args) throws IOException {
//        String source = "input-code/DanielK/782D.cpp";
        String source = "input-code/input.cpp";

        Translator translator = new Translator();
        translator.translate(source);


    }
}
