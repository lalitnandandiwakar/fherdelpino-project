package com.fherdelpino.mp3player;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.AudioClip;

public class Main {

	public static void main(String args[]) {
		JFXPanel fxPanel = new JFXPanel();

		String bip = "file:C:/Users/delpinof/Downloads/02Lateralus.mp3";

		System.out.println(bip);

		AudioClip audio = new AudioClip(bip);
		audio.play();		

	}

}
