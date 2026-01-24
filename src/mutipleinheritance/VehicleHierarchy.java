package mutipleinheritance;
class  Vehicle{
	public String make;
	public String model;
	public int year;
	Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

	public void displayInfo() {
		System.out.println("Vehicle make:"+make);
		System.out.println("Vehicle model:"+model);
		System.out.println("Vehicle year:"+year);
	}
}
class  Car extends Vehicle{
	Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

	public int numberOfDoors;
	public void displayCarInfo() {
		System.out.println("Vehicle make:"+make);
		System.out.println("Vehicle model:"+model);
		System.out.println("Vehicle year:"+year);
		System.out.println("number of Doors:"+numberOfDoors);
		
	
	}
}
class Truck extends Vehicle{
	public int cargoCapacity;

	Truck(String make, String model, int year, int cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

	public void displayTruckInfo() {
		System.out.println("Vehicle make:"+make);
		System.out.println("Vehicle model:"+model);
		System.out.println("Vehicle year:"+year);
		System.out.println("cargo capacity:"+cargoCapacity);
		
	}
}
class  Motorcycle extends Vehicle{
	public boolean hasSidecar;
	Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

	
	public void displayMotorcycleInfo() {
		System.out.println("Vehicle make:"+make);
		System.out.println("Vehicle model:"+model);
		System.out.println("Vehicle year:"+year);
		System.out.println("has sidecar:"+hasSidecar);
	}
}
public class VehicleHierarchy {

	public static void main(String[] args) {
		Vehicle vh = new Car("Toyota", "Corolla", 2022, 4);
       // vh.displayInfo();
        Car car=(Car)vh;
        car.displayCarInfo();
        System.out.println("--------------------------------");

        Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
        //truck.displayInfo();
        ((Truck) truck).displayTruckInfo();
        System.out.println("================================");

        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);
        //motorcycle.displayInfo();
        ((Motorcycle) motorcycle).displayMotorcycleInfo();
		

	}

}
