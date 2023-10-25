package sae101.parser.light;
import sae101.parser.Camera;
import sae101.parser.Parser;
import sae101.parser.scene.Scene;
import sae101.raytracer.RayTracer;
import sae101.triplet.Point;
import sae101.triplet.Color;
import sae101.triplet.Vector;

/**
 * The type Point ligth.
 * @author damien.allaert
 */
public class PointLight extends Light{

    Point point = null;

    /**
     * Instantiates a new Point ligth.
     *
     * @param point the point
     * @param color the color
     */
    public PointLight(Point point, Color color){
        super(point.getCoor(), color);
        this.point = point;
    }

    public Point getPoint(){
        return point;
    }

    public Vector getLdir(){
        return null;
    }
}
