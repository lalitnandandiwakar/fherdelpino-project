package com.curso.herencia;

public class B extends A {
	public A m() {
		System.out.println("B");
		return null;
	}
	
	void m1() {
		System.out.println("B.m1");
	}
	
	int m4() {
		System.out.println("B.m4");
		return 0;
	}
	
	void prueba() {
		prueba = 1;
		A a = new A();
		a.prueba = 1;
	}
}
