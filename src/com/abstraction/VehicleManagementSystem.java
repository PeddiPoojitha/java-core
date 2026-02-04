package com.abstraction;


abstract class Vehicle{
	String  modelName;
	String vechileNumber;
	String company;
	public Vehicle(String modelName, String vechileNumber, String company) {
		super();
		this.modelName = modelName;
		this.vechileNumber = vechileNumber;
		this.company = company;
	}
	abstract void startEngine();
	String fuelType() {
		return "petrol";
	}	
}
class Car extends Vehicle{
	int numberofDoors;
	boolean hasSunroof;
	public Car(String modelName, String vechileNumber, String company, int numberofDoors, boolean hasSunroof) {
		super(modelName, vechileNumber, company);
		this.numberofDoors = numberofDoors;
		this.hasSunroof = hasSunroof;
	}
	@Override
	void startEngine() {
		System.out.println("Starting engine with key ignition.");
		
	}

	
}
class Bike extends Vehicle{
	boolean hasSidecar;

	public Bike(String modelName, String vechileNumber, String company, boolean hasSidecar) {
		super(modelName, vechileNumber, company);
		this.hasSidecar = hasSidecar;
	}
	@Override
	void startEngine() {
		System.out.println("Starting engine with kick-start.");
	}
	
}
class Truck extends Vehicle{
	int cargoCapacity;

	public Truck(String modelName, String vechileNumber, String company, int cargoCapacity) {
		super(modelName, vechileNumber, company);
		this.cargoCapacity = cargoCapacity;
	}
	@Override
	void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up.");
	}
	String fuelType() {
		return "Diesel";
	}
	
}
public class VehicleManagementSystem {

	public static void main(String[] args) {
		Vehicle car=new Car("Toyota Camry", "ABC123", "Toyota", 4, true);
		car.startEngine();
		System.out.println("fuel type:"+car.fuelType());
		System.out.println("------------------------------------------");
		Vehicle bike=new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
		bike.startEngine();
		System.out.println("fuel type:"+bike.fuelType());
		System.out.println("------------------------------------------");
		Vehicle truck=new Truck("Volvo FH", "DEF456", "Volvo", 20000);
		truck.startEngine();
		System.out.println("fuel type:"+truck.fuelType());
		
		

	}

}
