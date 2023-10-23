package fr.butinfo.sae101.parser.light;

/**
 * The type Light.
 * @author damien.allaert
 */
public abstract class Light {

    private Triplet coordinate;

    private Couleur color;

    /**
     * Instantiates a new Light.
     *
     * @param coordinate the coordinate
     * @param color      the color
     */
    public Light(Triplet coordinate, Couleur color){
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
    public Couleur getColor() {
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
    public void setColor(Couleur color) {
        this.color = color;
    }
}
