package sae101.parser.light;

import sae101.triplet.Color;
import sae101.triplet.Vector;

/**
 * The type Directional ligth.
 * @author damien.allaert
 */
public class DirectionalLigth extends Light{

    /**
     * Instantiates a new Directional ligth.
     *
     * @param vector the vector
     * @param color  the color
     */
    public DirectionalLigth(Vector vector, Color color){
        super(vector.getCoor(), color);
    }


}
