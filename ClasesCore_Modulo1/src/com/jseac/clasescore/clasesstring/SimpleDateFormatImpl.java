package com.jseac.clasescore.clasesstring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatImpl {

	static String fechaTexto = "10/12/2017";
	
	public static void main(String[] args) throws ParseException {
		
		
		try {
			fecha();
			fecha2();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e.getMessage());
		}
		
		System.out.println("Fin del programa");
	}
	
	static private void fecha() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date fecha = sdf.parse(fechaTexto);
			System.out.println(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}
	
	static private void fecha2() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		try {
			Date fecha = sdf.parse(fechaTexto);
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd k:mm:ss");
			Calendar fecha3 = Calendar.getInstance();
			fecha3.setTime(fecha);
			System.out.println(sdf2.format(fecha) + " " + fecha3.get(Calendar.DAY_OF_MONTH) + "-" + fecha3.get(Calendar.MONTH));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}
	
}
