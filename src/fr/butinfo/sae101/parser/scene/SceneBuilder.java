package fr.butinfo.sae101.parser.scene;

import fr.butinfo.sae101.parser.Camera;
import fr.butinfo.sae101.parser.light.Light;
import fr.butinfo.sae101.triplet.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Scene builder.
 */
public class SceneBuilder implements Builder{
    private Camera camera;

    private float height;

    private float width;

    private List<Light> lights= new ArrayList<>();

    private List<SceneObjects> sceneObjs= new ArrayList<>();

    private Color ambient;

    private Color diffuse;

    @Override
    public void setCamera(Camera camera) {
        this.camera=camera;
    }

    @Override
    public void setDimensions(float height, float width) {
        this.height=height;
        this.width=width;
    }

    /**
     * Sets ambient.
     *
     * @param ambient the ambient
     */
    public void setAmbient(Color ambient) {
        this.ambient = ambient;
    }

    /**
     * Sets diffuse.
     *
     * @param diffuse the diffuse
     */
    public void setDiffuse(Color diffuse) {
        this.diffuse = diffuse;
    }

    /**
     * Gets diffuse.
     *
     * @return the diffuse
     */
    public Color getDiffuse() {
        return diffuse;
    }

    /**
     * Gets ambient.
     *
     * @return the ambient
     */
    public Color getAmbient() {
        return ambient;
    }

    /**
     * Get obj scene objects.
     *
     * @param index the index
     * @return the scene objects
     */
    public SceneObjects getObj(int index){
        return sceneObjs.get(index);
    }

    @Override
    public void addLight(Light light) {
        lights.add(light);
    }

    @Override
    public void addObject(SceneObjects sceneObj) {
        sceneObjs.add(sceneObj);
    }

    @Override
    public Scene build() {
        return new Scene(camera,height,width,lights,sceneObjs,ambient);
    }
}
