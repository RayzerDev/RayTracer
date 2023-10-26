package sae101.shadow;

import sae101.parser.Parser;
import sae101.parser.scene.SceneBuilder;

public class Proxy implements IShadow{

    private Shadow shadow;

    @Override
    public boolean request() {
        return shadow.request();
    }
}
