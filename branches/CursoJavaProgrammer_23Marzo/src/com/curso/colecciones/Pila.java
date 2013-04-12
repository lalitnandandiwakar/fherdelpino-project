package com.curso.colecciones;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pila {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(new Integer[] { 10, 2, 8, 2, 5, 11, 12 });
		sort(new LinkedList<Integer>(lista));

	}

	@SuppressWarnings("unused")
	public static void sort(LinkedList<Integer> listaOrigen) {

		// variables permitidas
		LinkedList<Integer> listaDest = new LinkedList<Integer>();
		Integer aux = Integer.MAX_VALUE;

		while (!listaOrigen.isEmpty()) {

			if (listaOrigen.peek() <= aux) {
				aux = listaOrigen.pop();
				listaDest.push(aux);
			} else {
				aux = listaDest.pop();				
				listaDest.push(listaOrigen.pop());
				listaDest.push(aux);
			}
		}
		
//		if(aux <=2)
//			sort(listaDest);

		System.out.println(listaDest);
	}
}
