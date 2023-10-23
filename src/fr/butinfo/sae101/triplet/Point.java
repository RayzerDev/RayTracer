package fr.butinfo.sae101.triplet;

public class Point {
    private Triplet coor;

    public Point(double x, double y, double z){
        coor = new Triplet(x,y,z);
    }
    public Point(Triplet coor){
        this.coor = coor;
    }
    public Triplet getCoor() {
        return coor;
    }

    public void setCoor(Triplet coor) {
        this.coor = coor;
    }

    protected Vector sub(Point point){
        return new Vector(coor.sub(point.getCoor()));
    }

    @Override
    public String toString() {
        return coor.toString();
    }

}
