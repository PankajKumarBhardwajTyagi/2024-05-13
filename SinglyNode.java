package com.cts.dsa.util;

public class SinglyNode<E> implements Position<E> {
	
	private E element;
	private SinglyNode<E> next;
	
	public SinglyNode(E element, SinglyNode<E> next) {
		this.element = element;
		this.next = next;
	}
	
	@Override public E getElement() { return element; }
	public void setElement(E element) { this.element = element; }
	
	public SinglyNode<E> getNext() { return next; }
	public void setNext(SinglyNode<E> next) { this.next = next; }
	
	@Override public String toString() {
		return "SinglyNode [element=" + element + ", next=" + next + "]";
	}
	
}