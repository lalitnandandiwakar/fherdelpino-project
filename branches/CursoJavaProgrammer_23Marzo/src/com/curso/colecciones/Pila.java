package com.curso.colecciones;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pila {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(new Integer[] { 10, 2, 8, 11, 5, 2, 12 });
		sort(new LinkedList<Integer>(lista));

	}

	@SuppressWarnings("unused")
	public static void sort(LinkedList<Integer> listaOrigen) {

		// variables permitidas
		LinkedList<Integer> listaDest = new LinkedList<Integer>();
		Integer aux = listaOrigen.pop();
		if (listaOrigen.peek() <= aux) {
			listaDest.push(aux);aux = null;
		} else {
			listaDest.push(listaOrigen.pop());
			listaOrigen.push(aux);aux = null;
		}

		while (!listaOrigen.isEmpty()) {
			aux = listaOrigen.pop();

			if (aux > (listaOrigen.isEmpty() ? Integer.MIN_VALUE : listaOrigen.peek())) {
				if (aux <= listaDest.peek()) {
					listaDest.push(aux);aux = null;
				} else {
					listaOrigen.push(listaDest.pop());					
					if (listaDest.isEmpty()) {
						listaDest.push(aux); aux = null;
					} else {
						listaOrigen.push(aux);aux = null;
					}
				}
			} else if (listaOrigen.peek() < listaDest.peek()){
				listaDest.push(listaOrigen.pop());
				listaOrigen.push(aux);aux = null;
			} else {
				listaDest.push(aux); aux = null;
				aux = listaOrigen.pop();
				listaOrigen.push(listaDest.pop());
				listaOrigen.push(aux); aux = null;
			}

		} // end while

		// if(aux <=2)
		// sort(listaDest);

		System.out.println(listaDest);
	}
}
