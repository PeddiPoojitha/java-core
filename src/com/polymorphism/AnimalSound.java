package com.polymorphism;


class Animal{
	public void makeSound() {
		System.out.println("Animal makes sounds");
	}
}
class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Bark");
		
	}
}

public class AnimalSound {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.makeSound();
		System.out.println("===========================================");
		Animal animal1=new Dog();
		animal1.makeSound();
		

	}

}
