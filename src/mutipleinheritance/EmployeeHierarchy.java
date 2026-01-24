package mutipleinheritance;

class Employee{
	String name;
	double baseSalary;
	public Employee(String name, double baseSalary) {
		super();
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public void calculateAnnualSalary() {
		System.out.println("name:"+name);
		System.out.println("baseSalary:"+baseSalary);
		double sal=baseSalary*12;
		System.out.println("sal:"+sal);	
	}
}
class  Manager extends Employee{
	double bonus;
	int numberOfEmployeesManaged;
	public Manager(String name, double baseSalary, int bonus, int numberOfEmployeesManaged) {
		super(name, baseSalary);
		this.bonus = bonus;
		this.numberOfEmployeesManaged = numberOfEmployeesManaged;
	}
	public void calculateManagerSalary()  {
		System.out.println("name:"+name);
		System.out.println("baseSalary:"+baseSalary);
		double sal=(baseSalary*12)+bonus;
        System.out.println("sal:"+sal);
    }
}
class Engineer extends Employee{
	int projectCount;

	public Engineer(String name, double baseSalary, int projectCount) {
		super(name, baseSalary);
		this.projectCount = projectCount;
	}
	public void calculateEngineerSalary() {
		System.out.println("name:"+name);
		System.out.println("baseSalary:"+baseSalary);
		double sal=(baseSalary*12)+(projectCount*1000);
        System.out.println("sal:"+sal);
    }
}
class  Salesperson extends Employee{
	double commissionRate;
	long totalSales;
	public Salesperson(String name, double baseSalary, double commissionRate, long totalSales) {
		super(name, baseSalary);
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
	}
	 public void calculateSalespersonSalary() {
		 System.out.println("name:"+name);
		 System.out.println("baseSalary:"+baseSalary);
		 double sal=(baseSalary*12)+(commissionRate/100)*totalSales;
	     System.out.println("sal:"+sal);
	    }
}

public class EmployeeHierarchy {

	public static void main(String[] args) {
		Employee emp = new Manager("Alice", 50000, 10000, 5); 
		Manager manager=(Manager)emp;
		manager.calculateManagerSalary();
		
		//manager.calculateAnnualSalary();
		System.out.println("----------------------------");
		Employee emp1 = new Salesperson("Charlie", 40000, 0.1, 200000);
		Salesperson sales=(Salesperson)emp1;
		sales.calculateSalespersonSalary();
		System.out.println("==============================");
		Employee emp2= new Engineer("Bob", 70000, 5); 
		Engineer engineer=(Engineer)emp2;
		engineer.calculateEngineerSalary();	
	}
}
