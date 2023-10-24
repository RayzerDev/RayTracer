package fr.butinfo.sae101.parser.objects;

import fr.butinfo.sae101.parser.scene.SceneObjects;
import fr.butinfo.sae101.triplet.Triplet;

/**
 * The type Plane.
 */
public class Plane extends SceneObjects {
    private Triplet normal;

    /**
     * Instantiates a new Plane.
     *
     * @param position      the position
     * @param normal        the normal
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     */
    public Plane(Triplet position, Triplet normal, Triplet diffuseColor, Triplet specularColor, int shininess) {
        super(position, diffuseColor, specularColor, shininess);
        this.normal = normal.normalize();
    }
}
