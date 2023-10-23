package fr.butinfo.sae101.parser.scene;

import fr.butinfo.sae101.parser.Camera;
import fr.butinfo.sae101.parser.light.Light;

import java.util.ArrayList;
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

    /**
     * Instantiates a new Scene.
     *
     * @param camera   the camera
     * @param height   the height
     * @param width    the width
     * @param light    the light
     * @param sceneobj the sceneobj
     */
    public Scene(Camera camera, float height, float width, List<Light> light,  List<SceneObjects> sceneobj) {
        this.camera = camera;
        this.height = height;
        this.width = width;
        this.light = light;
        this.sceneobj = sceneobj;
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
}


