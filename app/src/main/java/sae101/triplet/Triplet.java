package sae101.triplet;

/**
 * The type Triplet.
 */
public class Triplet {
    private double x;
    private double y;
    private double z;

    /**
     * Instantiates a new Triplet.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public Triplet(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * Sets y.
     *
     * @param y the y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Gets z.
     *
     * @return the z
     */
    public double getZ() {
        return z;
    }

    /**
     * Sets z.
     *
     * @param z the z
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Add triplet.
     *
     * @param trip the trip
     * @return the triplet
     */
    public Triplet add(Triplet trip){
        return new Triplet(getX() + trip.getX(),
                getY() + trip.getY(),
                getZ() + trip.getZ());
    }

    /**
     * Sub triplet.
     *
     * @param trip the trip
     * @return the triplet
     */
    public Triplet sub(Triplet trip){
        return new Triplet(getX() - trip.getX(),
                getY() - trip.getY(),
                getZ() - trip.getZ());
    }

    /**
     * Multiply triplet.
     *
     * @param scalar the scalar
     * @return the triplet
     */
    public Triplet multiply(double scalar) {
        return new Triplet(getX() * scalar,
                getY() * scalar,
                getZ() * scalar);
    }

    /**
     * Scalar product double.
     *
     * @param trip the trip
     * @return the double
     */
    public double scalarProduct(Triplet trip) {
        return getX() * trip.getX() +
                getY() * trip.getY() +
                getZ() * trip.getZ() ;
    }

    /**
     * Vector product triplet.
     *
     * @param trip the trip
     * @return the triplet
     */
    public Triplet vectorProduct(Triplet trip){
        return new Triplet(getY() * trip.getZ()
                - getZ() * trip.getY(),

                getZ() * trip.getX()
                - getX() * trip.getZ(),

                getX() * trip.getY()
                - getY() * trip.getX()
                );
    }

    /**
     * Schur product triplet.
     *
     * @param trip the trip
     * @return the triplet
     */
    public Triplet schurProduct(Triplet trip){
        return new Triplet(getX() * trip.getX(),
                getY() * trip.getY(),
                getZ() * trip.getZ());
    }

    /**
     * Length double.
     *
     * @return the double
     */
    public double length() {
        return Math.sqrt(Math.pow(getX(),2) +
                Math.pow(getY(),2) +
                Math.pow(getZ(),2)) ;
    }

    /**
     * Normalize triplet.
     *
     * @return the triplet
     */
    public Triplet normalize() {
        return multiply(1/length());
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
