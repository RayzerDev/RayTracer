package sae101.parser.objects;

import sae101.parser.scene.SceneObjects;
import sae101.triplet.Triplet;


public class Triangle extends SceneObjects {
    private Triplet vertex1;
    private Triplet vertex2;
    private Triplet vertex3;
    private Triplet normal;

    public Triangle(Triplet vertex1, Triplet vertex2, Triplet vertex3, Triplet diffuseColor, Triplet specularColor, int shininess) {
        super(diffuseColor, specularColor, shininess);
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }
}
