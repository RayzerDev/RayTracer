package fr.butinfo.sae101.triplet;

public class Vector {
    private Triplet coor;

    public Vector(double x, double y, double z){
        coor = new Triplet(x,y,z);
    }
    public Vector(Triplet coor){
        this.coor = coor;
    }

    public Triplet getCoor() {
        return coor;
    }

    public void setCoor(Triplet coor) {
        this.coor = coor;
    }

    protected Point add(Point point){
        return new Point(coor.add(point.getCoor()));
    }

    protected Vector add(Vector vector){
        return new Vector(coor.add(vector.getCoor()));
    }

    @Override
    public String toString() {
        return coor.toString();
    }
}
