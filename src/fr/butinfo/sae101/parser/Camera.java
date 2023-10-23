package fr.butinfo.sae101.parser;

/**
 * The type Camera.
 * @author anthony.rolland
 */
public class Camera {
    /**
     *
     */
    private Vector lookFrom;

    private Vector lookAt;

    private Vector up;

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
