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
public class EstoqueTest {
    
    public EstoqueTest() {
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
     * Test of qtdProdutos method, of class Estoque.
     */
    @Test
    public void testQtdProdutos() {
        System.out.println("qtdProdutos");
        String expResult = "Temos " + Veiculo.qtd + " produtos";
        String result = Estoque.qtdProdutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of produtos method, of class Estoque.
     */
    @Test
    public void testProdutos() {
        System.out.println("produtos");
        String expResult = "Carros e Motos";
        String result = Estoque.produtos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPreco method, of class Estoque.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        String veiculo = "";
        String expResult = "";
        String result = Estoque.getPreco(veiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
