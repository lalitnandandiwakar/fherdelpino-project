package com.mp3.metadata;

import java.io.File;

import org.cmc.music.metadata.MusicMetadataSet;
import org.cmc.music.myid3.MyID3;

import com.mp3.metadata.bean.SongSimpleMetadata;

public class MetaDataBuilder {
	
	public SongSimpleMetadata getMetaData(File f) throws Exception {

		MusicMetadataSet metaDataSet = new MyID3().read(f);

		if (metaDataSet == null)
			throw new Exception(f.getAbsolutePath() + ": There is no metadata for this file!");

		SongSimpleMetadata song = new SongSimpleMetadata();

		String artist = metaDataSet.getSimplified().getArtist();
		if (artist == null)
			artist = metaDataSet.getSimplified().getBand();
		String title = metaDataSet.getSimplified().getSongTitle();
		String album = metaDataSet.getSimplified().getAlbum();
		Number track = metaDataSet.getSimplified().getTrackNumberNumeric();

		song.setArtist(artist);
		song.setAlbum(album);
		song.setTitle(title);
		if (track != null)
			song.setTrack(track.toString());

		return song;
	}

}
