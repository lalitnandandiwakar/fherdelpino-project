package com.curso.examen;

class SuperCalc {
	protected static int multiply(int a, int b) {
		return a * b;
	}
}

class SubCalc extends SuperCalc {
	public static int multiply(int a, int b) {
		// FIXME no se puede usar super en un contexto statico
		// int c = super.multiply(a, b);
		return 0;
	}
}

class Pregunta18 {
	public static void main(String[] args) {
		SuperCalc sc = new SubCalc();
		System.out.println(sc.multiply(3, 4));//aunque sea de tipo subcalc, llama al método statico de la clase padre
		System.out.println(SuperCalc.multiply(2, 2));
	}
}
