package com.curso;

public class PruebasString {

	/**
	 * @param args
	 */
	static public void main(String[] args) {
		String s = "hola";
		String t = "hol";

		String v = t + "a";

		System.out.println(s == v); //falso

		String a = "hola";
		String b = "hol" + "a";

		System.out.println(a == b); //verdadero

		String m = "hola";
		String n = "hol";

		System.out.println(m == (n + "a"));
		System.out.println(m == ("hol" + "a"));
		
		System.out.println(s==a);
	}

}
