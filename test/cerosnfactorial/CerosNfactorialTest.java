/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerosnfactorial;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MJCR-L
 */
public class CerosNfactorialTest {

    public CerosNfactorialTest() {
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
     * Test of factorial method, of class CerosNfactorial.
     */
    @Test
    public void testFactorial() {
        System.out.println(CerosNfactorial.class + ": factorial");
        long x = 1L;
        long n = 0L;
        CerosNfactorial instance = new CerosNfactorial();
        long expResult = 1;
        long result = instance.factorial(x, n);
        assertEquals(expResult, result);
    }

    @Test
    public void testFactorial2() {
        System.out.println(CerosNfactorial.class + ": factorial2");
        long x = 1L;
        long n = 21L;
        CerosNfactorial instance = new CerosNfactorial();
        long expResult = 2432902008176640000L;
        long result = instance.factorial(x, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of cantidadCeros method, of class CerosNfactorial.
     */
    @Test
    public void testCantidadCeros() {
        System.out.println(CerosNfactorial.class + ": cantidadCeros");
        long n = 0L;
        CerosNfactorial instance = new CerosNfactorial();
        int expResult = 0;
        int result = instance.cantidadCeros(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testCantidadCeros2() {
        System.out.println(CerosNfactorial.class + ": cantidadCeros2");
        long n = 2432902008176640000L;
        CerosNfactorial instance = new CerosNfactorial();
        int expResult = 7;
        int result = instance.cantidadCeros(n);
        assertEquals(expResult, result);
    }

}
