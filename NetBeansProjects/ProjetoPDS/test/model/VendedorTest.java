/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static model.Vendedor.cpf;
import static model.Vendedor.idade;
import static model.Vendedor.nome;
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
public class VendedorTest {
    
    public VendedorTest() {
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
     * Test of getNome method, of class Vendedor.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = "Seu nome é " + nome;
        String result = Vendedor.getNome();
        assertEquals(expResult, result);
        
       
    }

    /**
     * Test of getIdade method, of class Vendedor.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        String expResult = "Sua idade é " + idade;
        String result = Vendedor.getIdade();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of getCpf method, of class Vendedor.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        String expResult = "Seu CPF é " + cpf;
        String result = Vendedor.getCpf();
        assertEquals(expResult, result);
       
       
    }
    
}
