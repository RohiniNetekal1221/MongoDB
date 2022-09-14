package com.sonata.day3assignment;

public class Square extends Shape {
	Square() {}
	Square(float s) {
		super.side = s;
	}
	@Override
	public void draw() {
		System.out.println("Draw a Square - " + side + "cm");
	}
	@Override
	public float calcArea() {
		return side * side;
	}
	public String toString() {
		draw();
		return "Area of Square is - " + calcArea() + "cm\n\n";
	}
}