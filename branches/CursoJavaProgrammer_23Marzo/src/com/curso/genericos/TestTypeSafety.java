package com.curso.genericos;

import java.util.ArrayList;
import java.util.List;



public class TestTypeSafety {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
//		Collection coleccion = lista;
//		
//		Iterator it = lista.iterator();
		
		for (Integer elemento: lista) {
			System.out.println(elemento.byteValue());
		}
	}

	public static void printNames(List <? extends Account> lea) {
//		lea.addAll( new ArrayList<Account>());
	}
	
	public static void printNames2(List<? super CheckingAccount> ceo) {
		
	}
}
