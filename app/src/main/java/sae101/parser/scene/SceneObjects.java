package sae101.parser.scene;

import sae101.parser.Parser;
import sae101.triplet.Triplet;

/**
 * The type Scene object.
 */
public abstract class SceneObjects {
    private Triplet diffuseColor;
    private Triplet specularColor;

    private int shininess;

    SceneBuilder sceneBuilder = new SceneBuilder();

    /**
     * Instantiates a new Scene object.
     *
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     */
    public SceneObjects(Triplet diffuseColor, Triplet specularColor, int shininess) {
        this.diffuseColor = diffuseColor;
        this.specularColor = specularColor;
        this.shininess = shininess;
    }


    /**
     * Gets diffuse color.
     *
     * @return the diffuse color
     */
    public Triplet getDiffuseColor() {
        return diffuseColor;
    }

    /**
     * Gets specular color.
     *
     * @return the specular color
     */
    public Triplet getSpecularColor() {
        return specularColor;
    }

    public int getShininess() {
        return shininess;
    }

    /**
     * Sets diffus color.
     */
    public void setDiffuseColor() {
        this.diffuseColor = Parser.sceneBuilder.getDiffuse().getCoor();
    }

    /**
     * Sets specular color.
     */
    public void setSpecularColor() {
        this.specularColor = Parser.sceneBuilder.getSpecular().getCoor();
    }

    public void setShininess(int shininess) {
        this.shininess = shininess;
    }
}

