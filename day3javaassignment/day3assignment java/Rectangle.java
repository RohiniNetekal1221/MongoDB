package com.sonata.day3assignment;

public class Rectangle extends Shape {
	Rectangle() {}
	Rectangle(float l, float w) {
		super.length = l;
		super.width = w;
	}
	/*@Override
	public void draw() {
		System.out.println("Drawing a Rectangle...\nDrawing done with Length - " + length + "cm and Width - " + width + "cm");
	}*/
	@Override
	public float calcArea() {
		return length * width;
	}
	/*public String toString() {
		draw();
		return "Area of Rectangle - " + calcArea() + "cm\n\n";
	}
}