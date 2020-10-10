package impl;

import java.io.Serializable;

import api.IFigure2D;

public class Rectangle implements IFigure2D, Serializable {

	private static final long serialVersionUID = 1L;
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double perimetr() {
		return (this.length + this.width) * 2;
	}

	@Override
	public double square() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle: length = " + this.length + ", width = " + this.width + "\nsquare = " + square()
				+ ", perimetr = " + perimetr() + "\n";
	}
}
