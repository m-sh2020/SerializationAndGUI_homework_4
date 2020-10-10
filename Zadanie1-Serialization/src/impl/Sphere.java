package impl;

import java.io.Serializable;

import api.IFigure2D;
import api.IFigure3D;

public class Sphere implements IFigure2D, IFigure3D, Serializable {

	private static final long serialVersionUID = 1L;
	private double radius;

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double perimetr() {
		return 0;
	}

	@Override
	public double square() {
		return 4 * (Math.PI * this.radius * this.radius);
	}

	@Override
	public double volume() {
		return (4.0 / 3.0) * (Math.PI * Math.pow(this.radius, 3));
	}

	@Override
	public String toString() {
		return "Sphere: radius = " + this.radius + "\nsquare = " + square() + ", volume = " + volume() + "\n";
	}
}
