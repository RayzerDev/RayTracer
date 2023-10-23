package sae101.triplet;

/**
 * The type Point.
 */
public class Point {
    private Triplet coor;

    /**
     * Instantiates a new Point.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public Point(double x, double y, double z){
        coor = new Triplet(x,y,z);
    }

    /**
     * Instantiates a new Point.
     *
     * @param coor the coor
     */
    public Point(Triplet coor){
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
     * Sub vector.
     *
     * @param point the point
     * @return the vector
     */
    public Vector sub(Point point){
        return new Vector(coor.sub(point.getCoor()));
    }

    /**
     * Multiply point.
     *
     * @param scalar the scalar
     * @return the point
     */
    public Point multiply(double scalar){
        return new Point(coor.multiply(scalar));
    }

    @Override
    public String toString() {
        return coor.toString();
    }

}
