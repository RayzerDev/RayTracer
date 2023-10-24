package sae101.raytracer;

import sae101.parser.Camera;
import sae101.parser.scene.Scene;
import sae101.triplet.Point;
import sae101.triplet.Vector;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
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


    public void view(String nameFileOutPut){
        BufferedImage img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
        for (int i=0;i<imgWidth;i++){
            for(int j = 0;j<imgHeight;j++){
                double a = -imgWidth/2 + (i+0.5)*getPixelWidth();
                double b = -imgHeight/2 - (j+0.5)*camera.getPixelHeight();
                Vector d = camera.getU().multiply(a).add(camera.getV().multiply(b)).normalize();
                Point p = camera.getLookFrom() + d * t;
            }
        }
        try {
            BufferedImage image= view();
            File outputFile = new File("outpout.png");
            ImageIO.write(image, "png", outputFile);
        }
        catch (IOException e){
            System.err.println("Erreur lors de la création du fichier : "+e.getMessage());
        }
    }
}
