package fr.butinfo.sae101.parser.objects;

import fr.butinfo.sae101.triplet.Triplet;

public class Triangle extends SceneObject {
    private Triplet vertex1;
    private Triplet vertex2;
    private Triplet vertex3;
    private Triplet normal;

    public Triangle(Triplet vertex1, Triplet vertex2, Triplet vertex3, Triplet position, Triplet diffuseColor, Triplet specularColor) {
        super(position, diffuseColor, specularColor);
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }
}
