package sae101.decorateur;

public class DecoRender implements IRender{

    private IRender iRender;

    public DecoRender(IRender wrapper){
        this.iRender=wrapper;
    }

    @Override
    public void render() {
        iRender.render();
    }
}
