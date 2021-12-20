package com.jseac.clasescore.clasesstring.expresionesregulares;

public class Ejemplo1 {

	/*Bloque de texto a nalizar*/
	final static String mensaje = "Hola que tal estas es 20 de diciembre";
	
	public static void main(String[] args) {
		
		String[] lista =mensaje.split("\s"); // /s metacaracter del espacio
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		String textoClientes = "El cliente A tiene de clave clave1234, el cliente b tiene"
				+ " clave otraClave3425";
		
		String nuevoTexto = textoClientes.replaceAll("[a-zA-Z]{3,15}\\d{4}", "xxxxx");
		System.out.println(nuevoTexto);
	}
	
}
