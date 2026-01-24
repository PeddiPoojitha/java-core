package com.bank.customers;

public class CustomerAccount {
	private int customerId;
	private String customerName;
	private String Email;
	private String PhoneNumber;
	private String Address;
	private String accountType;
	private long balance;
	private boolean kycStatus;
	//empty
	public CustomerAccount() {
		this.kycStatus=false;
		System.out.println("Customer Profile Initialized — Status: Pending KYC");
		
	}
	//Minimal profile 
	public CustomerAccount(String customerName,String PhoneNumber ) {
		this();
		this.customerName=customerName;
		this.PhoneNumber=PhoneNumber;
	}
	//Basic account 
	public CustomerAccount(String customerName,String PhoneNumber,String accountType) {
		this();
		this.customerName=customerName;
		this.PhoneNumber=PhoneNumber;
		this.accountType=accountType;	
	}
	//Full profile 
	public CustomerAccount(int customerId, String customerName, String email, String phoneNumber, String address,
			String accountType, long balance, boolean kycStatus) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		Email = email;
		PhoneNumber = phoneNumber;
		Address = address;
		this.accountType = accountType;
		this.balance = balance;
		this.kycStatus = kycStatus;
	}
	public void setcustomerName(String name) {
		if(!name.isBlank()) {
			this.customerName=name;
		}
	}
	public void setEmail(String email) {
		if(email.contains("@")) {
			this.Email=email;
		}
	}
	public void setPhoneNumber(String phone) {
		if(phone.length() == 10 && phone.matches("\\d+")) {
			this.PhoneNumber=phone;	
		}	
	}
	public void setaccountType(String type) {
		
		if(type.equals("SAVING")||type.equals("CURRENT")||type.equals("SALARY")||type.equals("PREMIUM")) {
			this.accountType=type;
		}	
	}
	public void setbalance(long balance) {
		if(balance>0) {
			this.balance=balance;
		}	
	}
	public void Deposite(double amount) {
		if(amount>0) {
			this.balance+=amount;
			System.out.println("deposite successfully");
			System.out.println("Amount Deposited: " + amount);
		}	
	}
	public void Withdraw(double amount) {
		if(amount>0) {
			this.balance-=amount;
			System.out.println("withdraw successfully");
			System.out.println("Amount withdraw: " + amount);
			System.out.println("Remaining Balance Available: " + this.balance);
		}
	}
	public void kycStatus(String doc) {
		if(!doc.isBlank()) {
			this.kycStatus=true;
			System.out.println("KYC Verified using: " + doc);
		}
	}
	public void getMaskedPhone(String number) {
		this.PhoneNumber=number;
		System.out.println("*******");
	}
	public void viewAccountSummary() {
		//System.out.println("Customer id:"+customerId);
		System.out.println("Customer name:"+customerName);
	    //System.out.println("email:"+Email);
		System.out.println("phone number:"+PhoneNumber);
		//System.out.println("address:"+Address);
		System.out.println("account type:"+accountType);
	//	System.out.println("balance:"+balance);
		System.out.println("kycstatus:"+kycStatus);
		
	}
	
	
}
