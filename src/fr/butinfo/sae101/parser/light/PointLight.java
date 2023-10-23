package fr.butinfo.sae101.parser.light;
import fr.butinfo.sae101.triplet.Point;
import fr.butinfo.sae101.triplet.Color;
/**
 * The type Point ligth.
 * @author damien.allaert
 */
public class PointLight extends Light{

    /**
     * Instantiates a new Point ligth.
     *
     * @param point the point
     * @param color the color
     */
    public PointLight(Point point, Color color){
        super(point.getCoor(), color);
    }
}
