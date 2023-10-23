package fr.butinfo.sae101.parser.objects;

public abstract class SceneObject {
    private Triplet position;
    private Triplet diffuseColor;
    private Triplet specularColor;

    public SceneObject(Triplet position, Triplet diffuseColor, Triplet specularColor) {
        this.position = position;
        this.diffuseColor = diffuseColor;
        this.specularColor = specularColor;
    }

    public Triplet getPosition() {
        return position;
    }

    public Triplet getDiffuseColor() {
        return diffuseColor;
    }

    public Triplet getSpecularColor() {
        return specularColor;
    }
}

