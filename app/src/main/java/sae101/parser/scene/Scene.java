package sae101.parser.scene;

import sae101.parser.Camera;
import sae101.parser.light.Light;
import sae101.triplet.Color;
import sae101.triplet.Point;

import java.util.List;

/**
 * The type Scene.
 */
public class Scene {
    private Camera camera;

    private float height;

    private float width;

    private List<Light> light;

    private List<SceneObjects> sceneobj;

    private Color ambient;

    private List<Point> points;

    /**
     * Instantiates a new Scene.
     *
     * @param camera   the camera
     * @param height   the height
     * @param width    the width
     * @param light    the light
     * @param sceneobj the sceneobj
     * @param ambient  the ambient
     */
    public Scene(Camera camera, float height, float width, List<Light> light,  List<SceneObjects> sceneobj, Color ambient, List<Point> points) {
        this.camera = camera;
        this.height = height;
        this.width = width;
        this.light = light;
        this.sceneobj = sceneobj;
        this.ambient = ambient;
        this.points = points;
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
    public float getHeight() {
        return height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public float getWidth() {
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
}


