package com.mp3.metadata;

import java.io.File;

import org.cmc.music.metadata.MusicMetadataSet;
import org.cmc.music.myid3.MyID3;

public class Rename {

	private File rootFolder;
	private static final String MP3 = ".mp3";

	public Rename(String path) {

		rootFolder = new File(path);

		if (!rootFolder.exists()) {
			System.err.print("dont exists!: " + rootFolder.getAbsolutePath());
			System.exit(1);
		}
		if (!rootFolder.isDirectory()) {
			System.err
					.print("is not a folder: " + rootFolder.getAbsolutePath());
			System.exit(1);
		}
	}

	public void renameSongs() {
		for (File f : rootFolder.listFiles()) {
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
	}

	private void rename(File f, String path, String fileName, String album) {

		File validate = new File(rootFolder + "/" + fileName);

		if (validate.exists()) {
			fileName = fileName.replace(MP3, album + MP3);
		}

		System.out.print(f.getName());
		System.out.print(" --> ");
		System.out.println(fileName);
		boolean result = f.renameTo(new File(path + fileName));
		System.out.println(result ? "Done!" : "Error!");
	}

	private String[] getMetaData(File f) throws Exception {
		MusicMetadataSet metaDataSet = null;
		metaDataSet = new MyID3().read(f);

		if (metaDataSet == null) {
			throw new Exception("There is no metadata for this file!");
		}

		StringBuilder path = new StringBuilder(f.getParentFile().getPath())
				.append("/");

		StringBuilder fileName = new StringBuilder(metaDataSet.getSimplified()
				.getArtist());
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
