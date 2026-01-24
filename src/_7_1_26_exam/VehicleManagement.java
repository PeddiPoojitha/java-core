package _7_1_26_exam;

import java.util.Scanner;

class Vehicle{
	private String ownerName;
	private String VehicleNumber;
	private String VehicleType;
	public Vehicle(String ownerName, String vehicleNumber, String vehicleType) {
		super();
		this.ownerName = ownerName;
		VehicleNumber = vehicleNumber;
		VehicleType = vehicleType;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getVehicleNumber() {
		return VehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		VehicleNumber = vehicleNumber;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public void Profile() {
		System.out.println("enter the owner name:"+ownerName);
		 System.out.println("enter the vechilenumber:"+VehicleNumber);
		 System.out.println("enter the vechiletype:"+VehicleType);
		
	}
	
}
class ServiceVehicle extends Vehicle{
	private String ServiceCenterName;
	private String ServiceCategory;
	public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType, String serviceCenterName,
			String serviceCategory) {
		super(ownerName, vehicleNumber, vehicleType);
		ServiceCenterName = serviceCenterName;
		ServiceCategory = serviceCategory;
	}
	public String getServiceCenterName() {
		return ServiceCenterName;
	}
	public void setServiceCenterName(String serviceCenterName) {
		ServiceCenterName = serviceCenterName;
	}
	public String getServiceCategory() {
		return ServiceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		ServiceCategory = serviceCategory;
	}
	public void ServiceCategory(String newcategory) {
		 if(newcategory==null || newcategory.equals("")) {
			 System.out.println("you enter invalid deatils");	 
		 }
		 else {
			 ServiceCategory=newcategory;
			 System.out.println("service category is update details");
		 }	 
	 }
	 public void ServiceCenterName(String center) {
		 if(center==null || center.equals("")) {
			 System.out.println("you enter invalid details");
		 }
		 else {
			 ServiceCenterName=center;
			 System.out.println("center name is update details");
		 } 
	 }
	 public void ProfileDetails() {
		 System.out.println("profileDetails");
		 Profile();
		 System.out.println("service center name: "+ServiceCenterName);
		 System.out.println("service category:"+ServiceCategory);
		 
	 }
	
	
}
public class VehicleManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ownername");
		String ownername=sc.nextLine();
		System.out.println("enter the vechilenumber:");
		String vechilenumber=sc.nextLine();
		System.out.println("enter the vechiletype:");
		String vechiletype=sc.nextLine();
		System.out.println("enter the servicecentername:");
		String servicecentername=sc.nextLine();
		System.out.println("enter the servicecategory:");
		String servicecategory=sc.nextLine();
		ServiceVehicle sv=new ServiceVehicle(ownername,vechilenumber,vechiletype,servicecentername,servicecategory);
		boolean status=true;
		while(status) {
			System.out.println("1.enter the updateservicecategory");
			System.out.println("2.enter the UpdateServiceCenterName");
			System.out.println("3.enter the ViewVehicleProfileDetails");
			System.out.println("4.enter the Exit the program");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("updateservicecategory");
				String car=sc.nextLine();
				sv.ServiceCategory(car);
				break;
			
			case 2: 
				System.out.println("UpdateServiceCenterName");
				String name=sc.nextLine();
				sv.ServiceCenterName(name);
				break;
			case 3:
				sv.ProfileDetails();
				break;
			case 4:
				System.out.println("Thank you!");
				status=false;
				break;
			default:
				System.out.println("invalid choice");			
			}
		}
		sc.close();	
	}

}
