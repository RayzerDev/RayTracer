package sae101.parser.scene;

import sae101.parser.Camera;
import sae101.parser.light.Light;
import sae101.parser.objects.Sphere;
import sae101.triplet.Color;
import sae101.triplet.Point;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Scene.
 */
public class Scene {
    private final File output;
    private final Camera camera;

    private final int height;

    private final int width;

    private final List<Light> light;

    private final List<SceneObjects> sceneobj;

    private final List<Color> colors;

    private final Color ambient;

    private final List<Point> points;

    /**
     * Instantiates a new Scene.
     *
     * @param camera   the camera
     * @param height   the height
     * @param width    the width
     * @param light    the light
     * @param sceneobj the sceneobj
     * @param ambient  the ambient
     * @param output
     */
    public Scene(Camera camera, int height, int width, List<Light> light, List<SceneObjects> sceneobj, Color ambient, List<Point> points, List<Color> colors, File output) {
        this.camera = camera;
        this.height = height;
        this.width = width;
        this.light = light;
        this.sceneobj = sceneobj;
        this.ambient = ambient;
        this.points = points;
        this.colors = colors;
        this.output = output;
    }

    public File getOutput() {
        return output;
    }

    /**
     * Gets camera.
     *
     * @return the camera
     */
    public Camera getCamera() {
        return camera;
    }

    /**
     * Gets light.
     *
     * @return the light
     */
    public List<Light> getLight() {
        return light;
    }

    /**
     * Gets sceneobj.
     *
     * @return the sceneobj
     */
    public List<SceneObjects> getSceneobj() {
        return sceneobj;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    public List<Color> getColors(){
        return colors;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets ambient.
     *
     * @return the ambient
     */
    public Color getAmbient() {
        return ambient;
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

    public List<Sphere> getSphere(){
        List<Sphere> spheres = new ArrayList<>();
        for (SceneObjects objects:sceneobj){
            spheres.add((Sphere) objects);
        }
        return spheres;
    }
}


