package stack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

import api.IFigure;

public class StackRealization {
	private Node head;
	private int size;

	public int getSize() {
		return size;
	}

	public StackRealization() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void push(IFigure item) {
		Node newNode = new Node();
		newNode.setItem(item);
		Node current = head;
		if (current != null) {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		} else {
			head = newNode;
		}
		size++;
	}

	void serializationObject(String file) {
		Node current = head;
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			if (current != null) {
				while (current.getNext() != null) {
					objectOutputStream.writeObject(current);
					current = current.getNext();
				}
				objectOutputStream.writeObject(current);
			}
			System.out.println("Stack elements are serialized to a file " + file);
			objectOutputStream.flush();
			objectOutputStream.close();
		} catch (IOException e) {
			System.out.println("Read/write error");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void deserializationObject(String file, String fileResult) {
		Node current = head;
		try {
			PrintStream filePr = new PrintStream(new File(fileResult));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			if (current != null) {
				while (current.getNext() != null) {
					Node readObj = (Node) ois.readObject();
					filePr.println(readObj);
					current = current.getNext();
				}
				Node readObj = (Node) ois.readObject();
				filePr.println(readObj);
			}
			System.out.println("The result of deserialization of stack elements is written to a file " + fileResult);
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Read/write error");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String toString() {

		StringBuilder result = new StringBuilder();
		Node current = head;
		if (current != null) {
			while (current.getNext() != null) {
				result.append(current.getItem().toString() + "\n");
				current = current.getNext();
			}
			result.append(current.getItem().toString());
		}
		return result.toString();
	}
}
