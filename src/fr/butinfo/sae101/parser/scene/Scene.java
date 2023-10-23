package fr.butinfo.sae101.parser.scene;

import fr.butinfo.sae101.parser.Camera;
import fr.butinfo.sae101.parser.light.Light;
import fr.butinfo.sae101.triplet.Color;

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

    private Color ambient;

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
    public Scene(Camera camera, float height, float width, List<Light> light,  List<SceneObjects> sceneobj, Color ambient) {
        this.camera = camera;
        this.height = height;
        this.width = width;
        this.light = light;
        this.sceneobj = sceneobj;
        this.ambient = ambient;
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
}


