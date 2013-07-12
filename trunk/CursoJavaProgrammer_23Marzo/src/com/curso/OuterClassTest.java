package com.curso;

import com.curso.OuterClass.StaticNestedClass;

public class OuterClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterClass.StaticNestedClass SNC = new OuterClass.StaticNestedClass(); //la clase nested existe como estatica en la outer class
		OuterClass.InnerClass IC = new OuterClass().new InnerClass(); //la clase inner existe solo dentro de los objetos de la outer

	}

}
