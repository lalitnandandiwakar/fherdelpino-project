package com.mp3.metadata;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import org.cmc.music.metadata.MusicMetadataSet;
import org.cmc.music.myid3.MyID3;

public class Rename {

	private File rootFolder;
	private static final String MP3 = ".mp3";
	private static final String[] NOT_ALLOWED = { "/" };
	private static final String[] TO_REPLACE = { "_" };

	public Rename(String path) {
		this(new File(path));
	}
	
	public Rename(File f) {
		rootFolder = f;

		String error = null;

		if (!rootFolder.exists())
			error = "dont exists!: " + rootFolder.getAbsolutePath();

		if (!rootFolder.isDirectory())
			error = "is not a folder: " + rootFolder.getAbsolutePath();

		if (error != null) {
			JOptionPane.showMessageDialog(null, error, "Error",
					JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}

	public Set<File> renameSongs() {
		
		Set<File> innerFolders = new HashSet<File>();
		
		for (File f : rootFolder.listFiles()) {
			
			if (f.isDirectory()) {
				innerFolders.add(f);
				continue;
			}
				
			String[] metadata;
						
			try {
				metadata = getMetaData(f);
			} catch (Exception e) {
				System.err.println("Error for: " + f.getAbsolutePath());
				e.printStackTrace();
				continue;
			}

			if (metadata == null)
				continue;

			rename(f, metadata[0], metadata[1], metadata[2]);
		}
		
		for(File f : innerFolders) {
			int n = JOptionPane.showConfirmDialog(null, "Execute in " + f.getAbsolutePath() + "?");
			switch (n) {
			case 0:
				new Rename(f).renameSongs();
				break;
			case 2:
				System.exit(1);
			}
		}
		
		return innerFolders;
	}

	private void rename(File f, String path, String fileName, String album) {

		File validate = new File(rootFolder + "/" + fileName);

		// validate that the file don't exist already
		if (validate.exists()) {
			fileName = fileName.replace(MP3, album + MP3);
		}

		// validate invalid characters
		for (int i = 0; i < NOT_ALLOWED.length; i++) {
			fileName = fileName.replace(NOT_ALLOWED[i], TO_REPLACE[i]);
		}

		System.out.print(f.getName());
		System.out.print(" --> ");
		System.out.println(fileName);
		boolean result = f.renameTo(new File(path + fileName));
		System.out.println(result ? "Done!" : "Error!");
	}

	private String[] getMetaData(File f) throws Exception {

		MusicMetadataSet metaDataSet = new MyID3().read(f);

		if (metaDataSet == null)
			throw new Exception("There is no metadata for this file!");

		StringBuilder path = new StringBuilder(f.getParentFile().getPath())
				.append("/");

		String artist = metaDataSet.getSimplified().getArtist();
		if (artist == null)
			artist = metaDataSet.getSimplified().getBand();
		StringBuilder fileName = new StringBuilder(artist);
		fileName.append(" - ");
		fileName.append(metaDataSet.getSimplified().getSongTitle()).append(MP3);

		if (f.getName().equals(fileName.toString()))
			return null;

		StringBuilder album = new StringBuilder("(");
		album.append(metaDataSet.getSimplified().getAlbum());
		album.append(")");

		String[] ar = { path.toString(), fileName.toString(), album.toString() };
		return ar;
	}
}
