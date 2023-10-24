package sae101.triplet;

/**
 * The type Vector.
 */
public class Vector {
    private Triplet coor;

    /**
     * Instantiates a new Vector.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public Vector(double x, double y, double z){
        coor = new Triplet(x,y,z);
    }

    /**
     * Instantiates a new Vector.
     *
     * @param coor the coor
     */
    public Vector(Triplet coor){
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
     * Add point.
     *
     * @param point the point
     * @return the point
     */
    public Point add(Point point){
        return new Point(coor.add(point.getCoor()));
    }

    /**
     * Add vector.
     *
     * @param vector the vector
     * @return the vector
     */
    public Vector add(Vector vector){
        return new Vector(coor.add(vector.getCoor()));
    }

    /**
     * Sub vector.
     *
     * @param vector the vector
     * @return the vector
     */
    public Vector sub(Vector vector){
        return new Vector(coor.sub(vector.getCoor()));
    }

    /**
     * Multiply vector.
     *
     * @param scalar the scalar
     * @return the vector
     */
    public Vector multiply(double scalar){
        return new Vector(coor.multiply(scalar));
    }

    /**
     * Scalar product double.
     *
     * @param vector the vector
     * @return the double
     */
    public double scalarProduct(Vector vector){
        return coor.scalarProduct(vector.getCoor());
    }

    /**
     * Vector product vector.
     *
     * @param vector the vector
     * @return the vector
     */
    public Vector vectorProduct(Vector vector){
        return new Vector(coor.vectorProduct(vector.getCoor()));
    }

    /**
     * Length double.
     *
     * @return the double
     */
    public double length(){
        return coor.length();
    }

    /**
     * Normalize vector.
     *
     * @return the vector
     */
    public Vector normalize(){
        return new Vector(coor.normalize());
    }

    @Override
    public String toString() {
        return coor.toString();
    }
}
