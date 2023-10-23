package fr.butinfo.sae101.parser.objects;

import fr.butinfo.sae101.triplet.Triplet;

/**
 * The type Plane.
 */
public class Plane extends SceneObject {
    private Triplet normal;

    /**
     * Instantiates a new Plane.
     *
     * @param position      the position
     * @param normal        the normal
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     */
    public Plane(Triplet position, Triplet normal, Triplet diffuseColor, Triplet specularColor) {
        super(position, diffuseColor, specularColor);
        this.normal = normal.normalize();
    }
}
