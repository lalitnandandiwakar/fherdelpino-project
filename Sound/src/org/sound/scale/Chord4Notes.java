package org.sound.scale;

public class Chord4Notes extends Chord3Notes {
	
	static {
		size = 4;
	}

	/**
	 * 
	 * @param note
	 * @param scale
	 */
	public Chord4Notes(Notes note, Scale scale) {
		super(note, scale);		
		build();
	}
	
	private void build() {
		int i = scale.indexOf(baseNote);
		chord[3] = scale.get(i + 6);
	}
	
	
}
