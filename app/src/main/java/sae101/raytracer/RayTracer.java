package sae101.raytracer;

import sae101.parser.scene.Scene;
import sae101.triplet.Vector;

import java.awt.image.BufferedImage;

public class RayTracer {
    private Scene scene;

    private int imgHeight;

    private int imgWidth;

    public RayTracer(Scene scene, int imgHeight, int imgWidth) {
        this.scene = scene;
        this.imgHeight = imgHeight;
        this.imgWidth = imgWidth;
    }

    public void view(String nameFileOutPut){
        BufferedImage img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
        for (int i=0;i<imgWidth;i++){
            for(int j = 0;j<imgHeight;j++){
            }
        }
    }
}
