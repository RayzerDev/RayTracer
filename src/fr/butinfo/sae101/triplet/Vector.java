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

    public Point add(Point point){
        return new Point(coor.add(point.getCoor()));
    }

    public Vector add(Vector vector){
        return new Vector(coor.add(vector.getCoor()));
    }

    public Vector sub(Vector vector){
        return new Vector(coor.sub(vector.getCoor()));
    }

    public Vector multiply(double scalar){
        return new Vector(coor.multiply(scalar));
    }

    public double scalarProduct(Vector vector){
        return coor.scalarProduct(vector.getCoor());
    }

    public Vector vectorProduct(Vector vector){
        return new Vector(coor.vectorProduct(vector.getCoor()));
    }

    public double length(){
        return coor.length();
    }

    public Vector normalize(){
        return new Vector(coor.normalize());
    }

    @Override
    public String toString() {
        return coor.toString();
    }
}
