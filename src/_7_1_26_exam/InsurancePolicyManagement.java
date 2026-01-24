package _7_1_26_exam;

import java.util.Scanner;

class InsurancePolicy{
	private String CustomerName;
	private String PolicyType;
	private double PolicyAmount;
	private double ApprovedAmount;
	private String PolicyStatus;
	public InsurancePolicy(String customerName, String policyType, double policyAmount, double approvedAmount,
			String policyStatus) {
		super();
		CustomerName = customerName;
		PolicyType = policyType;
		PolicyAmount = policyAmount;
		ApprovedAmount =ApprovedAmount;
		PolicyStatus = PolicyStatus;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public String getPolicyType() {
		return PolicyType;
	}
	public double getPolicyAmount() {
		return PolicyAmount;
	}
	public double getApprovedAmount() {
		return ApprovedAmount;
	}
	
	public String getPolicyStatus() {
		return PolicyStatus;
	}
	public void ApprovedAmount(double amount) {
		if(amount>0 && amount<=PolicyAmount) {
			this.ApprovedAmount=amount;
			System.out.println("approved amount");
		}
		else {
			System.out.println("invalid approved amount");
		}
	}
	public void PolicyStatus(String status) {
		this.PolicyStatus=status;
		System.out.println("policy status upated");
	}
	public void DisplaySummary() {
		System.out.println("Policy Summary");
        System.out.println("Customer:"+CustomerName);
        System.out.println("Policy Type:"+PolicyType);
        System.out.println("Policy Amount:"+ PolicyAmount);
        System.out.println("Approved Amount:"+ApprovedAmount);
        System.out.println("Policy Status: "+PolicyStatus);
    }
	
}
public class InsurancePolicyManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customername");
		String name=sc.nextLine();
		System.out.println("enter policy type");
		String type=sc.nextLine();
		System.out.println("enter policy amount");
		double amount=sc.nextDouble();
		System.out.println("Approved amount");
		double approvedamt=sc.nextDouble();
		System.out.println("enter policy status");
		String status=sc.nextLine();
		InsurancePolicy policy=new InsurancePolicy(name,type,amount,approvedamt,status);
		boolean staus=true;
		while(true) {
			System.out.println("--------menu-----------");
			System.out.println("1.Update Approved Amount");
			System.out.println("2.Change Policy Status");
			System.out.println("3.View Policy Summary");
			System.out.println("4.Exit the program");
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:{
				System.out.println("enter approved amount");
				double ApprovedAmount=sc.nextDouble(); 
				policy.ApprovedAmount(amount);
				break;
			}
			case 2:{
				System.out.println("enter polict status");
				String PolicyStatus = sc.nextLine();
                policy.PolicyStatus(status);
                break;
				
			}
			case 3:{
                policy.DisplaySummary();
                break;

			}
			case 4:{
				System.out.println("Exiting...");
				staus=false;
			}
			default:{
				System.out.println("Invalid Choice");
			}
			}
			sc.close();
		}	

	}

}
