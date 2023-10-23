package sae101.triplet;

/**
 * The type Color.
 */
public class Color {
    private Triplet coor;

    /**
     * Instantiates a new Color.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public Color(double x, double y, double z){
        coor = new Triplet(x,y,z);
    }

    /**
     * Instantiates a new Color.
     *
     * @param coor the coor
     */
    public Color(Triplet coor){
        this.coor = coor;
    }

    /**
     * Gets coor.
     *
     * @return the coor
     */
    public Triplet getCoor() {
        return coor;
    }

    /**
     * Sets coor.
     *
     * @param coor the coor
     */
    public void setCoor(Triplet coor) {
        this.coor = coor;
    }

    /**
     * Add color.
     *
     * @param color the color
     * @return the color
     */
    public Color add(Color color){
        return new Color(getCoor().add(color.getCoor()));
    }

    /**
     * Multiply color.
     *
     * @param scalar the scalar
     * @return the color
     */
    public Color multiply(double scalar){
        return new Color(getCoor().multiply(scalar));
    }

    /**
     * Schur product color.
     *
     * @param color the color
     * @return the color
     */
    public Color schurProduct(Color color){
        return new Color(getCoor().schurProduct(color.getCoor()));
    }

    @Override
    public String toString() {
        return coor.toString();
    }

}
