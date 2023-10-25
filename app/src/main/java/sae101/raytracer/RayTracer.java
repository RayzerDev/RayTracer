package sae101.raytracer;

import sae101.parser.Camera;
import sae101.parser.objects.Sphere;
import sae101.parser.scene.Scene;
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
    private Scene scene;

    private int imgHeight;

    private int imgWidth;

    private Camera camera;

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
    public double getPixelWidth(){
        return  getRealWidth()/imgWidth;
    }

    public double getRealHeight(){
        return 2*Math.tan(camera.getFovR()/2);
    }

    public double getRealWidth(){
        return imgWidth*(getRealHeight()/imgHeight);
    }

    /**
     * View.
     *
     */
    public void view() {
        Color[][] colors = new Color[imgWidth][imgHeight];
        for (int i=0;i<imgWidth;i++){
            for(int j = 0;j<imgHeight;j++){
                Vector d = getD(i,j);
                double t=-1;
                t = getT(d);
                Color color = new Color(0,0,0);
                if(t!=-1){
                    color = scene.getAmbient();
                }
                colors[i][j]=color;
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
     * @param t
     * @return
     */
    public double getT(Vector d) {
        double t = -1;
        for(Sphere sphere : scene.getSphere()){
            Vector sphereVector = new Vector(sphere.getPosition());
            double b = 2*camera.getLookFrom().sub(sphereVector).scalarProduct(d);
            double c = camera.getLookFrom().sub(sphereVector).scalarProduct(camera.getLookFrom().sub(sphereVector)) - Math.pow(sphere.getRadius(), 2);
            double delta = Math.pow(b,2) - 4 * c;


            if (delta==0){
                t = -b/2 ;
            }
            else if(delta>0){
                double t1 = -b + Math.sqrt(delta)/2;
                double t2 = -b + Math.sqrt(delta)/2;
                if (t2>0) {
                   t =t2;
                }else if(t1>0){
                   t =t1;
                }
            }
        }
        return t;
    }

    public Vector getP(int i, int j){
        return scene.getCamera().getLookFrom().add(getD(i,j).multiply(getT(getD(i,j))));
    }

    public Vector getN(int i, int j){
        Vector N = null;
        for(Sphere sphere : scene.getSphere()){
            Vector sphereVector = new Vector(sphere.getPosition());
            N =getP(i,j).sub(sphereVector).normalize();
        }
        return N;
    }

    public Vector getD(int i, int j){
        double a = -getRealWidth()/2 + (i+0.5)*getPixelWidth();
        double b = getRealHeight()/2 - (j+0.5)*camera.getPixelHeight();
        return camera.getU().multiply(a).add(camera.getV().multiply(b)).sub(camera.getW()).normalize();
    }
}
