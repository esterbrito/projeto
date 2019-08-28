/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20161064010031
 */
public class MotoTest {
    
    public MotoTest() {
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
     * Test of empinar method, of class Moto.
     */
    @Test
    public void testEmpinar() {
        System.out.println("empinar");
        String expResult = "Moto empinando";
        String result = Moto.empinar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of colocarCapacete method, of class Moto.
     */
    @Test
    public void testColocarCapacete() {
        System.out.println("colocarCapacete");
        String expResult = "Usando capacete";
        String result = Moto.colocarCapacete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of removerCapacete method, of class Moto.
     */
    @Test
    public void testRemoverCapacete() {
        System.out.println("removerCapacete");
        String expResult = "Capacete removido";
        String result = Moto.removerCapacete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
