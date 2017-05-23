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

    private static final String HELP_MESSAGE = "\nAuto Parallelizer\n" +
            "\n" +
            "Run the executable file with one or several options\n" +
            "\n" +
            "-i, -input <arg>\tInput file\n" +
            "-o, -output <arg>\tOutput file\n" +
            "-r, -reduction\t\tEnable the for parallelization of reduction operations\n" +
            "-h, -help\t\tPrint this message" + "\n";

    public static void main(String[] args) throws IOException {
        Options options = new Options();
        options.addOption("i", "input", true, "Input file");
        options.addOption("o", "output", true, "Output file");
        options.addOption("r", "reduction", false, "Enable the for parallelization of reduction operations");
        options.addOption("h", "help", false, "Prints this message");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine line = parser.parse(options, args);

            if (line.hasOption("help")) {
                System.out.println(HELP_MESSAGE);
                return;
            }
            if (!line.hasOption("input")) {
                System.err.println("You need to prodive an input file");
                return;
            }

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
