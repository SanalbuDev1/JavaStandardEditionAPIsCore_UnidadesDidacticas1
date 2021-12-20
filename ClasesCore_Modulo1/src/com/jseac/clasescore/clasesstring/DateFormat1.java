package com.jseac.clasescore.clasesstring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat1 {

	public static void main(String[] args) throws ParseException {
		
		String fechaTexto="10/12/2015";
		SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/YYYY");
		Date miFecha = fecha.parse(fechaTexto);
		Calendar mifecha = Calendar.getInstance();
		mifecha.setTime(miFecha);
		System.out.println(mifecha.get(Calendar.YEAR));
		
	}	
}
