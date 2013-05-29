package org.sound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.sound.scale.Notes;
import org.sound.scale.Scale;

public class Utils {

	public static void printValues(Notes[] values) {
		System.out.print("[");
		if (values.length < 1) {
			System.out.println("isEmpty]");
			return;
		}
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i].getValue());
			if (i >= values.length - 1) {
				System.out.println("]");
				return;
			}
			System.out.print(",");
		}
	}

	public static void printValues(Collection<Notes> values) {
		printValues(values.toArray(new Notes[0]));
	}

	public static void printAllScales() {
		for (Notes note : Notes.values()) {
			System.out.print(note.getValue() + " - ");
			printValues(new Scale(note).getScale());
		}
	}

	/**
	 * Analize a collection of notes, return the scales which belongs.
	 * @param analize
	 * @return
	 */
	public static Collection<Notes> belongsTo(Collection<Notes> analize) {
		List<Notes> scale;
		List<Notes> result = new ArrayList<Notes>();
		for (Notes note : Notes.values()) {
			scale = new Scale(note).getScale();
			if (contains(scale,analize))
				result.add(note);
		}
		return result;
	}

	/**
	 * Analize an array of notes, return the scales which belongs.
	 * @param analize
	 * @return
	 */
	public static Collection<Notes> belongsTo(Notes[] analize) {
		return belongsTo(Arrays.asList(analize));
	}

	/**
	 * Checks if certain scale contains a list of notes.
	 * @param scale
	 * @param analize
	 * @return
	 */
	public static boolean contains(Collection<Notes> scale,
			Collection<Notes> analize) {

		for (Notes note : analize) {
			if (!scale.contains(note))
				return false;
		}
		return true;
	}

}
