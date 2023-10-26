package sae101.raytracer;

import sae101.calculColor.LambertColorCal;
import sae101.parser.Camera;
import sae101.parser.objects.Sphere;
import sae101.parser.scene.Scene;
import sae101.shadow.IShadow;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Vector;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * The type Ray tracer.
 */
public class RayTracer {
    private static Scene scene;

    private IShadow request;

    private LambertColorCal lambertColorCal =new LambertColorCal();

    private static int imgHeight;

    private static int imgWidth;

    private static Camera camera;

    /**
     * Instantiates a new Ray tracer.
     *
     * @param scene     the scene
     */
    public RayTracer(Scene scene) {
        this.scene = scene;
        this.imgHeight = scene.getHeight();
        this.imgWidth = scene.getWidth();
        this.camera = scene.getCamera();
    }


    /**
     * Get pixel width double.
     *
     * @return the double
     */
    public static double getPixelWidth(){
        return  getRealWidth()/imgWidth;
    }

    public static double getPixelHeight(){
        return getRealHeight()/imgHeight;
    }

    public static double getRealHeight(){
        return 2*Math.tan(camera.getFovR()/2);
    }

    public static double getRealWidth(){
        return imgWidth*getPixelHeight();
    }

    private static Sphere currentSphere;

    public static void setCurrentSphere(Sphere currentSphere) {
        RayTracer.currentSphere = currentSphere;
    }

    /**
     * View.
     *
     */
    public void view() {
        Color[][] colors = new Color[imgWidth][imgHeight];
        for (int i=0;i<imgWidth;i++){
            for(int j = 0;j<imgHeight;j++) {
                Vector d = getD(i, j);
                double t = getT(d);
                colors[i][j] = new Color(0, 0, 0);
                if (t != -1) {
                    colors[i][j] = lambertColorCal.calculateColor(currentSphere, scene, new Point(getP(i, j).getCoor()));
                }
            }
        }
        try {
            BufferedImage img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
            for (int i=0;i<imgWidth;i++) {
                for (int j = 0; j < imgHeight; j++) {
                    img.setRGB(i,j,new java.awt.Color((int) (colors[i][j].getCoor().getX()*255),(int) (colors[i][j].getCoor().getY()*255), (int) (colors[i][j].getCoor().getZ()*255)).getRGB());
                }
            }
            ImageIO.write(img,"png",scene.getOutput());
        }
        catch (IOException e){
            System.err.println("Erreur lors de la création du fichier : "+e.getMessage());
        }
    }

    /**
     * @param d
     * @return
     */
    public static double getT(Vector d) {
        for(Sphere sphere : scene.getSphere()){
            Vector sphereVector = new Vector(sphere.getPosition().getCoor());
            double b = 2*camera.getLookFrom().sub(sphereVector).scalarProduct(d);
            double c = camera.getLookFrom().sub(sphereVector).scalarProduct(camera.getLookFrom().sub(sphereVector)) - Math.pow(sphere.getRadius(), 2);
            double delta = Math.pow(b,2) - 4 * c;


            if (delta==0){
                setCurrentSphere(sphere);
                return -b/2 ;
            }
            else if(delta>0){
                double t1 = -b + Math.sqrt(delta)/2;
                double t2 = -b + Math.sqrt(delta)/2;
                if (t2>0) {
                    setCurrentSphere(sphere);
                    return t2;
                }else if(t1>0){
                    setCurrentSphere(sphere);
                    return t1;
                }
            }
        }
        return -1;
    }

    public static Vector getP(int i, int j){
        return scene.getCamera().getLookFrom().add(getD(i,j).multiply(getT(getD(i,j))));
    }

    public static Vector getN(int i, int j){
        Vector N = null;
        for(Sphere sphere : scene.getSphere()){
            Vector sphereVector = new Vector(sphere.getPosition().getCoor());
            N = getP(i,j).sub(sphereVector).normalize();
        }
        return N;
    }

    public static Vector getD(int i, int j){
        double a = -getRealWidth()/2 + (i+0.5)*getPixelWidth();
        double b = getRealHeight()/2 - (j+0.5)*getPixelHeight();
        return camera.getU().multiply(a).add(camera.getV().multiply(b)).sub(camera.getW()).normalize();
    }
}
