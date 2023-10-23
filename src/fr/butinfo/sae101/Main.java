package fr.butinfo.sae101.triplet;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Triplet t1 = new Triplet(1.0, 2.0, 3.0);
        Triplet t2 = new Triplet(4.0, 5.0, 6.0);
        Triplet t3 = new Triplet(2.0, 3.0, 5.0);

        Triplet add = t1.add(t2);
        Triplet sub = t2.sub(t1);
        Triplet mult_sca = t1.multiply(2.0);
        double scalar = t1.scalarProduct(t2);
        Triplet vect_prod = t1.vectorProduct(t2);
        Triplet schur_prod = t1.schurProduct(t2);
        double length = t1.length();
        Triplet norm = t1.normalize();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("Addition: " + add);
        System.out.println("Soustraction: " + sub);
        System.out.println("Multiplication: " + mult_sca);
        System.out.println("Scalaire: " + scalar);
        System.out.println("Produit vectoriel: " + vect_prod);
        System.out.println("Produit Schur: " + schur_prod);
        System.out.println("Longueur: " + length);
        System.out.println("Normalisation: " + norm);

        Vector v1 = new Vector(t1);
        Vector v2 = new Vector(1,4,7);
        Point p1 = new Point(t2);
        Point p2 = new Point(1,5,7);
        Color c1 = new Color(t3);

        System.out.println("Test Point: ");
        System.out.println(p1.sub(p2));
        System.out.println(p2.multiply(2));

        System.out.println("Test Vecteur: ");
        System.out.println(v1.add(p1));
        System.out.println(v1.add(v2));
        System.out.println(v1.sub(v2));
        System.out.println(v1.multiply(2));
        System.out.println(v1.scalarProduct(v2));
        System.out.println(v1.vectorProduct(v2));
        System.out.println(v1.length());
        System.out.println(v1.normalize());
    }
}
