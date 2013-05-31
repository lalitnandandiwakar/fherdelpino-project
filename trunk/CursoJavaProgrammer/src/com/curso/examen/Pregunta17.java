package com.curso.examen;

class Building {
}

class Barn extends Building {
}

public class Pregunta17 {
	public static void main(String[] args) {
		Building build1 = new Building();
		Barn barn1 = new Barn();
		Barn barn2 = (Barn) build1; // falla en runtime pero compila
		Object obj1 = (Object) build1;
		// String str1 = (String) build1; no compila
	}
}
