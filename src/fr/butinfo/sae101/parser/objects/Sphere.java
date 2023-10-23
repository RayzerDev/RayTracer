package fr.butinfo.sae101.parser.objects;

import fr.butinfo.sae101.triplet.Triplet;

/**
 * The type Sphere.
 */
public class Sphere extends SceneObject {
    private double radius;

    /**
     * Instantiates a new Sphere.
     *
     * @param position      the position
     * @param radius        the radius
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     */
    public Sphere(Triplet position, double radius, Triplet diffuseColor, Triplet specularColor) {
        super(position, diffuseColor, specularColor);
        this.radius = radius;
    }
}



