package com.cts.dsa.util;

import java.util.NoSuchElementException;

public interface Iterator<E> {
	public boolean hasNext();
	public E next() throws NoSuchElementException;
}