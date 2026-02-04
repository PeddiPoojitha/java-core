package com.abstraction;

abstract class Employee {
	 String name;
	 String employeeId;
	 
	public Employee(String name, String employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}
	abstract void calculateSalary();
	public void applyLeave() {
		System.out.println("Leave applied successfully.");
	}
	public void getDetails() {
		System.out.println("Employee Details: " + name + ", ID: " + employeeId);
	}
}
class FullTimeEmployee extends Employee{
	double basePay;
	double benefits;
	public FullTimeEmployee(String name, String employeeId, double basePay, double benefits) {
		super(name, employeeId);
		this.basePay = basePay;
		this.benefits = benefits;
	}
	@Override
	void calculateSalary() {
		double totalSalary=basePay+benefits;
		System.out.println("totalsalary:"+totalSalary);
	}	
}
class PartTimeEmployee extends Employee{
	double hourlyRate;
	int hoursWorked;
	public PartTimeEmployee(String name, String employeeId, double hourlyRate, int hoursWorked) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	@Override
	void calculateSalary() {
		double salary= hourlyRate* hoursWorked;
		System.out.println("sal:"+salary);
	}
	
}
class  Freelancer extends Employee{
	double projectPayment;

	public Freelancer(String name, String employeeId,double projectPayment) {
		super(name,employeeId);
		this.projectPayment = projectPayment;
	}
	void calculateSalary() {
		
		System.out.println("Projectpay:"+projectPayment);
	}
	
}

public class EmployeePayrollSystem {

	public static void main(String[] args) {
		Employee emp=new FullTimeEmployee("John Doe", "12345", 50000, 10000);
		emp.calculateSalary();
		emp.applyLeave();
		emp.getDetails();
		System.out.println("------------------------------");
		Employee emp1=new PartTimeEmployee("Jane Smith", "67890", 20, 15);
		emp1.calculateSalary();
		emp1.applyLeave();
		emp1.getDetails();
		System.out.println("------------------------------");
		Employee emp2=new Freelancer("Alice Johnson", "54321", 5000);
		emp2.calculateSalary();
		emp2.applyLeave();
		emp2.getDetails();
		

	}

}
