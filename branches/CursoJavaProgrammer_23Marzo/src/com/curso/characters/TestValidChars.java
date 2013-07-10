package com.curso.characters;

public class TestValidChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Testing");
		sb.append((char)0);
		sb.append((char)0);
		sb.append((char)1);
		sb.append("more");
		
		System.out.println(remInvChars(sb.toString()));
		
		

	}
	
	public static String remInvChars(String src) {
		 StringBuilder sb = new StringBuilder(src);
		 int index = 0;
		 while ((index = sb.indexOf(String.valueOf((char)0),index)) > -1)	 
			 sb.deleteCharAt(index);
		 return sb.toString();
	 }

}
