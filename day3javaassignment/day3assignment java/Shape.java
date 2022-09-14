package com.sonata.day3assignment;

public class Shape {
	int length;
	int width;
	int height;
	Shape(int length,int width,int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
		public int calArea() {
			return 0;
			
		}
		public static void main (String args[]) {
			Shape rect = new Rectangle(10,40,35);
			Shape sqa = new Square(10,25,30);
			Shape tri = new Triangle(10,25,35);
			
			System.out.println("Area of rectangle is"+rect.calArea());
			System.out.println("Area of square is"+sqa.calArea());
			System.out.println("Area of Triangle is"+tri.calArea());
			
		}
}