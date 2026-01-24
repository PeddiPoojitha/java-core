package Set_B;

import java.util.Scanner;

class Staff {
	private String StaffName;
	private int StaffId;
	private String BaseShift;
	public Staff(String staffName, int staffId, String baseShift) {
		super();
		StaffName = staffName;
		StaffId = staffId;
		BaseShift = baseShift;
	}
	public void staffProfile() {
		System.out.println("StaffName:"+StaffName);
		System.out.println("StaffId:"+StaffId);
		System.out.println("BaseShift:"+BaseShift);
	}
}
class DepartmentStaff extends Staff{
	private String DepartmentName;
	private String ResponsibilityLevel;
	public DepartmentStaff(String staffName, int staffId, String baseShift, String departmentName,
			String responsibilityLevel) {
		super(staffName, staffId, baseShift);
		DepartmentName = departmentName;
		ResponsibilityLevel = responsibilityLevel;
	}
	public void UpdateResponsibility(String ResponsibilityLevel) {
		if(ResponsibilityLevel==null||ResponsibilityLevel.equals("")) {
			System.out.println("invalid details");	
		}
		else {
			this.ResponsibilityLevel=ResponsibilityLevel;
			System.out.println("Responsibility Level are updated");	
		}	
	}
	public void UpdateDepartmentName(String DepartmentName) {
		if(DepartmentName==null||DepartmentName.equals("")) {
			System.out.println("invalid Departmennt name");
		}
		else {
			this.DepartmentName=DepartmentName;
		}
	}
	public void StaffProfile() {
		System.out.println("DepartmentName:"+DepartmentName);
		System.out.println("ResponsibilityLevel:"+ResponsibilityLevel);
		staffProfile();	
	}
}
public class HotelManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the staff name");
		String name=sc.nextLine();
		System.out.println("enter the staff id");
		int id=sc.nextInt();
		System.out.println("enter the base shift");
		String shift=sc.nextLine();
		sc.nextLine();
		System.out.println("enter department name");
		String Deptname=sc.nextLine();
		sc.nextLine();
		System.out.println("enter the responsibility level");
		String reslevel=sc.nextLine();
		DepartmentStaff staff=new DepartmentStaff(name,id,shift,Deptname,reslevel);
		boolean status=true;
		while(true){
			System.out.println("1.Update Responsibility");
			System.out.println("2.Update Department");
			System.out.println("3.View Profile");
			System.out.println("4.exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the responsibility level:");
				staff.UpdateResponsibility(sc.nextLine());
				break;
			case 2:
				System.out.println("enter the department name:");
				staff.UpdateDepartmentName(sc.nextLine());
				break;
			case 3:
				staff.StaffProfile() ;
				break;
			case 4:
				System.out.println("thank you!");
				status=false;
				break;
			default:
				System.out.println("invalid choice");
				
			}
			sc.close();
			
		}
		
		
		
	}

}
