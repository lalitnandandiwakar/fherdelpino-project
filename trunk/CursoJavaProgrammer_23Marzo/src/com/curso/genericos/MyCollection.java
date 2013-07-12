package com.curso.genericos;

import java.util.List;

public interface MyCollection<E, P> extends List<E> {

	void setMyCollection(int index, P val);

}
