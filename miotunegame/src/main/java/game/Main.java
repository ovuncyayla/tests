package game;

import engine.Engine;
import engine.IGameLogic;
import engine.Window;

public class Main {
    private static final String WINDOW_TITLE = "MioTune Game";
    
    private static class WIN_SIZE {
        static final int width = 600;
        static final int height = 400;
    }
    
    static class GameLogic implements IGameLogic {

        @Override
        public void init() throws Exception {
        }

        @Override
        public void input(Window window) {
        }

        @Override
        public void update(float interval) {
        }

        @Override
        public void render(Window window) {
         }

        @Override
        public void cleanup() {
        }

    };
    
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        IGameLogic gameLogic = new GameLogic();
        Engine engine = new Engine(WINDOW_TITLE, WIN_SIZE.width, WIN_SIZE.height, true, gameLogic);
        engine.start();
    }
}
