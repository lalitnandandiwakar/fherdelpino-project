package com.curso.simulador;

interface DeclareStuff {
	public static final int EASY = 3;

	void doStuff(int t);
}

public class TestDeclare implements DeclareStuff {
	public static void main(String[] args) {
		int x = 5;
		new TestDeclare().doStuff(++x);
	}

	public void doStuff(int s) { //FIXME: el metodo debe ser publico, prueba utilizando otro modificador
		s += EASY + ++s;
		System.out.println("s " + s);
	}
}
