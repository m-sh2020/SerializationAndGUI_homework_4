package impl;

import java.io.Serializable;

import api.IFigure2D;
import api.IFigure3D;

public class Parallelepiped implements IFigure2D, IFigure3D, Serializable {

	private static final long serialVersionUID = 1L;
	private double width;
	private double length;
	private double height;

	public Parallelepiped(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	@Override
	public double perimetr() {
		return 4 * (this.width + this.length + this.height);
	}

	@Override
	public double square() {
		return 2 * (this.width * this.length + this.width * this.height + this.length * this.height);
	}

	@Override
	public double volume() {
		return this.width * this.length * this.height;
	}

	@Override
	public String toString() {
		return "Parallelepiped: length = " + this.length + ", width = " + this.width + ", height = " + this.height
				+ "\nsquare = " + square() + ", perimetr = " + perimetr() + ", volume = " + volume() + "\n";
	}
}
