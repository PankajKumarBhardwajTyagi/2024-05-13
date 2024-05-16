package com.cts.dsa.util;

public class SinglyLinkedPositionalList<E> implements PositionalList<E> {
	
	private SinglyNode<E> head = null;
	private SinglyNode<E> tail = null;
	private int size = 0;
	
	@Override public int size() { return size; }

	@Override public boolean isEmpty() { return size == 0; }

	@Override public Position<E> addFirst(E element) { 
		head = new SinglyNode<E>(element, head);
		if(isEmpty()) tail = head;
		++size;
		return head;
	}

	@Override public Position<E> addLast(E element) {
		SinglyNode<E> node = new SinglyNode<E>(element, null);
		if(isEmpty()) head = tail = node; 
		else {
			tail.setNext(node);
			tail = node;
		}
		++size;
		return node;
	}

	@Override public Position<E> addBefore(E beforeElement, E elementToAdd) throws RuntimeException {
		return null;
	}

	@Override public Position<E> addAfter(E afterElement, E elementToAdd) throws RuntimeException {
		return null;
	}

	@Override public Position<E> first() { return isEmpty() ? null : head; }

	@Override public Position<E> last() { return isEmpty() ? null : tail; }

	@Override public Position<E> before(Position<E> position) throws RuntimeException {
		return null;
	}

	@Override public Position<E> after(Position<E> position) throws RuntimeException {
		return ((SinglyNode<E>) position).getNext();
	}

	@Override public E at(int index) throws RuntimeException {
		SinglyNode<E> node = head;
		int position = 0;
		while(position++ < index) node = node.getNext();
		return node.getElement();
	}

	@Override public E set(E elementToUpdate, E newElement) throws RuntimeException {
		return null;
	}

	@Override public E remove(E element) throws RuntimeException {
		if(isEmpty()) return null;
		SinglyNode<E> node = head;
		while(node != tail) {
			if(node.getNext().getElement() == element) {
				node.setNext(node.getNext().getNext());
				--size;
				break;
			}
			node = node.getNext();
		}
		return element;
	}

	@Override public E removeFirst() throws RuntimeException {
		if(isEmpty()) return null;
		E answer = head.getElement();
		head = head.getNext();
		--size;
		if(isEmpty()) head = tail = null;
		return answer;
	}

	@Override public E removeLast() throws RuntimeException {
		if(isEmpty()) return null;
		E answer = tail.getElement();
		SinglyNode<E> secondLastNode = head;
		while(secondLastNode.getNext() != tail) {
			secondLastNode = secondLastNode.getNext();
		}
		secondLastNode.setNext(null);
		--size;
		if(isEmpty()) head = tail = null; else tail = secondLastNode;
		return answer;
	}

	@Override public String toString() {
		return "SinglyLinkedPositionalList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}

}