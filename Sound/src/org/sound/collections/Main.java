package org.sound.collections;

import org.sound.Logic;
import org.sound.scale.Chord4Notes;
import org.sound.scale.Notes;
import org.sound.scale.Scale;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
//		for (Notes n : notes) {
//			System.out.print(n.getValue() + " - ");
//			System.out.println(new Scale(n));
//		}
		
		
		
		for (Notes n : Notes.values()) {
			Scale scale = new Scale(n);
			System.out.println(n.getValue()+" - "+scale);
			System.out.println(scale.getAllChords(4));
			
		}

		
		
		
	}

}
