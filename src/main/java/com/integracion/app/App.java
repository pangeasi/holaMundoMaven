package com.integracion.app;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public int suma(int a, int b) {
    	return a+b;
    }
	    
	
    public static void main( String[] args )
    {
        System.out.println( "Hello Jose!" );
        App i = new App();
        System.out.println(i.suma(1, 2));
        
    }
    
 
    
}
