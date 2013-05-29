package org.sound.scale;

import java.util.Arrays;

import org.sound.collections.ListNotes;

public class Chord3Notes extends Scale {

	protected static int size = 3;
	protected Notes[] chord;
	protected Notes baseNote;

	/**
	 * 
	 * @param note
	 * @param scale
	 */
	public Chord3Notes(Notes note, Scale scale) {
		super(scale.getBaseNote());
		baseNote = note;
		chord = new Notes[size];
		build();
	}

	private void build() {
		int i = scale.indexOf(baseNote);
		chord[0] = scale.get(i + 0);
		chord[1] = scale.get(i + 2);
		chord[2] = scale.get(i + 4);
	}

	public Notes[] getChord() {
		return chord;
	}

	public String toString() {
		return new ListNotes<Notes>(Arrays.asList(chord)).toString();
	}

}
