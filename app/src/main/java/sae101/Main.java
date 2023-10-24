package sae101;

import sae101.parser.Parser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) throws IOException {
        Path resourceDirectory = Paths.get("src","main","resources","figures");
        String path = resourceDirectory.toFile().getAbsolutePath() + "/" + args[0];

        Parser pars = new Parser(path);
    }
}