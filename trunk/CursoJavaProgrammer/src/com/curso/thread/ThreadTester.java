package com.curso.thread;

public class ThreadTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloRunner r = new HelloRunner();
		
		Thread t = new Thread (r);
		Thread u = new Thread (r);
		
		t.setName("h1");
		u.setName("h2");
		
		t.start();
		u.start();
		
		try {
			System.out.println("join");
			t.join();
			System.out.println("unjoin");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

class HelloRunner implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i<=50;i++)
			System.out.println(Thread.currentThread().getName()+": " + i);
	}
}