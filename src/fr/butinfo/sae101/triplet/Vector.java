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

    protected Vector sub(Vector vector){
        return new Vector(coor.sub(vector.getCoor()));
    }

    protected Vector multiply(double scalar){
        return new Vector(coor.multiply(scalar));
    }

    protected double scalarProduct(Vector vector){
        return coor.scalarProduct(vector.getCoor());
    }

    protected Vector vectorProduct(Vector vector){
        return new Vector(coor.vectorProduct(vector.getCoor()));
    }

    @Override
    public String toString() {
        return coor.toString();
    }
}
