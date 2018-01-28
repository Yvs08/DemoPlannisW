/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classTest;

import abstractClass.Chien;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YvesLambert
 */
public class ChienTest {
    
    public ChienTest() {
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
     * Test of crier method, of class Chien.
     */
    @Test
    public void testCrier() {
        System.out.println("crier");
       // String b = "J'aboie sans raison !";
        
        Chien instance = new Chien();
        instance.crier();
         
             // TODO review the generated test code and remove the default call to fail.
        ///fail("J'aboie sans raison !");
        
    }
    
}
