package com.mp3.metadata;

import java.io.File;

import com.mp3.metadata.bean.SongSimpleMetadata;

public class Rename {

	private File rootFolder;
	private static final String EXTENSION = ".mp3";

	public void renameSongsInFolder(String folder) throws Exception {
		renameSongsInFolder(new File(folder));
	}

	public void renameSongsInFolder(File folder) throws Exception {
		rootFolder = folder;

		String error = null;

		if (!rootFolder.exists())
			error = "dont exists!: " + rootFolder.getAbsolutePath();

		if (!rootFolder.isDirectory())
			error = "is not a folder: " + rootFolder.getAbsolutePath();

		if (error != null) {
			throw new Exception(error);
		}

		renameSongs(folder);
	}

	private void renameSongs(File folder) throws Exception {

		for (File f : folder.listFiles()) {

			if (f.isDirectory()) {
				renameSongs(f);
				continue;
			}

			try {
				renameFile(f);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}

	public void renameFile(String path) throws Exception {
		this.renameFile(new File(path));
	}

	public void renameFile(File sourceFile) throws Exception {

		String error = null;

		if (!sourceFile.exists())
			error = "dont exists!: " + sourceFile.getAbsolutePath();

		if (error != null)
			throw new Exception(error);

		rootFolder = sourceFile.getParentFile();

		MetaDataBuilder mdb = new MetaDataBuilder();
		SongSimpleMetadata song = mdb.getMetaData(sourceFile);

		MetaDataConfiguration config = new MetaDataConfiguration();
		String fileName = config.getFileName(song);

		String absoluteFileName = rootFolder + "\\" + fileName + EXTENSION;

		if (!absoluteFileName.equals(sourceFile.getAbsolutePath())) {
			// validate the file don't exist already
			if (new File(absoluteFileName).exists()) {
				absoluteFileName = absoluteFileName.replace(EXTENSION,
						song.getAlbum() + EXTENSION);
			}

			File destFile = new File(absoluteFileName);

			System.out.println(sourceFile.getName() + " --> " + destFile.getName());

			boolean result = sourceFile.renameTo(destFile);

			if (result)
				System.out.println("Done!");
			else
				System.out.println("Error!");
		}

	}
}
