package com.curso.examen;

import java.util.Arrays;

public class Temp {
	
	static int entero;
	int enteroNoStatic;
	public static void main(String... args) {
		//enteroNoStatic; //un metodo static no puede modificar campos no estáticos
		
		Arrays.asList(1,2,"", 5);
	}
	
	private final int go(Boolean b, int i) {
		if (b) return (i/7);
		return (i/49);
	}
	
	protected void myProtected(String arg) {
		myStatic(); //cualquier método puede llamar un static
		
		entero++;
	}
	
	private static void myStatic() {
		
	}
}
