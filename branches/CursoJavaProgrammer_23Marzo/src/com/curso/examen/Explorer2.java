package com.curso.examen;

import java.util.TreeSet;

public class Explorer2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		
		for (int i = 606; i<613; i++) 
			if (i%2 == 0) s.add(i);
		subs = (TreeSet)s.subSet(608, true, 611, true);
		s.add(629);
		
		System.out.println(s + "" + subs);

	}

}
