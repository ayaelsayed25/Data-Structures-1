/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ECC
 */
public class SimpleCalcTest {
    
    public SimpleCalcTest() {
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
     * Test of add method, of class SimpleCalc.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int x = 2;
        int y = 3;
        SimpleCalc instance = new SimpleCalc();
        int expResult = 5;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class SimpleCalc.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int x = 6;
        int y = 3;
        SimpleCalc instance = new SimpleCalc();
        float expResult = 2.0F;
        float result = instance.divide(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test(expected = RuntimeException.class)
    public void testDivide2() {
        SimpleCalc instance = new SimpleCalc();
        instance.divide(10,0);
    }
    
}
