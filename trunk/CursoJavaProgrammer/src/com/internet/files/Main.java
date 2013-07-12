package com.internet.files;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
	public static void main(String[] args) {
		String src = "http://ifuckedyourgf.com/jizzonmygf4/001-amateur-blonde-bimbo-who-got-her-shaved-pussy-creamed/";
		String dest = "C:\\Users\\delpinof\\Desktop\\tmp\\";

		for (int i = 1; i < 15; i++) {
			String filename = String.valueOf(i) + ".jpg";
			if (i < 9)
				filename = "0" + filename;
			downloadFile(src, dest, filename);
		}

	}

	public static void downloadFile(String src, String dest, String filename) {
		URL url; // represents the location of the file we want to dl.
		URLConnection con; // represents a connection to the url we want to dl.
		DataInputStream dis; // input stream that will read data from the file.
		FileOutputStream fos; // used to write data from inut stream to file.
		byte[] fileData; // byte aray used to hold data from downloaded file.
		try {
			url = new URL(src + filename);
			con = url.openConnection(); // open the url connection.
			dis = new DataInputStream(con.getInputStream()); // get a data
																// stream from
																// the url
																// connection.
			fileData = new byte[con.getContentLength()]; // determine how many
															// byes the file
															// size is and make
															// array big enough
															// to hold the data
			for (int x = 0; x < fileData.length; x++) { // fill byte array with
														// bytes from the data
														// input stream
				fileData[x] = dis.readByte();
			}
			dis.close(); // close the data input stream
			fos = new FileOutputStream(new File(dest + filename)); // create an
																	// object
																	// representing
																	// the file
																	// we want
																	// to save
			fos.write(fileData); // write out the file we want to save.
			fos.close(); // close the output stream writer
		} catch (MalformedURLException m) {
			System.out.println(m);
		} catch (IOException io) {
			System.out.println(io);
		}
	}

}