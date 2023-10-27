package sae101.parser.scene;

import sae101.parser.Camera;
import sae101.parser.light.Light;
import sae101.triplet.Color;
import sae101.triplet.Point;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Scene builder.
 */
public class SceneBuilder implements Builder{
    private File output;
    private Camera camera;

    private int height;

    private int width;

    private final List<Light> lights= new ArrayList<>();

    private final List<SceneObjects> sceneObjs= new ArrayList<>();

    private Color ambient;

    private Color diffuse;

    private Color specular;

    private int shininess;

    private int maxverts;

    private List<Point> points;

    private List<Color> colors;

    private boolean shadow = false;

    /**
     * Set output.
     *
     * @param output the output
     */
    public void setOutput(File output){
        this.output = output;
    }

    /**
     * Get output file.
     *
     * @return the file
     */
    public File getOutput(){
        return output;
    }

    @Override
    public void setCamera(Camera camera) {
        this.camera=camera;
    }

    @Override
    public void setDimensions(int width, int height) {
        this.height=height;
        this.width=width;
    }

    public boolean getShadow() {
        return shadow;
    }

    public void setShadow(boolean shadow) {
        this.shadow = shadow;
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

    /**
     * Sets maxverts.
     *
     * @param maxverts the maxverts
     */
    public void setMaxverts(int maxverts) {
        points = new ArrayList<>(getMaxverts());
        this.maxverts = maxverts;
    }

    /**
     * Gets maxverts.
     *
     * @return the maxverts
     */
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
     * Gets point.
     *
     * @param index the index
     * @return the point
     */
    public Point getPoint(int index) {
        return points.get(index);
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

    /**
     * Add point.
     *
     * @param point the point
     */
    public void addPoint(Point point){points.add(point);}

    @Override
    public void addObject(SceneObjects sceneObj) {
        sceneObjs.add(sceneObj);
    }

    @Override
    public Scene build() {
        return new Scene(camera,height,width,lights,sceneObjs,ambient, points, colors, output, shadow);
    }
}
