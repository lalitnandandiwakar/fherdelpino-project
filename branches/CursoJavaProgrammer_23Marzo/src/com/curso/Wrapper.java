package com.curso;

public class Wrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer i = 127;
		Integer k = new Integer(127);
		int x=120,y=7;
		
		Integer j = x+y; //apunta igual que k
		
		
		System.out.println(i==j);
		System.out.println(5==k);
		System.out.println(i.equals(k));
		
		
	}

}
