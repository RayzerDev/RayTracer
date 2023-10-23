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

    protected Triplet add(Triplet trip){
        return new Triplet(getX()+trip.getX(),
                getY()+trip.getY(),
                getZ()+trip.getZ());
    }
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
