package com.curso.examen;

public class PruebaArray {

	static final int[] a = { 100, 200 }; // crea correctamente un array

	static final int[] b;

	static {
		b = new int[2];
		b[0] = 100;
		b[1] = 200;
	}

	public static void main(String[] args) {		
		System.out.println(b[0] == a[0]);
		System.out.println(b.equals(a));
		
		String test = "a1b2c3";
		String[] tokens = test.split("\\d");
		for (String s : tokens)
			System.out.print(s +",");
	}

}
