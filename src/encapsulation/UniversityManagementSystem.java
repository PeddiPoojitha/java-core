package encapsulation;
class Employee{
	private String employeeId;
	private String name;
	public Employee(String employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printBasicInfo() {
		System.out.println("emp id:"+employeeId);
		System.out.println("name:"+name);
		
	}
	
}


public class UniversityManagementSystem {

	public static void main(String[] args) {
		

	}

}
