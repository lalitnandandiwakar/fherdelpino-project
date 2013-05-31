package com.curso.simulador;

import java.io.File;

public class Foo {

	static int[] a;

//	static {
//		a.clone();
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] path = {"opt","workspaces","equinoccioshow", "images"};
		System.out.println(doesFileExists(path, "1a.jpg"));
		callUpdate();
	}

	public static boolean doesFileExists(String[] directories, String filename) {
		String path = "";
		for (String dir : directories) {
			path = path + File.separator + dir;
		}
		File f = new File(path, filename);
		return f.exists();
	}
	
	public static int update (int quantity, int adjust) {
		quantity = quantity + adjust;
		return quantity;
	}
	
	public static void callUpdate() {
		int quant = 100;
		quant = update(quant,320);
		System.out.println(quant);
	}
	


}
