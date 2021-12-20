package com.jseac.clasescore.clasesstring.expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherAndPattern {

	public static void main(String[] args) throws Exception {
		
		String textoFacturas = "Las facturas son 123ASBD, 761DJF";
		
		String expresion="\\d{3}[A-Z]{3,5}";
		
		Pattern patron = Pattern.compile(expresion);
		Matcher evaluacion = patron.matcher(textoFacturas);
		
		
		while(evaluacion.find()) {
			int inicio = evaluacion.start();
			int fin = evaluacion.end();
			System.out.println(textoFacturas.substring(inicio,fin)); 
		}
	}
	
}
