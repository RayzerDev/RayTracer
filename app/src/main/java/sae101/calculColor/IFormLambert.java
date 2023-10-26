package sae101.calculColor;

import sae101.parser.objects.Sphere;
import sae101.parser.scene.Scene;
import sae101.triplet.Color;
import sae101.triplet.Point;
import sae101.triplet.Vector;

public interface IFormLambert {

    Color calculateColor(Sphere sphere, Scene scene, Point p);
}
