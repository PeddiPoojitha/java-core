package com.polymorphism;

class Parent{
	static void Print() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	static void Print() {
		System.out.println("Child");
		
	}
}
public class Example1 {

	public static void main(String[] args) {
		Parent p1=new Parent();
		//Parent p2=new Child();
		Child c1=new Child();
		p1.Print();
		//p2.print();
		c1.Print();
	
		
		
	}

}
