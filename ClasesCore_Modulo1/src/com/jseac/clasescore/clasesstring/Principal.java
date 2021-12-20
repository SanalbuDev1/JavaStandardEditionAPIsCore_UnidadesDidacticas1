package com.jseac.clasescore.clasesstring;

public class Principal {

	public static void main(String[] args) {
		
		String cadena= "Hola que tal";
		System.out.println(cadena.length() + " Longitud");
		
		
		//charAt
		String datosConcatenados = "";
		for (int i = 0; i < cadena.length(); i++) {
			datosConcatenados += "-" + cadena.charAt(i);
		}
		System.out.println(datosConcatenados.replaceFirst("-", ""));
		
		//upperCASE lowerCASE
		
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		
		//concat
		
		System.out.println("Hola como estas".concat(" :)"));
		
		//Substring
		
		System.out.println("Hola como estas".concat(" :)").substring(0,10));
	}
	
}
