package sae101.parser.light;
import sae101.triplet.Point;
import sae101.triplet.Color;
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
}
