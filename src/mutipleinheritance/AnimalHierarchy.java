package mutipleinheritance;


class  Animal{
	String name;
	String habitat;
	public Animal(String name, String habitat) {
		super();
		this.name = name;
		this.habitat = habitat;
	}
	public void displayHabitat() {
		System.out.println("animal name:"+name);
		System.out.println("animal habitat:"+habitat);
	}
	
}
class  Mammal extends Animal{
	boolean sWarmBlooded;

	public Mammal(String name, String habitat, boolean sWarmBlooded) {
		super(name, habitat);
		this.sWarmBlooded = sWarmBlooded;
	}
	public void displayMammalInfo() {
		System.out.println("animal name:"+name);
		System.out.println("animal habitat:"+habitat);
		System.out.println("swarmblooded:"+sWarmBlooded);
		
	}
}
class Bird extends Animal{
	boolean canFly;

	public Bird(String name, String habitat, boolean canFly) {
		super(name, habitat);
		this.canFly = canFly;
	}
	public void displayBirdInfo() {
		System.out.println("animal name:"+name);
		System.out.println("animal habitat:"+habitat);
		System.out.println("canfly:"+canFly);
		
	}
}
class Reptile extends Animal{
	boolean isColdBlooded;

	public Reptile(String name, String habitat, boolean isColdBlooded) {
		super(name, habitat);
		this.isColdBlooded = isColdBlooded;
	}
	public void displayReptileInfo() {
		System.out.println("animal name:"+name);
		System.out.println("animal habitat:"+habitat);
		System.out.println("is cold blood:"+isColdBlooded);
		
	}
}
public class AnimalHierarchy {

	public static void main(String[] args) {
		Animal obj= new Mammal("Lion", "Savannah", true);
		Mammal mammal=(Mammal)obj;
		mammal.displayMammalInfo();
		System.out.println("=============================");
		Animal animal= new Bird("Eagle", "Forest", true);
		Bird bird=(Bird)animal;
		bird.displayBirdInfo();
		System.out.println("------------------------------");
		Animal animal1 = new Reptile("Snake", "Desert", true);
		Reptile reptile=(Reptile)animal1;
		reptile.displayReptileInfo();
		
		

	}

}
