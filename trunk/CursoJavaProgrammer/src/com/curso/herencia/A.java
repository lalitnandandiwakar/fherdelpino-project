package com.curso.herencia;

public class A {
	
	protected int prueba;
	
	A m() {
		System.out.println("A");
		return null;
	}
	
	void m1(){
		System.out.println("A.m1");
	}
	
	void m1(String s) {
		
	}
	
	void m2() {
		System.out.println("A.m2");
	}
	
	void m3() {
		System.out.println("A.m3");
	}

	private final void m4() {
		System.out.println("A.m4");
	}
}
