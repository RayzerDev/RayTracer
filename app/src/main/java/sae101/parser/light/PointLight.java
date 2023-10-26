package sae101.parser.light;

import sae101.raytracer.RayTracer;
import sae101.triplet.Point;
import sae101.triplet.Color;
import sae101.triplet.Vector;

/**
 * The type Point light.
 *
 * @author damien.allaert
 */
public class PointLight extends Light{

    /**
     * The Point.
     */
    Point point = null;

    /**
     * Instantiates a new Point light.
     *
     * @param point the point
     * @param color the color
     */
    public PointLight(Point point, Color color){
        super(point.getCoor(), color);
        this.point = point;
    }

    /**
     * Get point point.
     *
     * @return the point
     */
    public Point getPoint(){
        return point;
    }

    /**
     * Get ldir vector.
     *
     * @return the vector
     */
    public Vector getLdir(){
        return new Vector(getCoordinate().sub(RayTracer.getP((int) point.getCoor().getX(),
                (int)point.getCoor().getY()).getCoor()).normalize());
    }
}
