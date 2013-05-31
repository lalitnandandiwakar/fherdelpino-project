package com.curso.simulador;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TestFive {
	
	private int x;
	
	public void foo() {
		synchronized (this) {
			
		
		int current = x;
		x = current +1;
		System.out.print(x +",");
		}
	}
	
	public void go() {
		for (int i=0; i<5; i++){
			new Thread() {
				public void run() {
					foo();
					
				}
			}.start();
		}
	}

	public static void main(String... args) {
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(new Date()));
		new TestFive().go();
	}
}
