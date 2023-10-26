package sae101.shadow;

import sae101.parser.Parser;
import sae101.parser.scene.SceneBuilder;

public class Shadow implements IShadow{

    private SceneBuilder sceneBuilder = Parser.getSceneBuilder();
    @Override
    public boolean request() {
       return sceneBuilder.getShadow();
    }
}
