package engine;

import engine.graphics.Renderer;
import engine.graphics.Window;

public abstract class AbstractGameLogic {
    
    protected final Renderer renderer;
    
    public AbstractGameLogic() throws Exception {
        renderer = new Renderer();
        onInit();
    }
    
    private void onInit() throws Exception{
        renderer.init();
        init();
    };
    
    public void onCleanup(){
        renderer.cleanup();
        cleanup();
    };


    public void onRender(Window window){
        render(window);
    };

    public void onUpdate(float interval){
        update(interval);
    };

    public void onInput(Window window){
        input(window);
    };

    public abstract void init() throws Exception;
    
    public abstract void input(Window window);
    
    public abstract void update(float interval);
    
    public abstract void render(Window window);
    
    public abstract void cleanup();
    
}