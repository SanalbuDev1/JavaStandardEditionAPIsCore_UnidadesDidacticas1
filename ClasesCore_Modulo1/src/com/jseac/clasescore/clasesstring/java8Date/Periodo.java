package com.jseac.clasescore.clasesstring.java8Date;

import java.time.LocalDate;
import java.time.Period;

public class Periodo {

	public static void main(String[] args) {
		
		Period periodo = Period.between(LocalDate.now(), LocalDate.now().plusDays(10));
		System.out.println(periodo.getDays());
    System.out.println("creado desde github");
		System.out.println(periodo.getMonths());
		
	}
	
}
