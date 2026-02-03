package com.polymorphism;


class Person{
	protected void display() {
		System.out.println("Im a Person");
	}
}
class Student extends Person{
	@Override
	public void display() {
		System.out.println("Im a Student");
	}
}

public class PersonDetails {

	public static void main(String[] args) {
		//Person p=new Person();
		//p.display();
		//System.out.println("+++++++++++++++++++++++++++++++++++");
		Person p1=new Student();
		p1.display();

	}

}
