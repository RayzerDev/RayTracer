package sae101.parser.objects;

import sae101.parser.scene.SceneObjects;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Vector;


public class Triangle extends SceneObjects {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;
    private Vector normal;

    public Triangle(Point vertex1, Point vertex2, Point vertex3, Color diffuseColor, Color specularColor, int shininess, Color ambient) {
        super(diffuseColor, specularColor, ambient, shininess);
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public Point getPTriangle(){
        return null;
    }
}
