package com.curso;

public class PasarValorOReferencia {

	public static void main(String args[]) {
		String s = "hola mundo";
		metodo1(s);
		System.out.println(s);
	}
	
	static void metodo1(String s) {
		s = "hello world";
	}
}
