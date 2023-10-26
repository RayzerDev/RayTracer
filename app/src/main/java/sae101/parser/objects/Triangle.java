package sae101.parser.objects;

import sae101.parser.scene.SceneObjects;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Vector;


/**
 * The type Triangle.
 */
public class Triangle extends SceneObjects {
    private final Point vertex1;
    private final Point vertex2;
    private final Point vertex3;
    private Vector normal;

    /**
     * Instantiates a new Triangle.
     *
     * @param vertex1       the vertex 1
     * @param vertex2       the vertex 2
     * @param vertex3       the vertex 3
     * @param diffuseColor  the diffuse color
     * @param specularColor the specular color
     * @param shininess     the shininess
     * @param ambient       the ambient
     */
    public Triangle(Point vertex1, Point vertex2, Point vertex3, Color diffuseColor, Color specularColor, int shininess, Color ambient) {
        super(diffuseColor, specularColor, ambient, shininess);
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    /**
     * Get p triangle point.
     *
     * @return the point
     */
    public Vector getNTriangle(){
        return (vertex2.sub(vertex1).multiply(vertex3.sub(vertex1).length()).normalize());
    }
}
