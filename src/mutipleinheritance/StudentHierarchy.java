package mutipleinheritance;


class Student{
	String name;
	String stdId;
	public Student(String name, String stdId) {
		super();
		this.name = name;
		this.stdId = stdId;
	}
	public void displayStudentInfo() {
		System.out.println("student name:"+name);
		System.out.println("student id:"+stdId);
	}
}
class  Undergraduate extends Student{
	String major;

	public Undergraduate(String name, String stdId, String major) {
		super(name, stdId);
		this.major = major;
	}
	public void displayUndergraduateInfo() {
		  System.out.println("student name:"+name);
		  System.out.println("student id:"+stdId);
		  System.out.println("major:"+major);
		    	
    }
}
class Graduate extends Student{
	String thesisTopic;
	public Graduate(String name, String stdId,String thesisTopic) {
		super(name, stdId);
		this.thesisTopic=thesisTopic;	
	}
	public void displayGraduateInfo() {
		 System.out.println("student name:"+name);
		 System.out.println("student id:"+stdId);
		 System.out.println("topic:"+thesisTopic);
	}
	
}
class  PhDStudent extends Student{
	String researchArea;

	public PhDStudent(String name, String stdId, String researchArea) {
		super(name, stdId);
		this.researchArea = researchArea;
	}
	public void displayPhDStudentInfo() {
		 System.out.println("student name:"+name);
		 System.out.println("student id:"+stdId);
		 System.out.println("researchArea:"+researchArea);
		
	}
}
public class StudentHierarchy {

	public static void main(String[] args) {
		Student std1 = new Undergraduate("Alice", "U12345", "Computer Science"); 
		Undergraduate undergraduate=(Undergraduate)std1;
		undergraduate.displayUndergraduateInfo();
		System.out.println("========================");
		Student std2= new Graduate("Bob", "G67890", "Machine Learning"); 
		Graduate graduate=(Graduate)std2;
		graduate.displayGraduateInfo();
		System.out.println("=======================");
		Student std3 = new PhDStudent("Charlie", "P11223", "Artificial Intelligence"); 
		PhDStudent student=(PhDStudent)std3;
		student.displayPhDStudentInfo();

	}

}
