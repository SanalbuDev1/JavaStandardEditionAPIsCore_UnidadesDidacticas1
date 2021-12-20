package com.jseac.clasescore.clasesstring;

import java.util.Calendar;
import java.util.Date;

public class Date1 {

	static Date dia1 = new Date();
	
	public static void main(String[] args) {
		
		System.out.println(dia1);
		
		//Problemas
		Date dia2 = new Date(100000);
		System.out.println(dia2 + "\n");
		
		//Calendar
		Calendar miCalendario = Calendar.getInstance();
		Date fecha = miCalendario.getTime();
		System.out.println(fecha);
		
		miCalendario.set(2021, 12, 12);
		fecha = miCalendario.getTime();
		System.out.println(fecha);
		
		miCalendario.set(Calendar.MONTH, Calendar.APRIL);
		miCalendario.set(Calendar.DAY_OF_MONTH, 2);
		miCalendario.set(Calendar.YEAR, 1998);
		fecha = miCalendario.getTime();		
		System.out.println(fecha);
	}
}
