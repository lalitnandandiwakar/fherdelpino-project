package com.curso.examen;

public class AssertionThrows {

	static void test() throws Error {
		if (true)
			throw new AssertionError();
		System.out.print("test");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception ex) {
			System.out.println("exception");
		}
		System.out.println("end");

	}

}
