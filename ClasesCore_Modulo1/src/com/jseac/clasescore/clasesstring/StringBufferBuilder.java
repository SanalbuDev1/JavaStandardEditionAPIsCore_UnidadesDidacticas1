package com.jseac.clasescore.clasesstring;

public class StringBufferBuilder {

	public static void main(String[] args) {

		Long numero1 = System.currentTimeMillis();

		StringBuffer cadena = new StringBuffer();
		StringBuilder cadena2 = new StringBuilder();
		cadena2.append("hola");
		System.out.println(cadena);
		/*for (int i = 0; i < 10000; i++) {
			cadena.append("hola" + i);
		}*/
		for (int i = 0; i < 10000; i++) {
			cadena2.append("hola" + i);
		}
		System.out.print(cadena2.toString());
		Long numero2 = System.currentTimeMillis();

		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero2 - numero1);

		/**
		 * console
		 * 
		 * hola 1638383960469 1638383960642 173
		 * 
		 */
	}
	
}
