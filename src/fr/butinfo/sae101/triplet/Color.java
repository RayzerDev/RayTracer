package fr.butinfo.sae101.triplet;

public class Color {
    private Triplet coor;

    public Color(double x, double y, double z){
        coor = new Triplet(x,y,z);
    }

    public Color(Triplet coor){
        this.coor = coor;
    }
    public Triplet getCoor() {
        return coor;
    }

    public void setCoor(Triplet coor) {
        this.coor = coor;
    }

}
