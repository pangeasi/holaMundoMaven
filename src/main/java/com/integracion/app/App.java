package com.integracion.app;


public class App 
{
	
	public static int suma(int a, int b) {
    	return a+b;
    }
	
	public static int resta(int a, int b) {
		return a-b;
	}
	    
	
    public static void main( String[] args )
    {
        System.out.println( "Hello Jandemor!" );
        
        System.out.println(suma(1, 2));
        System.out.println(resta(2, 7));
    }
    
 
    
}
