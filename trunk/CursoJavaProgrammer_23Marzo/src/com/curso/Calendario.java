package com.curso;

import java.util.Calendar;

public class Calendario {
	
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(cal.YEAR, 1);
		System.out.println(cal.getTime());
		
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println(cal2.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal2.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal2.get(Calendar.DAY_OF_MONTH));		
		System.out.println(cal2.get(Calendar.DAY_OF_YEAR));
		
	}

}
