package fr.butinfo.sae101.parser.scene;

import fr.butinfo.sae101.parser.Camera;
import fr.butinfo.sae101.parser.light.Light;
import fr.butinfo.sae101.parser.objects.SceneObject;

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
    void setDimensions(float height, float width);

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
