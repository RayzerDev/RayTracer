package fr.butinfo.sae101.triplet;

public class Point {
    private Triplet coor;

    public Point(double x, double y, double z){
        coor = new Triplet(x,y,z);
    }

    public Triplet getCoor() {
        return coor;
    }

    public void setCoor(Triplet coor) {
        this.coor = coor;
    }

}
