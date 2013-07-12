package test;

import java.io.File;

public class Main {

	long size;

	public static void main(String args[]) throws InterruptedException {
		while (true) {
			new Main().Start();
			Thread.sleep(5000);
		}

	}

	public void Start() {
		String dir = "C:\\Users\\delpinof\\Ubuntu One\\Age of Empires II";

		sizeFolder(new File(dir));

		System.out.println(size);
	}

	public void sizeFolder(File directory) {
		for (File f : directory.listFiles()) {

			if (f.isDirectory())
				sizeFolder(f);

			size += f.length();

		}
	}

}
