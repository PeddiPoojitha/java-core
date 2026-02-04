package com.abstraction;

abstract class User{
	String username ;
	String email;
	String role;
	
	public User(String username, String email, String role) {
		super();
		this.username = username;
		this.email = email;
		this.role = role;
	}

	public abstract void accessDashboard();
	
	public void login() {
		System.out.println("All users can log in");
	}
	public void logOut() {
		System.out.println("All users can log out");
	}
	public void updateProfile() {
		System.out.println("All users can update their profiles");
	}
}
class Student extends User{
	String enrolledCourses;
	String grades;
	public Student(String username, String email, String role, String enrolledCourses, String grades) {
		super(username, email, role);
		this.enrolledCourses = enrolledCourses;
		this.grades = grades;
	}
	@Override
	public void accessDashboard(){
		System.out.println("Accessing student dashboard:"+enrolledCourses+ "Grades:"+grades);
		//System.out.println("Accessing student dashboard:"+grades);
	}
}
class Instructor extends User{
	String createdCourses;
	int studentSubmissions;
	public Instructor(String username, String email, String role, String createdCourses, int studentSubmissions) {
		super(username, email, role);
		this.createdCourses = createdCourses;
		this.studentSubmissions = studentSubmissions;
	}
	@Override
	public void accessDashboard(){
		System.out.println("instructor:"+createdCourses+"std:"+studentSubmissions);
	}
	
}
class Admin extends User{
	String siteAnalytics ;
	String userManagementTools;
	public Admin(String username, String email, String role, String siteAnalytics, String userManagementTools) {
		super(username, email, role);
		this.siteAnalytics = siteAnalytics;
		this.userManagementTools = userManagementTools;
	}
	@Override
	public void accessDashboard(){
		System.out.println("Accessing admin dashboard: "+siteAnalytics+"userman:"+userManagementTools);
	}
}
public class E_LearningSystem {

	public static void main(String[] args) {
		User std=new Student("poojitha","pooji@gmail.com","officer","maths,science","A");
		std.accessDashboard();
		std.login();
		std.logOut();
		std.updateProfile();
		System.out.println("-------------------------------------------");
		User std1=new Instructor("pooji","puji@gmail.com","techer","Maths",2);
		std1.accessDashboard();
		std1.login();
		std1.logOut();
		std1.updateProfile();
		System.out.println("======================================");
		User std2=new Admin("pooji","pooji@gmail.com","maths","10000","placement");
		std2.accessDashboard();
		std2.login();
		std2.logOut();
		std2.updateProfile();
		

	}

}
