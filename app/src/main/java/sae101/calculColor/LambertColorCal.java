package sae101.calculColor;

import sae101.parser.light.DirectionalLight;
import sae101.parser.light.Light;
import sae101.parser.light.PointLight;
import sae101.parser.objects.Sphere;
import sae101.parser.scene.Scene;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Vector;

public class LambertColorCal implements IFormLambert{
    @Override
    public Color calculateColor(Sphere sphere, Scene scene, Point p) {
        Vector n = p.sub(new Point(sphere.getPosition())).normalize();
        Color col = new Color(0,0,0);
        for(Light light : scene.getLight()){
            Vector ldir = new Vector(0,0,0);
            if(light instanceof DirectionalLight){
                ldir = ((DirectionalLight) light).getLdir();

            }
            else if (light instanceof PointLight){
                ldir = ((PointLight) light).getLdir();
            }
            double cosTheta = Math.max(n.scalarProduct(ldir),0);
            col = scene.getAmbient().add(new Color(light.getColor().multiply(cosTheta).getCoor()));
        }
        return col;
    }

}
