package com.curso.examen;

class Foo {
	public int a = 3;

	public void addFive() {
		a += 1;
		System.out.println("f");
	}
}

class Bar extends Foo {
	public int a = 8;

	public void addFive() {
		this.a += 2;
		System.out.println("b");
	}
}

public class Pregunta10 {

	public static void main(String[] args) {
		Foo f = new Bar();
		f.addFive();
		System.out.println(f.a); //siempre usa el de la super clase mas alta
	}

}
