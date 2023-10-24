package sae101.raytracer;

import sae101.parser.Camera;
import sae101.parser.Parser;
import sae101.parser.objects.Sphere;
import sae101.parser.scene.Scene;
import sae101.triplet.Vector;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RayTracer {
    private Scene scene;

    private int imgHeight;

    private int imgWidth;

    private Camera camera;

    public RayTracer(Scene scene, int imgHeight, int imgWidth, Camera camera) {
        this.scene = scene;
        this.imgHeight = imgHeight;
        this.imgWidth = imgWidth;
        this.camera=camera;
    }


    public double getPixelWidth(){
        return  camera.getPixelHeight()*(imgWidth/imgHeight);
    }


    public void view(String nameFileOutPut) throws FileNotFoundException {
        Parser parser = new Parser(nameFileOutPut);
        BufferedImage img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
        for (int i=0;i<imgWidth;i++){
            for(int j = 0;j<imgHeight;j++){
                double a = -imgWidth/2 + (i+0.5)*getPixelWidth();
                double b = -imgHeight/2 - (j+0.5)*camera.getPixelHeight();
                Vector d = camera.getU().multiply(a).add(camera.getV().multiply(b)).normalize();
                double t=0;
                for(Sphere sphere : scene.getSphere()){
                    Vector sphereVector = new Vector(sphere.getPosition());
                    double delta = (Math.pow(camera.getLookFrom().sub(sphereVector).scalarProduct(d), 2) - (4 * camera.getLookFrom().sub(sphereVector).scalarProduct(camera.getLookFrom().sub(sphereVector))) - Math.pow(sphere.getRadius(), 2));

                    if (delta==0){
                        t = -camera.getLookFrom().sub(sphereVector).scalarProduct(d)/2 ;
                    }
                    else if(delta>0){
                        double t1 = -camera.getLookFrom().sub(sphereVector).scalarProduct(d)+Math.sqrt(delta)/2;
                        double t2 = -camera.getLookFrom().sub(sphereVector).scalarProduct(d)-Math.sqrt(delta)/2;
                        if (t2>0) {
                            t=t2;
                        }else if(t1>0){
                            t=t1;
                        }
                    }
                }
            }
        }
        try {
            File outputFile = new File("outpout.png");
            ImageIO.write(img, "png", outputFile);
            System.out.println("Image saved ");
        }
        catch (IOException e){
            System.err.println("Erreur lors de la création du fichier : "+e.getMessage());
        }
    }
}
