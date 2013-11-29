package com.mp3.metadata;

import com.mp3.metadata.bean.SongSimpleMetadata;

public class MetaDataConfiguration {

	private static final String[] NOT_ALLOWED = { "/", "?" };
	private static final String[] TO_REPLACE = { "_", "" };

	public String getFileName(SongSimpleMetadata s) {
		
		String filename = s.getArtist() + " - " + s.getTitle();
		
		for (int i = 0; i < NOT_ALLOWED.length; i++)
			filename = filename.replace(NOT_ALLOWED[i], TO_REPLACE[i]);
				
		return filename;
	}

}
