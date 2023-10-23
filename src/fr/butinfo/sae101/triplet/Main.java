package fr.butinfo.sae101.triplet;

public class Main {
    public static void main(String[] args) {
        Triplet t1 = new Triplet(1.0, 2.0, 3.0);
        Triplet t2 = new Triplet(4.0, 5.0, 6.0);

        Triplet addition = t1.add(t2);
        Triplet sub = t2.sub(t1);
        System.out.println(t1);
        System.out.println(t2);

        System.out.println(addition);
        System.out.println(sub);
    }
}
