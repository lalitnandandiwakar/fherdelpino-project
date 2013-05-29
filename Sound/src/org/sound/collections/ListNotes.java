package org.sound.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.sound.scale.Notes;

public class ListNotes<E extends Notes> extends ArrayList<E> {

	/**
	 * Default
	 */
	private static final long serialVersionUID = 1L;
	
	public ListNotes() {
		super();
	}

	public ListNotes(Collection<? extends E> c) {
		super(c);
	}

	public ListNotes(E[] e) {
		super(Arrays.asList(e));
	}

	@Override
	public E get(int i) {
		if (i >= this.size()) {
			i -= this.size();
		}
		return super.get(i);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder("[");
		if (this.size() < 1) {
			s.append("isEmpty]");
			return s.toString();
		}
		for (int i = 0; i < this.size(); i++) {
			s.append(this.get(i).getValue());
			if (i >= this.size() - 1) {
				s.append("]");
				return s.toString();
			}
			s.append(",");
		}
		
		return "Error!";
	}

}
