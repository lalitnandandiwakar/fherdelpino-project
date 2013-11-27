package com.mp3.metadata;

import java.io.File;

public class Rename {

	static String path = "C:\\Users\\delpinof\\Music\\A Perfect Circle - aMOTION";

	public static void main(String args[]) {
		File f = getFirstFile();
		
	}

	static File getFirstFile() {
		File dir = new File(path);
		File files[] = dir.listFiles();
		return files[0];
	}
	
	

}
