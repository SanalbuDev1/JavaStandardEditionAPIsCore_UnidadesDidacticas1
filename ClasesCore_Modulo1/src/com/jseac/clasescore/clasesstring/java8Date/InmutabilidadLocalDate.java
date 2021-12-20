package com.jseac.clasescore.clasesstring.java8Date;

import java.time.LocalDate;

public class InmutabilidadLocalDate {

	public static void main(String[] args) {
		metodo1();
	}

	public static void metodo1() {
		
		LocalDate miFecha = LocalDate.now();		
		System.out.println(miFecha);
		
		/* Crear referencia de fecha nueva*/
		
		LocalDate miFecha2 = miFecha.plusDays(10).plusMonths(10).plusYears(10);
		//miFecha2 = miFecha.plusMonths(10);
		//miFecha2 = miFecha.plusYears(10);
		System.out.println(miFecha2);
	}
	
	
}
