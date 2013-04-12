package com.curso.colecciones;

import java.util.LinkedList;

public class Pila {
	
	static final int CANTIDAD_NUMEROS = 50;
	static final int TAMANO = 20;

	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
			lista.add(rnd(TAMANO)); // agrego numeros aleatorios a la lista.
		}
		System.out.println("Pila inicial: " + lista);
		long time = System.currentTimeMillis();
		lista = sort(lista);
		time = System.currentTimeMillis() - time;
		System.out.println("Pila final: " + lista);		
		System.out.println("Tiempo con " + CANTIDAD_NUMEROS + " elementos: " + time + "ms.");
	}

	/**
	 * Crea enteros aleatorios.
	 * 
	 * @param n
	 *            se crean numero aleatorios de tamaño max n - 1
	 * @return entero aleatorio.
	 */
	public static int rnd(int n) {
		Double d = Math.random();
		d *= n;
		return d.intValue();
	}

	
	/**
	 * Método que ordena ascendentemente la pila, solo utiliza una pila y un entero auxiliar.
	 * Si se quiere ordenar descendentemente:
	 * 1. cambia el <= por >= .
	 * 2. cambia Integer.MAX_VALUE por Integer.MIN_VALUE .
	 * @param listaOrigen Lista a ordenar
	 */
	public static LinkedList<Integer> sort(LinkedList<Integer> listaOrigen) {
		
		LinkedList<Integer> listaDest = new LinkedList<Integer>();
		Integer aux = 0;

		while (!listaOrigen.isEmpty()) {
			if (listaOrigen.peek() <= (listaDest.isEmpty() ? Integer.MAX_VALUE : listaDest.peek())) {
				listaDest.push(listaOrigen.pop());
			} else {
				aux = listaOrigen.pop();
				listaOrigen.push(listaDest.pop());
				listaOrigen.push(aux);
			}
		} // end while
		
		return listaDest;		
	}
}
