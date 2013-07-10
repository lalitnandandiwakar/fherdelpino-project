package org.sound;

import java.util.ArrayList;

import org.sound.scale.Chord3Notes;
import org.sound.scale.Chord4Notes;
import org.sound.scale.Notes;
import org.sound.scale.Scale;

public class Logic {

	public static void print3NotesChords(Scale scale) {
		System.out.println(scale);
		for (Notes n : scale.getScale()) {
			System.out.print(n.getValue() + " - ");
			System.out.println(new Chord3Notes(n,scale));
		}
	}
	
	public static void print4NotesChords(Scale scale) {
		System.out.println(scale);
		for (Notes n : scale.getScale()) {
			System.out.print(n.getValue() + " - ");
			System.out.println(new Chord4Notes(n,scale));
		}
	}
	
	private static void printChord(Chord3Notes chord) {		
		for (Notes note : new ArrayList<Notes>(chord.getScale())) {
			System.out.print(note.getValue() + " - ");
			chord.setBaseNote(note);
			Utils.printValues(chord.getChord());
		}
	}

	private static void printChords(int n, Scale scale) {
		for (Notes note : scale.getScale()) {
			System.out.print(n + " Notes Chords for " + note.getValue() + " - ");
			System.out.println(new Scale(note).getScale());
			switch(n) {
			case 3:
				print3NotesChords(scale);
				break;
			case 4:
				print4NotesChords(scale);
				break;
			}
		}
	}

	
}
