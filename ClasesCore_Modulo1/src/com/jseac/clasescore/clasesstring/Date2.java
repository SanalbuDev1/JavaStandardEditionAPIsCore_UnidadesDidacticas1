package com.jseac.clasescore.clasesstring;

import java.util.Calendar;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(2017, 1, 1);
		Date fecha = calendario.getTime();
		System.out.println(fecha);
		
		calendario.set(2018, 1, 1);
		fecha = calendario.getTime();
		System.out.println(fecha);
	}
		
}
