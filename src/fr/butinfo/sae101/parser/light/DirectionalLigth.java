package fr.butinfo.sae101.parser.light;

import fr.butinfo.sae101.triplet.Color;
import fr.butinfo.sae101.triplet.Vector;

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
