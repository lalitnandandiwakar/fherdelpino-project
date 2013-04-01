package com.curso;

public class Bytes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte r = (byte) 00000007;
		Byte b = new Byte("5");
		
		System.out.println(b.SIZE);		
		System.out.println(b);
		
		int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(bitmask);
        System.out.println(val);
        System.out.println(bitmask & val);
        String s;

	}

}
