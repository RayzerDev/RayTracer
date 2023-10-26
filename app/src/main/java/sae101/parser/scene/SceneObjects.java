package sae101.parser.scene;

import sae101.parser.Parser;
import sae101.triplet.Color;
import sae101.triplet.Triplet;

/**
 * The type Scene object.
 */
public abstract class SceneObjects {
    private Color diffuseColor;
    private Color specularColor;

    private Color ambient;

    private int shininess;

    SceneBuilder sceneBuilder = new SceneBuilder();

    /**
     * Instantiates a new Scene object.
     *
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     * @param ambient
     * @param shininess
     */
    public SceneObjects(Color diffuseColor, Color specularColor, Color ambient, int shininess) {
        this.diffuseColor = diffuseColor;
        this.specularColor = specularColor;
        this.ambient = ambient;
        this.shininess = shininess;
    }

    public Color getAmbient() {
        return ambient;
    }

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

    public void setShininess(int shininess) {
        this.shininess = shininess;
    }
}

