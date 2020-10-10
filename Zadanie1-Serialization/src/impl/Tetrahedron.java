package impl;

import java.io.Serializable;

import api.IFigure2D;
import api.IFigure3D;

public class Tetrahedron implements IFigure2D, IFigure3D, Serializable {

	private static final long serialVersionUID = 1L;
	private double side;

	public Tetrahedron(double side) {
		this.side = side;
	}

	@Override
	public double perimetr() {
		return 6 * this.side;
	}

	@Override
	public double square() {
		return this.side * this.side * Math.sqrt(3);
	}

	@Override
	public double volume() {
		return (Math.pow(this.side, 3) * Math.sqrt(2)) / 12.0;
	}

	@Override
	public String toString() {
		return "Tetrahedron: side = " + this.side + "\nsquare = " + square() + ", perimetr = " + perimetr()
				+ ", volume = " + volume() + "\n";
	}
}
