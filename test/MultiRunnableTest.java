/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author JRome
 */
public class MultiRunnableTest {
    
    public MultiRunnableTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class Multi3.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        MultiRunnable instance = new MultiRunnable();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Multi3.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MultiRunnable.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
