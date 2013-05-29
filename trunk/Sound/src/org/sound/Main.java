package org.sound;

import java.util.ArrayList;
import java.util.List;

import org.sound.scale.Notes;
import org.sound.scale.Scale;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Notes[] analize = {Notes.F, Notes.G, Notes.A, Notes.A$, Notes.C, Notes.D};
		
		
		List<Notes> lista = new ArrayList<Notes>(Utils.belongsTo(analize));
		for (Notes note : lista)
		Logic.print4NotesChords(new Scale(note));
		
		
//		Utils.printAllScales();
//		Chord3Notes chord = new Chord3Notes(Notes.C);
//		Utils.printValues(chord.getChord());


	}

}
