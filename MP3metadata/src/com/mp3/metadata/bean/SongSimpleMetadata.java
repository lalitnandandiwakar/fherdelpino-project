package com.mp3.metadata.bean;

public class SongSimpleMetadata {

	private String artist;
	private String title;
	private String album;
	private String track;

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	private static final String ARTIST = "ARTIST";
	private static final String TITLE = "TITLE";
	private static final String ALBUM = "ALBUM";
	private static final String COLON = ": ";

	public SongSimpleMetadata() {

	}

	/**
	 * Constructor
	 * 
	 * @param artist
	 * @param title
	 * @param album
	 */
	public SongSimpleMetadata(String artist, String title, String album) {
		this.artist = artist;
		this.title = title;
		this.album = album;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String toString() {
		return ARTIST + COLON + artist + "/" + ALBUM + COLON + album + "/"
				+ TITLE + COLON + title;
	}

	public boolean equals(SongSimpleMetadata s) {
		boolean a = this.artist.equals(s.artist);
		boolean b = this.title.equals(s.title);
		return a && b;
	}

}
