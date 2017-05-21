package parallelizer;

import parallelizer.model.Function;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created by milderhc on 12/05/17.
 */
public class Program {

    private Map<String, Function> definedFunctions;
    private Map<Function, List<Function>> callGraph;

    private Function main;

    private StringBuilder translatedCode;
    public static final String OUTPUT_CODE_FOLDER = "output-code";

    public Program () {
        translatedCode = new StringBuilder();
        definedFunctions = new HashMap<>();
        callGraph = new TreeMap<>();
    }

    public void add (String newContent) {
        translatedCode.append(newContent);
    }

    public void exportCode (String file) throws FileNotFoundException, UnsupportedEncodingException {
        String filename = OUTPUT_CODE_FOLDER + "/" + file;
        printToFile(filename, translatedCode.toString());
    }

    public void printToFile (String filename, String s) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(filename, "UTF-8");
        writer.print(s);
        writer.close();
    }

    public Map<String, Function> getDefinedFunctions() {
        return definedFunctions;
    }

    public void setMain(Function main) {
        this.main = main;
    }

    public Map<Function, List<Function>> getCallGraph() {
        return callGraph;
    }

    public Function getMain() {
        return main;
    }
}
