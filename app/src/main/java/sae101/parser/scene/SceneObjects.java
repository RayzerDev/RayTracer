package sae101.parser.scene;

import sae101.parser.Parser;
import sae101.triplet.Color;

/**
 * The type Scene object.
 */
public abstract class SceneObjects {
    private Color diffuseColor;
    private Color specularColor;

    private Color ambient;

    private int shininess;

    /**
     * The Scene builder.
     */
    SceneBuilder sceneBuilder = new SceneBuilder();

    /**
     * Instantiates a new Scene object.
     *
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     * @param ambient       the ambient light
     * @param shininess     the shininess of the light
     */
    protected SceneObjects(Color diffuseColor, Color specularColor, Color ambient, int shininess) {
        this.diffuseColor = diffuseColor;
        this.specularColor = specularColor;
        this.ambient = ambient;
        this.shininess = shininess;
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
     * Sets ambient.
     *
     * @param ambient the ambient
     */
    public void setAmbient(Color ambient) {
        this.ambient = ambient;
    }

    /**
     * Gets diffuse color.
     *
     * @return the diffuse color
     */
    public Color getDiffuseColor() {
        return diffuseColor;
    }

    /**
     * Gets specular color.
     *
     * @return the specular color
     */
    public Color getSpecularColor() {
        return specularColor;
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
     * Sets diffus color.
     */
    public void setDiffuseColor() {
        this.diffuseColor = Parser.sceneBuilder.getDiffuse();
    }

    /**
     * Sets specular color.
     */
    public void setSpecularColor() {
        this.specularColor = Parser.sceneBuilder.getSpecular();
    }

    /**
     * Sets shininess.
     *
     * @param shininess the shininess
     */
    public void setShininess(int shininess) {
        this.shininess = shininess;
    }
}

