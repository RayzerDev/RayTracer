package sae101.calculColor;

import sae101.parser.objects.Sphere;
import sae101.triplet.Color;
import sae101.triplet.Vector;

public interface IFormLambert {
    Color calculateColor(Sphere sphere, Vector vector);
}