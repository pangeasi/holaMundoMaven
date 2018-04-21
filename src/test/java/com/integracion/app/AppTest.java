package com.integracion.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    public void testSuma() {
    	int resultado = App.suma(2, 4);
    	int esperado = 6;
    	assertEquals(esperado, resultado);
    }
    
    public void testResta() {
    	int resultado = App.resta(2, 4);
    	int esperado = -2;
    	assertEquals(esperado, resultado);
    }
}
