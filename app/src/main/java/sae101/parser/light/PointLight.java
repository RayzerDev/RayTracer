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
    Point point;

    /**
     * Instantiates a new Point light.
     *
     * @param point the point
     * @param color the color
     */
    public PointLight(Point point, Color color){
        super(color);
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
    public Vector getLdir(Point p){
        return p.sub(point);
    }
}
