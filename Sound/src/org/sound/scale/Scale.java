package org.sound.scale;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sound.collections.ListNotes;


public class Scale {

	private Notes baseNote;
	protected List<Notes> scale;

	public Scale(Notes note) {
		baseNote = note;
		build();
	}

	private void build() {
		scale = new ListNotes<Notes>();
		List<Notes> completeScale = new ListNotes<Notes>(Notes.values());
		int base = completeScale.indexOf(baseNote);
		for (int i = base; i < base + 12; i += 2) {
			scale.add(completeScale.get(i = i != base + 6 ? i : i - 1));
		}

	}

	public Notes getBaseNote() {
		return baseNote;
	}

	public List<Notes> getScale() {
		return scale;
	}
	
	public void setBaseNote(Notes note) {
		baseNote = note;
		build();
	}
	
	public List<Notes> get3NotesChord(Notes note) {		
		return getChord(3,note);
	}
	
	public List<Notes> get4NotesChord(Notes note) {
		return getChord(4,note);
	}
	
	public List<Notes> getChord(int n, Notes note) {
		int index = scale.indexOf(note);
		List<Notes> chord = new ListNotes<Notes>();
		for (int i = 0; i<n; i++)
			chord.add(scale.get(index + i*2));
		return chord;
	}
	
	public Map<Notes, List<Notes>> getAllChords(int n) {
		Map<Notes, List<Notes>> map = new HashMap<Notes,List<Notes>>();
		
		for(Notes note : scale) {
			map.put(note, getChord(n,note));
		}
		
		return map;
	}
		
	@Override
	public String toString() {
		return baseNote + "-" + scale.toString();
	}
}
