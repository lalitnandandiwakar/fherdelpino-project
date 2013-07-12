package com.curso.colecciones;

import java.util.LinkedList;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		for(int i = 0; i< 10; i++) 
			lista.push(i);
		
		
		System.out.println(lista);
		System.out.println(lista.poll() + ", "+ lista.pop());
		System.out.println(lista);

	}

}
