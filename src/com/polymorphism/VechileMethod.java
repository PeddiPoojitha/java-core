package com.polymorphism;


class Vehicle{
	void start() {
		System.out.println("Vehicle started");
	}
}
class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car started ");
	}
}

public class VechileMethod {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.start();
		System.out.println("=====================================");
		Vehicle v2=new Car();
		v2.start();
		

	}

}
