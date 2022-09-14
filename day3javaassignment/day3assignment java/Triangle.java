package com.sonata.day3assignment;

public class Triangle extends Shape {
	Triangle() {}
	Triangle(float h, float b) {
		super.height = h;
		super.base = b;
	}
	@Override
	public void draw() {
		System.out.println("Draw a Triangle - " + height + "cm and Base - " + base + "cm");
	}
	@Override
	public float calcArea() {
		return (height * base)/2;
	}
	public String toString() {
		draw();
		return "Area of the Triangle  is - " + calcArea() + "cm\n\n";
	}
}