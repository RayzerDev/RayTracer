package sae101.parser.objects;

import sae101.parser.scene.SceneObjects;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Vector;


/**
 * The type Plane.
 */
public class Plane extends SceneObjects {
    private Vector normal;

    private Point positionPoint;

    /**
     * Instantiates a new Plane.
     *
     * @param positionPoint the position
     * @param normal        the normal
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     * @param ambient
     */
    public Plane(Point positionPoint, Vector normal, Color diffuseColor, Color specularColor, int shininess, Color ambient) {
        super(diffuseColor, specularColor, ambient, shininess);
        this.positionPoint = positionPoint;
        this.normal = normal.normalize();
    }
}
