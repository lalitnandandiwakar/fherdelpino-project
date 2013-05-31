package com.curso.tutorials;

public class CharSequenceClass implements CharSequence {

	private char[] charArray;

	public CharSequenceClass() {

	}

	public CharSequenceClass(String string) {
		this(string.toCharArray());
	}

	public CharSequenceClass(char[] charArray) {
		this.charArray = charArray;
	}

	@Override
	public int length() {
		return charArray.length;
	}

	@Override
	public char charAt(int index) {
		return charArray[index];
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		char[] temp = new char[end - start];
		System.arraycopy(charArray, start, temp, 0, end - start);
		return new CharSequenceClass(temp);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(charArray);
		return sb.toString();
	}

	public CharSequence backwards() {
		char[] temp = new char[length()];
		int k = 0;
		for (int i = length() - 1; i >= 0; i--)
			temp[k++] = charAt(i);
		return new CharSequenceClass(temp);
	}

	public static void main(String[] args) {

		CharSequenceClass c = new CharSequenceClass("hola mundo");
		System.out.println(c.subSequence(2, 6));
		System.out.println(c.backwards());
	}

}
