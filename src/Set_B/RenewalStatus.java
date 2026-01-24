package Set_B;
import java.util.Scanner;

class SubscriptionPlan{
	private String SubscriberName;
	private String PlanType;
	private double PlanCost;
	private double PaidAmount;
	private String SubscriptionStatus;
	public SubscriptionPlan(String subscriberName, String planType, double planCost, double paidAmount,
			String subscriptionStatus) {
		SubscriberName = subscriberName;
		PlanType = planType;
		PlanCost = planCost;
		PaidAmount = paidAmount;
		SubscriptionStatus = subscriptionStatus;
		System.out.println("confirming the creation of the subscription");
	}
	public void UpdatePaidAmount(double amount){
		if(amount>0 && amount<= PlanCost) {
			this.PaidAmount+=amount;
			System.out.println("payment updated");
		}
		else {
			System.out.println("invalid payment");
		}
	
	}
	public void SubscriptionStatus(String status) {
		this.SubscriptionStatus=status;
		System.out.println("SubscriptionStatus updated");
	}
	public void DisplayStatus() {
		System.out.println("SubscriberName"+SubscriberName);
		System.out.println("PlanType"+PlanType);
		System.out.println("PlanCost"+PlanCost);
		System.out.println("PaidAmount"+PaidAmount);
		System.out.println("SubscriptionStatus"+SubscriptionStatus);
	}
}
public class RenewalStatus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the SubscriberName:");
		String name=sc.nextLine();
		System.out.println("enter the plantype:");
		String plantype=sc.nextLine();
		System.out.println("enter the plancost:");
		double cost=sc.nextDouble();
		System.out.println("enter the paidamount:");
		double amount=sc.nextDouble();
		sc.nextLine();
		System.out.println("enter the SubscriptionStatus:");
		String status=sc.nextLine();
		SubscriptionPlan sp=new SubscriptionPlan(name,plantype,cost,amount,status);
		boolean st=true;
		while(st) {
			System.out.println("---menu-----");
			System.out.println("1.Update Paid Amount");
			System.out.println("2.Change Subscription Status");
			System.out.println("3.View Subscription Summary");
			System.out.println("4.Exit");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("enter the payment amount");
				double Amount=sc.nextDouble();
				sp.UpdatePaidAmount(Amount);
				break;
			case 2:
				System.out.println("enter the new status(active/inactive/experied:)");
				String Status=sc.nextLine();
				sc.nextLine();
				sp.SubscriptionStatus(Status);
				
				break;
			case 3:
				sp.DisplayStatus();
				break;
			case 4:
				System.out.println("thank you!");
				st=false;
				break;
			default:
					System.out.println("invalid choice");
			}
			
		}
		sc.close();
		

	}

}
