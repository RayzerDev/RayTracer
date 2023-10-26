package sae101.parser.light;

import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Vector;

/**
 * The type Directional ligth.
 *
 * @author damien.allaert
 */
public class DirectionalLight extends Light{
    Vector direction;
    /**
     * Instantiates a new Directional ligth.
     *
     * @param direction the vector
     * @param color  the color
     */
    public DirectionalLight(Vector direction, Color color){
        super( color);
        this.direction = direction;
    }

    public Vector getDirection() {
        return direction;
    }

    /**
     * Get ldir vector.
     *
     * @return the vector
     */
    public Vector getLdir(Point p){
        return new Vector(-direction.getCoor().getX(),-direction.getCoor().getY(),-direction.getCoor().getZ()).normalize();
    }

}
