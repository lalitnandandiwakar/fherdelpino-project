package com.mp3.metadata;

import javax.swing.JOptionPane;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Folder to work:"); 
		new Rename(s).renameSongs();
		
	}
	
}
