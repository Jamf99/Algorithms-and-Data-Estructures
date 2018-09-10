package com.ade.estructures;

public class Node<T> {

	private T element;
	
	public Node<T> next;
	
	public Node(T element, Node<T> next) {
		this.element = element;
		this.next = next;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
}