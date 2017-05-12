import gen.CPPLexer;
import gen.CPPParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by milderhc on 12/05/17.
 */
public class Translator {
    public void translate (String inputFilename) throws IOException {
        ANTLRInputStream input;
        if (inputFilename == null)
            input = new ANTLRInputStream(System.in);
        else
            input = new ANTLRInputStream(new FileInputStream(inputFilename));
        CPPLexer lexer = new CPPLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPPParser parser = new CPPParser(tokens);
        ParseTree tree = parser.cpp();

        CPPVisitor visitor = new CPPVisitor();

        Program program = visitor.getProgram();

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

    public static void main(String[] args) throws IOException {
        String source = "input-code/niquefa_diego/754A.cpp";

        Translator translator = new Translator();
        translator.translate(source);


    }
}
