package sae101.parser.scene;

import sae101.parser.Camera;
import sae101.parser.light.Light;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.parser.scene.Scene;
import sae101.parser.scene.SceneObjects;

import java.util.ArrayList;
import java.util.List;

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

    private Color specular;

    private int shininess;

    private int maxverts;

    private List<Point> points;

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
     * Sets specular.
     *
     * @param specular the specular
     */
    public void setSpecular(Color specular) {
        this.specular = specular;
    }

    /**
     * Sets shininess.
     *
     * @param shininess the shininess
     */
    public void setShininess(int shininess) {
        this.shininess = shininess;
    }

    public void setMaxverts(int maxverts) {
        points = new ArrayList<>(getMaxverts());
        this.maxverts = maxverts;
    }

    public int getMaxverts() {
        return maxverts;
    }

    /**
     * Gets shininess.
     *
     * @return the shininess
     */
    public int getShininess() {
        return shininess;
    }

    /**
     * Gets specular.
     *
     * @return the specular
     */
    public Color getSpecular() {
        return specular;
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

    public void addPoint(Point point){points.add(point);}

    @Override
    public void addObject(SceneObjects sceneObj) {
        sceneObjs.add(sceneObj);
    }

    @Override
    public Scene build() {
        return new Scene(camera,height,width,lights,sceneObjs,ambient, points);
    }
}
