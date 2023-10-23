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

    public Color add(Color color){
        return new Color(getCoor().add(color.getCoor()));
    }

    public Color multiply(double scalar){
        return new Color(getCoor().multiply(scalar));
    }

    public Color schurProduct(Color color){
        return new Color(getCoor().schurProduct(color.getCoor()));
    }

    @Override
    public String toString() {
        return coor.toString();
    }

}
