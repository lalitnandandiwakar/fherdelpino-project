package com.curso;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int entero[][] = new int[2][];		
		System.out.println(entero[0]);
		
		double doble[][] = new double[2][];
		System.out.println(doble[0]);
		
		Object o[][] = new Object[2][];
		System.out.println(o[0]);
		
		String s[][] = new String[2][];
		System.out.println(s[0]);
		
		char caracter[][] = new char[2][];
		System.out.println(caracter[0]); //Null pointer exception
		
		
		

	}

}
