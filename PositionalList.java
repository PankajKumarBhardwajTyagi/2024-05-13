package com.cts.dsa.util;

public interface PositionalList<E> {
	public int size();
	public boolean isEmpty();
	
	public Position<E> addFirst(E element); // inserts the element at the front of the list & returns the position
	public Position<E> addLast(E element); // inserts the element at the back of the list & returns the position
	// inserts the element before the position given & returns the position of the element
	// public Position<E> addBefore(Position<E> position, E element) throws RuntimeException;
	public Position<E> addBefore(E beforeElement, E elementToAdd) throws RuntimeException;
	// inserts the element after the position given & returns the position of the element
	// public Position<E> addAfter(Position<E> position, E element) throws RuntimeException;
	public Position<E> addAfter(E afterElement, E elementToAdd) throws RuntimeException;

	public Position<E> first(); // returns the first position in the list
	public Position<E> last(); // returns the last position in the list
	public Position<E> before(Position<E> position) throws RuntimeException; // returns the position before the postion given
	public Position<E> after(Position<E> position) throws RuntimeException; // returns the position after the position given
	public E at(int index) throws RuntimeException; // returns the element at the index of the position given
	
	// public E set(Position<E> position, E element) throws RuntimeException; // replaces the element at the position & returns the element
	public E set(E elementToUpdate, E newElement) throws RuntimeException;
	
	public E remove(E element) throws RuntimeException; // removes the element at the position & returns the element
	public E removeFirst() throws RuntimeException; // removes the element at the first position & returns the element
	public E removeLast() throws RuntimeException; // removes the element at the last position & returns the element
}