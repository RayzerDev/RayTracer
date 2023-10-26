package sae101.parser.light;

import sae101.triplet.Color;
import sae101.triplet.Triplet;
import sae101.triplet.Vector;

/**
 * The type Light.
 *
 * @author damien.allaert
 */
public abstract class Light {

    private Triplet coordinate;

    private Color color;

    /**
     * Instantiates a new Light.
     *
     * @param coordinate the coordinate
     * @param color      the color
     */
    protected Light(Triplet coordinate, Color color){
        this.coordinate = coordinate;
        this.color = color;
    }

    /**
     * Gets coordinate.
     *
     * @return the coordinate
     */
    public Triplet getCoordinate() {
        return coordinate;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets coordinate.
     *
     * @param coordinate the coordinate
     */
    public void setCoordinate(Triplet coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public Vector getLdir(){
        return null;
    };
}
