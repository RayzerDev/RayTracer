package fr.butinfo.sae101.parser.scene;

import fr.butinfo.sae101.parser.Camera;
import fr.butinfo.sae101.parser.light.Light;

import java.util.ArrayList;
import java.util.List;

public class SceneBuilder implements Builder{
    private Camera camera;

    private float height;

    private float width;

    private List<Light> lights= new ArrayList<>();

    private List<SceneObjects> sceneObjs= new ArrayList<>();

    @Override
    public void setCamera(Camera camera) {
        this.camera=camera;
    }

    @Override
    public void setDimensions(float height, float width) {
        this.height=height;
        this.width=width;
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
        return new Scene(camera,height,width,lights,sceneObjs);
    }
}
