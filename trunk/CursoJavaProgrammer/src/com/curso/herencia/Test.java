package com.curso.herencia;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new C();
		
		a.m1();
		a.m2();
		a.m3();
		
		B b = new C();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		
		C c = new C();
		

	}

}
