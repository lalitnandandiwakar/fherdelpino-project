package com.fherdelpino.mp3player;

import javafx.scene.media.AudioClip;

public class Player {
	
	private static Player INSTANCE = new Player();
	private AudioClip audio;
	
	public Player() {
		
	}
	
	public static Player getInstance() {
		return INSTANCE;
	}
	
	public void setSong(String song) {
		audio = new AudioClip(song);
	}
	
	public void play() {
		if (audio == null ) 
			throw new IllegalStateException("No song selected");		
		if(!audio.isPlaying())
			audio.play();
	}
	
	public void stop() {
		audio.stop();
	}
	
	public void changeSongAndPlay(String song) {
		if (audio != null)
			stop();
		setSong(song);
		play();
	}

}
