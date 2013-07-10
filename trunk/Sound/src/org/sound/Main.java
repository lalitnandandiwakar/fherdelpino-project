package org.sound;

import org.sound.scale.Notes;
import org.sound.scale.Scale;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Notes[] analize = {Notes.C, Notes.D, Notes.A$, Notes.F, Notes.G};
		
//		System.out.println(Utils.belongsTo(analize));
		
//		for (Notes n : Utils.belongsTo(analize))
//		System.out.println(new Scale(n));
		
		
//		List<Notes> lista = new ArrayList<Notes>(Utils.belongsTo(analize));
//		for (Notes note : lista)
//		Logic.print4NotesChords(new Scale(note));
		
//		Utils.printAllScales();
		
//		Utils.printAllScales();
		Logic.print4NotesChords(new Scale(Notes.C));
//		Utils.printValues(chord.getChord());


	}

}
