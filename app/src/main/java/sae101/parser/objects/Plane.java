package sae101.parser.objects;

import sae101.parser.scene.SceneObjects;
import sae101.triplet.Triplet;
import sae101.triplet.Vector;


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

    public Triplet intersect(Vector rayOrigin, Vector rayDirection) {
        Vector qToLookFrom = positionPoint.subtract(rayOrigin);
        double t = qToLookFrom.dotProduct(normal) / rayDirection.dotProduct(normal);
        if (t >= 0) {
            Vector intersectionPoint = rayOrigin.add(rayDirection.multiply(t));
            return new Triplet(intersectionPoint.getX(), intersectionPoint.getY(), intersectionPoint.getZ());
        }
        return null;
    }
}
