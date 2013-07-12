package com.curso.thread;

public class ThreadTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloRunner r = new HelloRunner();
		
		Thread t = new Thread (r);
		Thread u = new Thread (r);
		
		t.start();
		u.start();
		

	}

}

class HelloRunner implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i<=50;i++)
			System.out.println("hello " + i);
	}
}