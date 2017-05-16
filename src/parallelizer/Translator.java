package parallelizer;

import gen.CPPLexer;
import gen.CPPParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.CPPVisitor;
import visitors.CallGraphVisitor;
import visitors.FunctionVisitor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

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

        program.getDefinedFunctions().forEach((xd, nothing) -> System.out.println(xd));

        program.getCallGraph().forEach((f, neigh) -> {
            System.out.println(f.getId() + " --");
            neigh.forEach(n -> System.out.print(n.getId()));
            System.out.println();
        });
    }

    public static void main(String[] args) throws IOException {
        String source = "input-code/DanielK/782D.cpp";
//        String source = "input-code/input.cpp";

        Translator translator = new Translator();
        translator.translate(source);


    }
}
