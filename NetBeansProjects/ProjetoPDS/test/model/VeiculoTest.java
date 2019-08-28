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
public class VeiculoTest {
    
    public VeiculoTest() {
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
     * Test of movimentar method, of class Veiculo.
     */
    @Test
    public void testMovimentar() {
        System.out.println("movimentar");
        String direcao = "Direita";
        String expResult = Veiculo.class + " andando para " + direcao;
        String result = Veiculo.movimentar(direcao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of parar method, of class Veiculo.
     */
    @Test
    public void testParar() {
        System.out.println("parar");
        String expResult = " Veiculo parado";
        String result = Veiculo.parar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of enrolar method, of class Veiculo.
     */
    @Test
    public void testEnrolar() {
        System.out.println("enrolar");
        String direcao = "Esquerda";
        String expResult = Veiculo.class + " enrolando para " + direcao;
        String result = Veiculo.enrolar(direcao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
