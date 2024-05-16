package com.cts.dsa.util;

import java.util.NoSuchElementException;

public class SinglyLinkedListIterator<E> implements Iterator<E> {
	private int nextElementIndex = 0;
	private int size;
	private PositionalList<E> list;
	
	public SinglyLinkedListIterator(PositionalList<E> names) {
		this.list = names;
		size = names.size();
	}

	@Override public boolean hasNext() { return nextElementIndex < size; }

	@Override public E next() {
		if(nextElementIndex == size) throw new NoSuchElementException("No Next Element");
		return list.at(nextElementIndex++);
	}

}