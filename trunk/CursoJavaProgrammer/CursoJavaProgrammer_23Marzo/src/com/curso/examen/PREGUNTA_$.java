package com.curso.examen;

public class PREGUNTA_$ {

	public static void go(Long n) {
		System.out.println("long");
	}
	
	public static void go(Short n) {
		System.out.println("short");
	}
	
	public static void go(int n) {
		System.out.println("int");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		short y = 6;
		long z = 7;
		go(y);
		go(z);

	}

}
