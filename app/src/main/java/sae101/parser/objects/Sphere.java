package sae101.parser.objects;

import sae101.parser.scene.SceneObjects;
import sae101.triplet.Triplet;

/**
 * The type Sphere.
 */
public class Sphere extends SceneObjects {
    private double radius;

    private Triplet position;

    /**
     * Instantiates a new Sphere.
     *
     * @param position      the position
     * @param radius        the radius
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     * @param shininess     the shininess
     */
    public Sphere(Triplet position, double radius, Triplet diffuseColor, Triplet specularColor, int shininess) {
        super(diffuseColor, specularColor, shininess);
        this.position = position;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
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
     * Sets position.
     *
     * @param position the position
     */
    public void setPosition(Triplet position) {
        this.position = position;
    }
}



