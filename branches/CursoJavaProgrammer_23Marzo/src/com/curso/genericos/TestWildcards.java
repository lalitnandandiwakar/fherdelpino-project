package com.curso.genericos;

import java.util.ArrayList;
import java.util.List;

public class TestWildcards {
	public static void main(String[] args) {
		Wildcards w = new Wildcards();

		w.foo(new ArrayList<String>());
		w.foo(new ArrayList<Integer>());

		w.foo2(new ArrayList<String>());
		w.foo2(new ArrayList<Integer>());
	}

}

class Wildcards {
	
	void foo(List<?> i) {
		// i.set(0,i.get(0)); Marca error de compilación
		fooHelper(i);
	}

	private <T> void fooHelper(List<T> l) {
		l.set(0, l.get(0));
	}

	<T> void foo2(List<T> l) {
		l.set(0, l.get(0));
	}

}
