package fr.butinfo.sae101.triplet;

public class Main {
    public static void main(String[] args) {
        Triplet t1 = new Triplet(1.0, 2.0, 3.0);
        Triplet t2 = new Triplet(4.0, 5.0, 6.0);

        Triplet add = t1.add(t2);
        Triplet sub = t2.sub(t1);
        Triplet mult_sca = t1.multiply(2.0);
        double scalar = t1.scalarProduct(t2);
        Triplet vect_prod = t1.vectorProduct(t2);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("Addition: " + add);
        System.out.println("Soustraction: " + sub);
        System.out.println("Multiplication: " + mult_sca);
        System.out.println("Scalaire: " + scalar);
        System.out.println("Produit vectoriel: " + vect_prod);
    }
}
