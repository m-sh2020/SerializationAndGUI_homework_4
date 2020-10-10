package impl;

import java.io.Serializable;

import api.IFigure2D;

public class Circle implements IFigure2D, Serializable {

	private static final long serialVersionUID = 1L;
	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	@Override
	public double perimetr() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public double square() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "Circle: radius = " + radius + "\nsquare = " + square() + ", perimetr = " + perimetr() + "\n";
	}
}
