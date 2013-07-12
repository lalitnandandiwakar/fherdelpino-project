package com.curso.colecciones;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.curso.genericos.Account;

public class TestComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Comparator<Account> c = new Comparator<Account>() {

			@Override
			public int compare(Account o1, Account o2) {
				return 0;
			}
			
		};
		
		Set<Account> miSet = new TreeSet<Account>(c);
		
		
		System.out.println(miSet);

	}

}
