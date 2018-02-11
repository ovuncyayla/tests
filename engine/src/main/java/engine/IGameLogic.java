/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import engine.graphics.Window;


public interface IGameLogic {
    
    public void onInit() throws Exception;
    
    public void onCleanup();

    //public void onRender(Window window);

    //public void onUpdate(float interval);

    //public void onInput(Window window);

    public abstract void init() throws Exception;
    
    public abstract void input(Window window);
    
    public abstract void update(float interval);
    
    public abstract void render(Window window);
    
    public abstract void cleanup();
    
    
}
