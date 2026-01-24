package inheritance_pratice;

class company {
	int a;
	
	public company(int a) {
		this.a=a;
		System.out.println("it is grand parent");
		
		
	}

}
class Employee extends company{
	public Employee(int a) {
		super(a);
		System.out.println("it is a parent");
		
		
	}
	  
}
class Manager extends Employee{
	public Manager() {
		super(32);
		System.out.println("it is a child");
		
	}
	public static void main(String[] args) {
		Manager m=new Manager();
		
	    
	}
	
}

