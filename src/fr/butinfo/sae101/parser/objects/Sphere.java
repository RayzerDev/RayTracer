package fr.butinfo.sae101.parser.objects;

import fr.butinfo.sae101.parser.scene.SceneObjects;
import fr.butinfo.sae101.triplet.Triplet;

public class Sphere extends SceneObjects {
    private double radius;

    public Sphere(Triplet position, double radius, Triplet diffuseColor, Triplet specularColor, int shininess) {
        super(position, diffuseColor, specularColor, shininess);
        this.radius = radius;
    }
}



