package com.jseac.clasescore.clasesstring;

import java.util.Iterator;

/**
 * Problemas de rendimiento
 * ejemplos
 * */


public class ProblemasRendimiento {
	
	
	
	public static void main(String[] args) {
		
		Long numero1 = System.currentTimeMillis();
		
		String cadena="hola";
		System.out.println(cadena);
		for (int i=0; i<100000;i++) {
			cadena = cadena+"hola"+i;			
		}
		
		Long numero2 = System.currentTimeMillis();
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero2-numero1);
		
		/**
		 * console
		 * 
		 *  hola
			1638372379691
			1638372388585
			8894
		 * */
	}
	
}
