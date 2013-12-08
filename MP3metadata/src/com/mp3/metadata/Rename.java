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
//				preRename(f);
				renameFile(f);				
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}
	
	public void preRename(File sourceFile) throws Exception {
		rootFolder = sourceFile.getParentFile();
		MetaDataBuilder builder = new MetaDataBuilder();
		SongSimpleMetadata md = builder.getMetaData(sourceFile);
		String absoluteFileName = rootFolder + "\\" + md.getTrack() + EXTENSION;
		File dest = new File(absoluteFileName);
		boolean b = sourceFile.renameTo(dest);
		if (!b)
			System.err.println("Error:" + absoluteFileName);
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

		//if the name is the same, do not change anything
		if (!absoluteFileName.equals(sourceFile.getAbsolutePath())) {
			
			// validate the new name file don't exist already in the folder
			if (new File(absoluteFileName).exists()) {
				fileName = config.getFileNameWithAlbum(song);
				absoluteFileName = rootFolder + "\\" + fileName + EXTENSION;
			}

			File destFile = new File(absoluteFileName);

			System.out.println(sourceFile.getName() + " --> " + destFile.getName());

			boolean result = sourceFile.renameTo(destFile);

			if (result)
				System.out.println("Done!");
			else
				System.err.println("Error!");
		}

	}
}
