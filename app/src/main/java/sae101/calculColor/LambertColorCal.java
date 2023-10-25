package sae101.calculColor;

import sae101.parser.light.DirectionalLight;
import sae101.parser.light.Light;
import sae101.parser.light.PointLight;
import sae101.parser.objects.Sphere;
import sae101.parser.scene.Scene;
import sae101.raytracer.RayTracer;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Vector;

import java.util.ArrayList;

public class LambertColorCal implements IFormLambert{

    @Override
    public Color calculateColor(Sphere sphere, Vector vector, Vector lightDirection, Scene scene) {
        Vector ldir = new Vector(0,0,0);
        for(Light light : scene.getLight()){
            if(light instanceof DirectionalLight){
                ldir = ((DirectionalLight) light).getLdir();
            }
            else if (light instanceof PointLight){
                Point p = ((PointLight) light).getPoint();
                //ldir = p.sub(RayTracer.getP().getCoor().scalarProduct());
            }
         }
        return null;
    }

    public Color calculateColor(Vector normal, Vector lightDirection, Color lightColor,  Color objectColor){
        double cosTheta = Math.max(normal.scalarProduct(new Vector(lightColor.getCoor())),0);
        return objectColor.schurProduct(new Color(lightColor.getCoor())).multiply(cosTheta);
    }
}
