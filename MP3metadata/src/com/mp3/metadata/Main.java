package com.mp3.metadata;

import javax.swing.JOptionPane;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Folder to work:","C:\\Users\\delpinof\\Music\\test"); 
		Rename r = new Rename();
		try {
			r.renameSongsInFolder(s);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	
}
