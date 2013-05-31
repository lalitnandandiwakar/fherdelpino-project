package com.curso.colecciones;

import java.util.HashSet;
import java.util.Set;

public class TestMoof {

	public static void main(String[] args) {
		
		Set<Moof> miSet = new HashSet<Moof>();
		miSet.add(new Moof(1));
		miSet.add(new Moof(1));
		
//		Set<String> unSet = new HashSet<String>();
//		unSet.add("hola");
//		unSet.add("hola");
		
		
		System.out.println(miSet);
//		System.out.println(unSet);

	}
}
