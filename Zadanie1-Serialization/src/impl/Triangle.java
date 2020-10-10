package impl;

import java.io.Serializable;

import api.IFigure2D;

public class Triangle implements IFigure2D, Serializable {

	private static final long serialVersionUID = 1L;
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double perimetr() {
		return this.a + this.b + this.c;
	}

	@Override
	public double square() {
		double p = perimetr() / 2.0;
		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
	}

	@Override
	public String toString() {
		return "Triangle: sides = " + this.a + ", " + this.b + ", " + this.c + "\nsquare = " + square()
				+ ", perimetr = " + perimetr() + "\n";
	}
}
