package sae101.parser.scene;

import sae101.parser.Camera;
import sae101.parser.light.Light;
import sae101.parser.objects.SceneObject;

import java.util.ArrayList;
import java.util.List;

public class SceneBuilder implements Builder{
    private Camera camera;

    private float height;

    private float width;

    private List<Light> lights= new ArrayList<>();

    private List<SceneObject> sceneObjs= new ArrayList<>();

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
    public void addObject(SceneObject sceneObj) {
        sceneObjs.add(sceneObj);
    }

    @Override
    public Scene build() {
        return new Scene(camera,height,width,lights,sceneObjs);
    }
}
