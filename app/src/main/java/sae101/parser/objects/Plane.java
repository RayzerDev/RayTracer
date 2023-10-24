package sae101.parser.objects;

import sae101.parser.scene.SceneObjects;
import sae101.triplet.Triplet;


/**
 * The type Plane.
 */
public class Plane extends SceneObjects {
    private Triplet normal;

    private Triplet positionPoint;

    /**
     * Instantiates a new Plane.
     *
     * @param positionPoint      the position
     * @param normal        the normal
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     */
    public Plane(Triplet positionPoint, Triplet normal, Triplet diffuseColor, Triplet specularColor, int shininess) {
        super(diffuseColor, specularColor, shininess);
        this.positionPoint = positionPoint;
        this.normal = normal.normalize();
    }
}
