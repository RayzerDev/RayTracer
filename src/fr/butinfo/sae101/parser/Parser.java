package fr.butinfo.sae101.parser;

import fr.butinfo.sae101.parser.scene.SceneBuilder;
import fr.butinfo.sae101.parser.scene.Scene;
import fr.butinfo.sae101.triplet.Color;
import fr.butinfo.sae101.triplet.Triplet;
import fr.butinfo.sae101.triplet.Vector;

import java.io.*;
import java.util.InputMismatchException;
import java.util.concurrent.atomic.AtomicInteger;

public class Parser {

    public static SceneBuilder sceneBuilder = new SceneBuilder();

    private File file;

    private BufferedReader in;

    public Parser(String path) throws FileNotFoundException {
        this.file = new File(path);
        this.in = new BufferedReader(new FileReader(file));
    }

    public Scene build() throws IOException {
        in.lines().forEach((line)->{
            String[] lineSplit = line.split(" ");
            switch (lineSplit[0]){

                case "size" -> sceneBuilder.setDimensions(Float.parseFloat(lineSplit[1]),Float.parseFloat(lineSplit[2]));

                case "output" -> new File(lineSplit[1]);

                case "camera" -> sceneBuilder.setCamera(new Camera(new Vector(Double.parseDouble(lineSplit[1]),Double.parseDouble(lineSplit[2]),Double.parseDouble(lineSplit[3])),
                                new Vector(Double.parseDouble(lineSplit[4]),Double.parseDouble(lineSplit[5]),Double.parseDouble(lineSplit[6])),
                                new Vector(Double.parseDouble(lineSplit[7]),Double.parseDouble(lineSplit[8]),Double.parseDouble(lineSplit[9])),
                                Integer.parseInt(lineSplit[10]
                                )));

                case "ambient" -> sceneBuilder.setAmbient(new Color(new Triplet(Double.parseDouble(lineSplit[1]),Double.parseDouble(lineSplit[2]),Double.parseDouble(lineSplit[3]))));

                case "diffuse" -> {
                    if(sceneBuilder.getAmbient().getCoor().getX() + Double.parseDouble(lineSplit[1]) > 1 || sceneBuilder.getAmbient().getCoor().getY() + Double.parseDouble(lineSplit[2]) > 1 || sceneBuilder.getAmbient().getCoor().getZ() + Double.parseDouble(lineSplit[3]) > 1){
                        throw new InputMismatchException();
                    }
                    sceneBuilder.setDiffuse(new Color(new Triplet(Double.parseDouble(lineSplit[1]),Double.parseDouble(lineSplit[2]),Double.parseDouble(lineSplit[3]))));

                }


            }



        });
        return sceneBuilder.build();
    }
}
