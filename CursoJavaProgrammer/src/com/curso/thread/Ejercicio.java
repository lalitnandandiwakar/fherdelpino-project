package com.curso.thread;

public class Ejercicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MiEntero i = new MiEntero();

		MiRunnable r = new MiRunnable(i);
		MiRunnable r2 = new MiRunnable(i);

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r2);

		t1.setName("Hilo1");
		t2.setName("Hilo2");

		t1.start();
		t2.start();

	}

}

class MiRunnable implements Runnable {

	MiEntero i;

	public MiRunnable(MiEntero i) {
		this.i = i;

	}

	@Override
	public void run() {

		while (i.getI() <= 50)
			i.inc2();

	}

}

class MiEntero {

	private Integer i = 1;
	private boolean bandera;

	public void inc() {
		synchronized (i) {

			String tn = Thread.currentThread().getName();

			if ((!bandera && tn.equals("Hilo1"))
					|| (bandera && tn.equals("Hilo2"))) {
				System.out.println(tn + ": " + i++);
				bandera = !bandera;
			}

		}
	}

	public synchronized void inc2() {
			String tn = Thread.currentThread().getName();

			if (tn.equals("Hilo1")) {
				while (bandera) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
				bandera = !bandera;				
			}

			if (tn.equals("Hilo2")) {
				while (!bandera) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
				bandera = !bandera;				
			}
			System.out.println(tn + ": " + i++);
			notify();
	}

	public int getI() {
		return i;
	}

}
