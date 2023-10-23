package fr.butinfo.sae101.parser.objects;

import fr.butinfo.sae101.triplet.Triplet;

/**
 * The type Scene object.
 */
public abstract class SceneObject {
    private Triplet position;
    private Triplet diffuseColor;
    private Triplet specularColor;

    /**
     * Instantiates a new Scene object.
     *
     * @param position      the position
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     */
    public SceneObject(Triplet position, Triplet diffuseColor, Triplet specularColor) {
        this.position = position;
        this.diffuseColor = diffuseColor;
        this.specularColor = specularColor;
    }

    /**
     * Gets position.
     *
     * @return the position
     */
    public Triplet getPosition() {
        return position;
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
}

