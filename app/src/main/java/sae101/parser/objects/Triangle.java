package sae101.parser.objects;

import sae101.parser.scene.SceneObjects;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Triplet;
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
    public boolean isPointInsideTriangle(Point p) {
        Vector edge1 = new Vector(vertex2.getCoor()).sub(new Vector(vertex1.getCoor()));
        Vector edge2 = new Vector(vertex3.getCoor()).sub(new Vector(vertex1.getCoor()));
        Vector n = edge1.vectorProduct(edge2).normalize();

        Vector ap = new Vector(p.getCoor()).sub(new Vector(vertex1.getCoor()));
        Vector bp = new Vector(p.getCoor()).sub(new Vector(vertex2.getCoor()));
        Vector cp = new Vector(p.getCoor()).sub(new Vector(vertex3.getCoor()));

        Vector abp = edge1.vectorProduct(ap);
        Vector bcp = edge2.vectorProduct(bp);
        Vector cap = edge1.vectorProduct(cp);

        double abpDotN = abp.scalarProduct(n);
        double bcpDotN = bcp.scalarProduct(n);
        double capDotN = cap.scalarProduct(n);

        return abpDotN >= 0 && bcpDotN >= 0 && capDotN >= 0;
    }
    
}
