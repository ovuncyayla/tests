package game;

import engine.Engine;
import engine.AbstractGameLogic;

public class Main {

    private static final String WINDOW_TITLE = "MioTune Game";
    
    Engine engine;
    AbstractGameLogic gameLogic;

    private static class WIN_SIZE {

        static final int width = 600;
        static final int height = 400;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.gameLogic = new DummyLogic();
        m.engine = new Engine(WINDOW_TITLE, WIN_SIZE.width, WIN_SIZE.height, true, m.gameLogic);
        m.engine.start();
    }
}
