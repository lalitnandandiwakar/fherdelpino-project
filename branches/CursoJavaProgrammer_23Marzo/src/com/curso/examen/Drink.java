package com.curso.examen;

import java.util.TreeSet;

public class Drink implements Comparable {

	String name;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Drink one =new Drink();
		Drink two = new Drink();
		Drink three = new Drink();
		one.name = "coffee";
		two.name = "tea";
		three.name= "beer";
		TreeSet tree = new TreeSet();
		tree.add(one);
		tree.add(two);
		tree.add(three);
		
		for( Object d : tree)
			System.out.println(((Drink)d).name);

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Drink d = (Drink) o;
		return this.name.compareTo(d.name);
	}

}
