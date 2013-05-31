package com.curso.examen;

class A {
	void foo() throws Exception {
		System.out.println("A");
	}
}

class B extends A {
	void foo() {
		System.out.println("B");
	}
}

public class PREGUNTA_$_ {
	public static void main(String[] args) {
		A a = new B();
		
		//a.foo(); // te va a pedir manejar la excepcion para compilar aunque imprima "B"
		
	}
}
