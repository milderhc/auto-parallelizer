import parallelizer.Translator;

import java.io.IOException;

/**
 * Created by milderhc on 22/05/17.
 */
public class AutoParallelizer {

    public static void main(String[] args) throws IOException {
        String source = "input-code/Examples/task_parallelization.cpp";

        Translator translator = new Translator();
        translator.translate(source);
    }
}
