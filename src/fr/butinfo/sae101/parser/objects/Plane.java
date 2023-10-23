package fr.butinfo.sae101.parser.objects;

public class Plane extends SceneObject {
    private Triplet normal;

    public Plane(Triplet position, Triplet normal, Triplet diffuseColor, Triplet specularColor) {
        super(position, diffuseColor, specularColor);
        this.normal = normal.normalize();
    }

}
