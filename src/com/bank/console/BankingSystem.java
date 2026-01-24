package com.bank.console;
import com.bank.customers.CustomerAccount;
import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.nextLine();
		System.out.println("enter phone:");
		String phone=sc.nextLine();
		System.out.print("Enter Account Type: ");
		sc.nextLine();
		String accountType=sc.nextLine();
		CustomerAccount account=new CustomerAccount(name,phone,accountType);
		boolean status=true;
		while(status){
			System.out.println("\n1.Update Address\n2.Update Phone\n3.Activate KYC\n4.Deposit\n5.Withdraw\n6.ViewSummary\n7.Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("new address");
				break;
			case 2:
				System.out.println("new phone");
				account.setPhoneNumber(phone);
				break;
			case 3:
				System.out.println("activate kyc");
				account.kycStatus(accountType);
				break;
			case 4:
				//System.out.println("account.Deposite(sc.nextDouble())");
				account.Deposite(sc.nextDouble());
				break;
			case 5:
				//System.out.println("withdraw");
				account.Withdraw(sc.nextDouble());
				break;
			case 6:
				account.viewAccountSummary();
				break;
			default:
				System.out.println("exit");	
			}
		}
		sc.close();
	}

}
