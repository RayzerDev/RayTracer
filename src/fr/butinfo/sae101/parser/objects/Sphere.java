package fr.butinfo.sae101.parser.objects;

public class Sphere extends SceneObject {
    private double radius;

    public Sphere(Triplet position, double radius, Triplet diffuseColor, Triplet specularColor) {
        super(position, diffuseColor, specularColor);
        this.radius = radius;
    }
}



