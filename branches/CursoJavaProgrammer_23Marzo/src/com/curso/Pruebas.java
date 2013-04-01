package com.curso;

public class Pruebas {
	
	int fs;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hex = 0x10;
		long l = 35;
		long l2 = 35000000000L; //si es mas grande de lo que int puede abarcar, necesitas cambiar la literal a L
		
		System.out.println(hex);
		System.out.println(l);
		System.out.println(l2);
		
		System.out.println(String.class);
		
		Class c = String.class;
		System.out.println(c);
	}

}
