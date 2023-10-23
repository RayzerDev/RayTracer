package fr.butinfo.sae101.triplet;

public class Triplet {
    private double x;
    private double y;
    private double z;

    public Triplet(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Triplet add(Triplet trip){
        return new Triplet(getX() + trip.getX(),
                getY() + trip.getY(),
                getZ() + trip.getZ());
    }
    public Triplet sub(Triplet trip){
        return new Triplet(getX() - trip.getX(),
                getY() - trip.getY(),
                getZ() - trip.getZ());
    }
    public Triplet multiply(double scalar) {
        return new Triplet(getX() * scalar,
                getY() * scalar,
                getZ() * scalar);
    }
    public double scalarProduct(Triplet trip) {
        return getX() * trip.getX() +
                getY() * trip.getY() +
                getZ() * trip.getZ() ;
    }
    public Triplet vectorProduct(Triplet trip){
        return new Triplet(getY() * trip.getZ()
                - getZ() * trip.getY(),

                getZ() * trip.getX()
                - getX() * trip.getZ(),

                getX() * trip.getY()
                - getY() * trip.getX()
                );
    }
    public Triplet schurProduct(Triplet trip){
        return new Triplet(getX() * trip.getX(),
                getY() * trip.getY(),
                getZ() * trip.getZ());
    }
    public double length() {
        return Math.sqrt(Math.pow(getX(),2) +
                Math.pow(getY(),2) +
                Math.pow(getZ(),2)) ;
    }
    public Triplet normalize() {
        return multiply(1/length());
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
