package com.inheritance;
import java.util.*;

class Employee{
	 String empName;
	 String empId;
	 String Dept;
	public Employee(String empName, String empId, String Dept) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.Dept = Dept;
	}
	public void EmployeeDetails() {
		System.out.println("employee name:"+empName);
		System.out.println("employee id:"+empId);
		System.out.println("deptarment:"+Dept);
	}
}
class ProjectEmployee extends Employee{
	String projectName;
	String projectRole;
	int[] performanceScores;
	public ProjectEmployee(String empName, String empId, String Dept, String projectName,String projectRole, int[] performanceScores) {
		super(empName, empId, Dept);
		this.projectName = projectName;
		this.projectRole = projectRole;
		this.performanceScores = performanceScores;
	}
	public void UpdateProjectRole(String newRole) {
		this.projectRole=newRole;
		System.out.println("role is updated:"+newRole);
			
	}
	public void UpdateProjectName(String name) {
		this.projectName=name;
		System.out.println("name is updated:"+name);
	}
	public double AveragePerformanceScore() {
		int sum=0;
		for(int score:performanceScores) {
			sum+=score;
		}
		return (double)sum/performanceScores.length;
			
	}
	public void fullEmployeeDetails() {
		super.EmployeeDetails();
		System.out.println("projectname:"+projectName);
		System.out.println("projectrole:"+projectRole);
			
			
	}
}
public class EmoplyeeAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp name");
		String empName=sc.next();
		sc.nextLine();
		System.out.println("enter emp id");
		String empId=sc.nextLine();
		System.out.println("enter dept name");
		String Dept=sc.nextLine();
		System.out.println("enter project name");
		String projectName=sc.nextLine();
		System.out.println("enter project role");
		String projectRole=sc.nextLine();
		System.out.println("enter performancescore");
		int[] score=new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("month:"+(i+1));
			score[i]=sc.nextInt();
			sc.nextLine();
		}
		ProjectEmployee employee=new ProjectEmployee(empName,empId,Dept,projectName,projectRole,score);
		System.out.println("1.Update Project Role");
		System.out.println("2.Update Project Name");
		System.out.println("3.View Employee Profile");
		System.out.println("4.View Average Performance Score");
		System.out.println("5.Exit");
		boolean status=true;		
		while(status) {
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter update project role:");
				String newRole=sc.nextLine();
				employee.UpdateProjectRole(newRole);
				break;
			case 2:
				System.out.println("enter update project name ");
				String name=sc.nextLine();
				employee.UpdateProjectName(name);
				break;
			case 3:
				employee.EmployeeDetails();
				break;
			case 4:
				System.out.println(employee.AveragePerformanceScore());
				
				break;
			case 5:
				System.out.println("exit");
				status=false;
			default:
				System.out.println("invalid");	
				
			}
			
		}
		
	}

}
