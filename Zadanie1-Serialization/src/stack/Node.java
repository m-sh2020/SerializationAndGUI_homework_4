package stack;

import java.io.Serializable;

import api.IFigure;

public class Node implements Serializable {

	private static final long serialVersionUID = 1L;
	private IFigure item;
	private Node next;

	public IFigure getItem() {
		return item;
	}

	public void setItem(IFigure item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String toString() {
		return getItem().toString();
	}
}
