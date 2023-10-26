package sae101.calculColor;

import sae101.parser.light.Light;
import sae101.parser.objects.Sphere;
import sae101.parser.scene.Scene;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Triplet;
import sae101.triplet.Vector;

public class LambertColorCal implements IFormLambert{
    @Override
    public Color calculateColor(Sphere sphere, Scene scene, Point p) {
        Vector n = p.sub(sphere.getPosition()).normalize();
        Color col = new Color(0,0,0);

        for(Light light : scene.getLight()){
            Vector ldir = light.getLdir();
            double cosTheta = Math.max(n.scalarProduct(ldir),0);
            col = col.add(light.getColor().multiply(cosTheta));
        }
        if(sphere.getAmbient()!=null){
            Triplet colCoor = col.add(sphere.getAmbient()).getCoor();
            colCoor.setX(Math.min(colCoor.getX(),1));
            colCoor.setY(Math.min(colCoor.getY(),1));
            colCoor.setZ(Math.min(colCoor.getZ(),1));
            col.setCoor(colCoor);
        }
        return col;
    }
}
