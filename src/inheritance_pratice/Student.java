package inheritance_pratice;

public class Student extends Person {
	public int rollno;
	public void displayStudent() {
		System.out.println("rollno:"+rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.name="pooji";
		s.age=32;
		s.rollno=6;
		s.displyPerson();
		s.displayStudent();

	}

}
