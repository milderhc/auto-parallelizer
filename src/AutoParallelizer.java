import org.apache.commons.cli.*;
import parallelizer.Translator;

import java.io.IOException;

/**
 * Created by milderhc on 22/05/17.
 *
 *
 *
 * This is the main file
 *
 * It takes several arguments and based on that execute the translation process
 */
public class AutoParallelizer {

    public static void main(String[] args) throws IOException {
        Options options = new Options();
        options.addRequiredOption("i", "input", true, "Input file");
        options.addOption("o", "output", true, "Output file");
        options.addOption("r", "reduction", false, "Enable the for parallelization of reduction operations");

        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp( "help", options);

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine line = parser.parse(options, args);
            String input = line.getOptionValue("input");
            String output = line.getOptionValue("output", "parallelized_" + input);
            boolean reduction = line.hasOption("reduction");
            Translator translator = new Translator();
            translator.translate(input, output, reduction);
        }
        catch( ParseException exp ) {
            System.err.println( "Parsing failed.  Reason: " + exp.getMessage() );
        }
    }
}
