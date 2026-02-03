package com.polymorphism;

class Shape{
	void draw() {
		System.out.println("Drawing a Shape");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing circle");
		
	}
}
class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing Square");
	}
}

public class ShapeDetails {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Square();
		for(Shape s: shapes) {
			s.draw();
			
		}
			

	}

}
