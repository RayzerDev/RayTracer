package sae101.parser;

import sae101.parser.light.*;
import sae101.parser.objects.Sphere;
import sae101.parser.objects.Triangle;
import sae101.parser.scene.*;
import sae101.triplet.*;

import java.io.*;
import java.util.InputMismatchException;


/**
 * The type Parser.
 */
public class Parser {

    /**
     * The constant sceneBuilder.
     */
    public static SceneBuilder sceneBuilder = new SceneBuilder();

    private final BufferedReader in;

    /**
     * Instantiates a new Parser.
     *
     * @param path the path
     * @throws FileNotFoundException the file not found exception
     */
    public Parser(String path) throws FileNotFoundException {
        File file = new File(path);
        this.in = new BufferedReader(new FileReader(file));
    }

    /**
     * Build scene.
     *
     * @return the scene
     * @throws IOException the io exception
     */
    public Scene build() throws IOException {
        sceneBuilder.setSpecular(new Color(0,0,0));
        in.lines().forEach(line->{
            String[] lineSplit = line.split(" ");
            switch (lineSplit[0]){

                case "size" -> sceneBuilder.setDimensions(Integer.parseInt(lineSplit[1]),Integer.parseInt(lineSplit[2]));

                case "output" -> sceneBuilder.setOutput(new File(lineSplit[1]));

                case "camera" -> sceneBuilder.setCamera(new Camera(new Point(Double.parseDouble(lineSplit[1]),Double.parseDouble(lineSplit[2]),Double.parseDouble(lineSplit[3])),
                                new Point(Double.parseDouble(lineSplit[4]),Double.parseDouble(lineSplit[5]),Double.parseDouble(lineSplit[6])),
                                new Vector(Double.parseDouble(lineSplit[7]),Double.parseDouble(lineSplit[8]),Double.parseDouble(lineSplit[9])),
                                Integer.parseInt(lineSplit[10]
                                )));

                case "ambient" -> sceneBuilder.setAmbient(new Color(new Triplet(Double.parseDouble(lineSplit[1]),Double.parseDouble(lineSplit[2]),Double.parseDouble(lineSplit[3]))));

                case "diffuse" -> {
                    if(sceneBuilder.getAmbient() != null && (sceneBuilder.getAmbient().getCoor().getX() + Double.parseDouble(lineSplit[1]) > 1 || sceneBuilder.getAmbient().getCoor().getY() + Double.parseDouble(lineSplit[2]) > 1 || sceneBuilder.getAmbient().getCoor().getZ() + Double.parseDouble(lineSplit[3]) > 1)){
                        throw new InputMismatchException();
                    }
                    sceneBuilder.setDiffuse(new Color(new Triplet(Double.parseDouble(lineSplit[1]),Double.parseDouble(lineSplit[2]),Double.parseDouble(lineSplit[3]))));

                }

                case "specular" -> sceneBuilder.setSpecular(new Color(new Triplet(Double.parseDouble(lineSplit[1]),Double.parseDouble(lineSplit[2]),Double.parseDouble(lineSplit[3]))));

                case "shininess" -> sceneBuilder.setShininess(Integer.parseInt(lineSplit[1]));

                case "directional" -> {
                    DirectionalLight light = new DirectionalLight(
                            new Vector(Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3])),
                            new Color(new Triplet(Double.parseDouble(lineSplit[4]), Double.parseDouble(lineSplit[5]), Double.parseDouble(lineSplit[6])))
                    );
                    if(light.getColor().getCoor().getX() > 1 || light.getColor().getCoor().getY() > 1 || light.getColor().getCoor().getZ() > 1){
                        throw new InputMismatchException();
                    }
                    sceneBuilder.addLight(light);
                }

                case "point" -> {
                    PointLight light = new PointLight(
                            new Point(Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3])),
                            new Color(new Triplet(Double.parseDouble(lineSplit[4]), Double.parseDouble(lineSplit[5]), Double.parseDouble(lineSplit[6]))
                            ));
                    if(light.getColor().getCoor().getX() > 1 || light.getColor().getCoor().getY() > 1 || light.getColor().getCoor().getZ() > 1){
                        throw new InputMismatchException();
                    }
                    sceneBuilder.addLight(light);
                }

                case "maxverts" -> sceneBuilder.setMaxverts(Integer.parseInt(lineSplit[1]));

                case "vertex" -> sceneBuilder.addPoint(new Point(Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3])));

                case "tri" -> {
                    sceneBuilder.addObject(new Triangle(
                            sceneBuilder.getPoint(Integer.parseInt(lineSplit[1])),
                            sceneBuilder.getPoint(Integer.parseInt(lineSplit[2])),
                            sceneBuilder.getPoint(Integer.parseInt(lineSplit[3])),
                            sceneBuilder.getDiffuse(),
                            sceneBuilder.getSpecular(),
                            sceneBuilder.getShininess(),
                            sceneBuilder.getAmbient()));

                }

                case "sphere" -> sceneBuilder.addObject(
                        new Sphere(new Point(Double.parseDouble(lineSplit[1]),
                                Double.parseDouble(lineSplit[2]),
                                Double.parseDouble(lineSplit[3])),
                        Double.parseDouble(lineSplit[4]),
                        sceneBuilder.getDiffuse(),
                        sceneBuilder.getSpecular(),
                        sceneBuilder.getShininess(),
                        sceneBuilder.getAmbient()));
            }

        });
        in.close();
        return sceneBuilder.build();
    }
}
