package sae101.parser.objects;

import sae101.parser.scene.SceneObjects;
import sae101.triplet.Point;
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
     * @param positionPoint the position
     * @param normal        the normal
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     * @param shininess     the shininess
     */
    public Plane(Triplet positionPoint, Triplet normal, Triplet diffuseColor, Triplet specularColor, int shininess) {
        super(diffuseColor, specularColor, shininess);
        this.positionPoint = positionPoint;
        this.normal = normal.normalize();
    }

    /**
     * Caclul p point. The intersect of a point.
     *
     * @param d        the d
     * @param lookFrom the look from
     * @return the point
     */
    public Point caclulP(Vector d, Triplet lookFrom){
        Point p = new Point(positionPoint);
        double up = p.sub(new Point(lookFrom)).scalarProduct(new Vector(normal));
        double down = d.scalarProduct(new Vector(normal));
        if(down == 0){
            return null;
        }
        double t =  up/down;
        Point p2 = new Point(lookFrom.add(d.multiply(t).getCoor()));
        return p2;
    }
}
