package mutipleinheritance;


class  Shape{
	public double calculateArea() {
		return 0.0;
	}
}
class  Circle extends Shape{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	double calculateCircleArea(){
		return Math.PI*radius*radius;
		
	}
	public double calculateArea() {
        return calculateCircleArea();
    }
	
}
class Rectangle extends Shape{
	int length;
	int width;
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	double calculateRectangleArea() {
		return length*width;
	}
	 public double calculateArea() {
	        return calculateRectangleArea();
	    }
}
class Triangle extends Shape{
	int base;
	int heigth;
	public Triangle(int base, int heigth) {
		super();
		this.base = base;
		this.heigth = heigth;
	}
	double calculateTriangleArea() {
		return 0.5*base*heigth;
	}
    public double calculateArea() {
        return calculateTriangleArea();
    }

	
}

public class ShapeHierarchy {

	public static void main(String[] args) {
		Shape sh = new Circle(5);
		Circle circle=(Circle)sh;
		circle.calculateCircleArea();
		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("====================");
		Shape sh1 = new Rectangle(4, 6); 
		Rectangle rectangle=(Rectangle)sh1;
		rectangle.calculateRectangleArea();
		System.out.println("Rectangle Area: " + rectangle.calculateRectangleArea());
		System.out.println("--------------------");
		Shape sh2 = new Triangle(3, 7); 
		Triangle triangle=(Triangle)sh2;
		triangle.calculateTriangleArea();
		System.out.println("Triangle Area: " + triangle.calculateTriangleArea());
		
		
		
		

	}

}
