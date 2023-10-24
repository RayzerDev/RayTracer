package sae101.parser.scene;

import sae101.parser.Camera;
import sae101.parser.light.Light;

/**
 * The interface Builder.
 */
public interface Builder {
    /**
     * Sets camera.
     *
     * @param camera the camera
     */
    void setCamera(Camera camera);

    /**
     * Sets dimensions.
     *
     * @param height the height
     * @param width  the width
     */
    void setDimensions(int height, int width);

    /**
     * Add light.
     *
     * @param light the light
     */
    void addLight(Light light);

    /**
     * Add object.
     *
     * @param sceneObj the scene obj
     */
    void addObject(SceneObjects sceneObj);

    /**
     * Build scene.
     *
     * @return the scene
     */
    Scene build();
}
