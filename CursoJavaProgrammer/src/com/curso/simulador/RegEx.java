package com.curso.simulador;

public class RegEx {
	
	public static void main(String args[]) {
		String s = "Test A. Test B. Test C";
		String[] array = s.split("\\.\\s");
		
		for (String c : array)
		System.out.println(c);
		
		
	}

}
