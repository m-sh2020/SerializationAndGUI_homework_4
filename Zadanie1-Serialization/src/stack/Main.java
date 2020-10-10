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
import impl.*;

public class Main {

	static void serializationObject(IFigure figure, String file) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			objectOutputStream.writeObject(figure);
			System.out.println("Rectangle is serialized to a file " + file);
			objectOutputStream.close();
		} catch (IOException e) {
			System.out.println("Read/write error");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void deserializationObject(String file, String fileResult) {
		try {
			PrintStream filePr = new PrintStream(new File(fileResult));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			filePr.println(ois.readObject());
			System.out.println("The deserialization result is written to a file " + fileResult);
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Read/write error");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		//serializing and deserializing a rectangle instance
		Rectangle rec = new Rectangle(3, 5);
		serializationObject(rec, "myFile1.ser");
		deserializationObject("myFile1.ser", "Result1.ser");
		
		//stack serialization and deserialization
		StackRealization stackFigure = new StackRealization();
		stackFigure.push(new Rectangle(3, 7));
		stackFigure.push(new Circle(10));
		stackFigure.push(new Triangle(3, 4, 5));
		stackFigure.push(new Parallelepiped(3, 5, 6));
		stackFigure.push(new Tetrahedron(3));
		stackFigure.push(new Sphere(5));
		stackFigure.serializationObject("myFile2.ser");
		stackFigure.deserializationObject("myFile2.ser", "Result2.ser");
	}
}
