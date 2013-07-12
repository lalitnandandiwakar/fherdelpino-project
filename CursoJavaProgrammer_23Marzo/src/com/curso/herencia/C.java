package com.curso.herencia;

public class C extends B {
	public A m() {
		System.out.println("C");
		return null;
	}
	
	void m3() {
		System.out.println("C.m3");
	}
	
	void prueba() {
		prueba = 1;
		A a = new A();
		a.prueba = 1;
	}
}
