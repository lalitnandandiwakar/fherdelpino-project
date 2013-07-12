package com.curso.genericos;

public class TestGenerica <T extends Number> {
	
	public static void main(String[] args) {
		
	}


}

class Generica <T extends Number> {
	
	T sumar(T num1, T num2) {
		Integer i = num1.intValue()+num2.intValue();
		return (T) i;
	}


}