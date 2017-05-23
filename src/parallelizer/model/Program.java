package parallelizer.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by milderhc on 12/05/17.
 */
public class Program {

    private Map<String, Function> definedFunctions;
    private Map<Function, List<Function>> callGraph;

    private Function main;
    private StringBuilder translatedCode;

    public Program () {
        translatedCode = new StringBuilder();
        definedFunctions = new HashMap<>();
        callGraph = new TreeMap<>();
    }

    public void add (String newContent) {
        translatedCode.append(newContent);
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

    public StringBuilder getTranslatedCode() {
        return translatedCode;
    }
}
