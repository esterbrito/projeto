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
public class CarroTest {
    
    public CarroTest() {
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
     * Test of estadoPortaMalas method, of class Carro.
     */
    @Test
    public void testEstadoPortaMalas() {
        System.out.println("estadoPortaMalas");
        String estado = "Aberto";
        String expResult = "Porta Malas Aberto";
        String result = Carro.estadoPortaMalas(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of colocarCinto method, of class Carro.
     */
    @Test
    public void testColocarCinto() {
        System.out.println("colocarCinto");
        String expResult = "Cinto Colocado";
        String result = Carro.colocarCinto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of removerCinto method, of class Carro.
     */
    @Test
    public void testRemoverCinto() {
        System.out.println("removerCinto");
        String expResult = "Cinto Removido";
        String result = Carro.removerCinto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
