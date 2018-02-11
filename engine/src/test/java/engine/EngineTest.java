/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spak
 */
public class EngineTest {
    
    public EngineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Engine.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        System.out.println("gameLoop");
        String windowTitle = "Test Title";
        IGameLogic gameLogic= new TestGameLogicImpl();
        Engine instance;
        try {
            instance = new Engine(windowTitle, 0, 0, true, gameLogic);
            instance.gameLoop();
            assertNotNull(instance);
        } catch (Exception ex) {
            Logger.getLogger(EngineTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public class TestGameLogicImpl implements IGameLogic {

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
    
    }
    
}
