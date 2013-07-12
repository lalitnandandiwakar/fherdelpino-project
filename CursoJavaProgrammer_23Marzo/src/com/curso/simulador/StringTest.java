package com.curso.simulador;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "123456789";
		StringBuffer sb = new StringBuffer(s);
//		sb.delete(0, 3);
//		sb.replace(0, 5, "xx");
		sb.delete(1,3).insert(1,"24");
//		System.out.println(s);
		System.out.println(sb);

	}

}
