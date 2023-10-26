package sae101.parser;

import sae101.parser.scene.Scene;
import sae101.triplet.Vector;

/**
 * The type Camera.
 * @author anthony.rolland
 */
public class Camera {
    /**
     *
     */
    private final Vector lookFrom;

    private final Vector lookAt;

    private final Vector up;

    private int fov;

    /**
     * Instantiates a new Camera.
     *
     * @param lookFrom the look from
     * @param lookAt   the look at
     * @param up       the up
     * @param fov      the fov
     */
    public Camera(Vector lookFrom, Vector lookAt, Vector up, int fov) {
        this.lookFrom = lookFrom;
        this.lookAt = lookAt;
        this.up = up;
        this.fov = fov;
    }

    public Vector getW(){
        return lookFrom.sub(lookAt).normalize();
    }

    public Vector getU(){
        return up.vectorProduct(getW()).normalize();
    }

    public Vector getV(){
        return getW().vectorProduct(getU()).normalize();
    }

    public double getFovR(){
        return ((fov*Math.PI)/180);
    }
    public double getPixelHeight(){
        return  Math.tan(getFovR()/2);
    }

    /**
     * Gets look from.
     *
     * @return the look from
     */
    public Vector getLookFrom() {
        return lookFrom;
    }


    /**
     * Gets look at.
     *
     * @return the look at
     */
    public Vector getLookAt() {
        return lookAt;
    }

    /**
     * Gets up.
     *
     * @return the up
     */
    public Vector getUp() {
        return up;
    }


    /**
     * Gets fov.
     *
     * @return the fov
     */
    public int getFov() {
        return fov;
    }

    /**
     * Sets fov.
     *
     * @param fov the fov
     */
    public void setFov(int fov) {
        this.fov = fov;
    }

    @Override
    public String toString() {
        return "Camera " +
                "eye position : " + lookFrom +
                ", point aim by eye : " + lookAt +
                "eye's up direction : " + up +
                ", field of view : " + fov;
    }

}
