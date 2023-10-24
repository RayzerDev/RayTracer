package sae101.raytracer;

import sae101.parser.Camera;
import sae101.parser.scene.Scene;
import sae101.triplet.Vector;

import java.awt.image.BufferedImage;

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

            }
        }
    }
}
