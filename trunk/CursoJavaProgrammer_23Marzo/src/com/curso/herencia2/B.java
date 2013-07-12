package com.curso.herencia2;

import com.curso.herencia.A;

public class B extends A {
	public void m() {
		System.out.println("B");
	}
	
	void prueba() {
		prueba = 1;
		A a = new A();
		//a.prueba = 1; // variable prueba es protected, no puede ser accesada
	}
}
