package com.curso.genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Ejercicio<T extends Number> {

	public void odd(Collection<T> lista) {
		Iterator<T> it = lista.iterator();
		System.out.print("[");
		while (it.hasNext()) {
			T t = it.next();
			int i = t.intValue();
			if (i % 2 != 0) {
				System.out.print(i);
				System.out.print(it.hasNext() ? ", " : "]");
			}
		}
		System.out.println();
	}

	public void palindrome(Collection<T> lista) {
		List<T> listaArray = new ArrayList<T>(lista);
		System.out.print("[");
		for (int i = listaArray.size() - 1; i >= 0; i--) {
			System.out.print(listaArray.get(i));
			System.out.print(i > 0 ? ", " : "]");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Ejercicio<Integer> ejEntero = new Ejercicio<Integer>();
		List<Integer> listaEntero = new ArrayList<Integer>();

		Ejercicio<Float> ejFloat = new Ejercicio<Float>();
		List<Float> listaFloat = new ArrayList<Float>();

		for (int i = 0; i < 10; i++) {
			listaEntero.add(i);
			listaFloat.add(new Integer(i).floatValue());
		}

		ejEntero.odd(listaEntero);
		ejFloat.odd(listaFloat);

		ejEntero.palindrome(listaEntero);
		ejFloat.palindrome(listaFloat);
	}

}
