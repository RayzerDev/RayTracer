package sae101;

import sae101.parser.Parser;
import sae101.parser.scene.Scene;
import sae101.parser.scene.SceneObjects;
import sae101.raytracer.RayTracer;

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
        Scene scene = pars.build();
        RayTracer rt = new RayTracer(scene);
        rt.view();
    }
}