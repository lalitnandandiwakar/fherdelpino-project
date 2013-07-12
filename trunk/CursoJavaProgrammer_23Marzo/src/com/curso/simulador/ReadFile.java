package com.curso.simulador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ReadFile {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
			File x1 = new File("MyText.txt");
			FileReader fr = new FileReader(x1);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader x2 = new BufferedReader(fr);
			
	

	}

}
