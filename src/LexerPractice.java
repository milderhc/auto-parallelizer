/**
 * Created by milderhc on 26/02/17.
 */

import gen.CPPLexer;
import gen.CPPParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
//import qb64v1parsing.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class LexerPractice {

    private String inputFilename, outputFilename;

    public void setNewFiles (String inputFilename, String outputFilename) {
        this.inputFilename = inputFilename;
        this.outputFilename = outputFilename;
    }

    public void generateOutput() throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFilename));
        CPPLexer lexer = new CPPLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPPParser parser = new CPPParser(tokens);
        parser.cpp();

        StringBuilder output = new StringBuilder();
        TokenStream inputStream = parser.getInputStream();
        for (int i = 0; i < inputStream.size(); ++i) {
            Token token = inputStream.get(i);
            output.append("<" + token.getText() + "," + token.getLine()
                        + "," + (token.getCharPositionInLine() + 1) + ">");

//            output.append(">>> Error lexico " +
//                    "(linea: " + token.getLine() + ", posicion: " + (token.getCharPositionInLine() + 1) + ")\n");
            output.append("\n");
        }

        PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");
        writer.print(output);
        writer.close();
    }

    public static int SAMPLES = 2;

    public static void main(String[] args) throws Exception {
        LexerPractice lexerPractice = new LexerPractice();

        for (int i = 1; i <= SAMPLES; ++i) {
            String in = "samples/in" + i + ".txt";
            String out = "samples/out" + i + ".txt";
            lexerPractice.setNewFiles(in, out);
            lexerPractice.generateOutput();
        }

    }
}
