package fr.butinfo.sae101.parser.objects;

import fr.butinfo.sae101.parser.scene.SceneObjects;
import fr.butinfo.sae101.triplet.Triplet;

/**
 * The type Sphere.
 */
public class Sphere extends SceneObjects {
    private double radius;

    /**
     * Instantiates a new Sphere.
     *
     * @param position      the position
     * @param radius        the radius
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     */

    public Sphere(Triplet position, double radius, Triplet diffuseColor, Triplet specularColor, int shininess) {
        super(position, diffuseColor, specularColor, shininess);
        this.radius = radius;
    }
}



