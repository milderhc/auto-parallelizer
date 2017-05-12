import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 * Created by milderhc on 12/05/17.
 */
public class Program {

    private StringBuilder translatedCode;
    public static final String OUTPUT_CODE_FOLDER = "output-code";

    private TreeMap<Variable, LinkedList<Variable>> flowGraph;

    public Program () {
        translatedCode = new StringBuilder();
        flowGraph = new TreeMap<>();
    }

    public void add (String newContent) {
        translatedCode.append(newContent);
    }

    public String getTranslatedCode() {
        return translatedCode.toString();
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
}
