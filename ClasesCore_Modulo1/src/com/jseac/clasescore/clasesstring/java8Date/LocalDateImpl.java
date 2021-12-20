package com.jseac.clasescore.clasesstring.java8Date;

import java.time.LocalDate;

public class LocalDateImpl {
	
	public static void main(String[] args) {
		metodo1();
	}

	public static void metodo1() {
		
		LocalDate miFecha = LocalDate.now();
		System.out.println(miFecha);
		miFecha = LocalDate.of(2016, 10, 10);
		System.out.println(miFecha.getMonth());
		System.out.println(miFecha.getDayOfMonth());
		System.out.println(miFecha.getYear());
		
		/* Comparar fechas */
		System.out.println(miFecha.isBefore(LocalDate.now()));
		System.out.println(miFecha.isAfter(LocalDate.now()));
		
		/*Modificar fecha*/
		/* Son inmutables */
		miFecha = miFecha.withDayOfMonth(20);
		System.out.println(miFecha);
	}
	
}
