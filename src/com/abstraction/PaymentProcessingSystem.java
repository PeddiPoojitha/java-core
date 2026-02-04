package com.abstraction;

abstract class Payment{
	abstract void processPayment();
	abstract void validateTransaction();
	
	public void generateTransactionId(){
		System.out.println("Transaction id:"+ getTransactionId());
	}
	protected abstract String getTransactionId();

}
class creditCardPayment extends Payment{
	 String cardNumber;
	 String expiryDate;
	 String cvv;
	 public creditCardPayment(String cardNumber, String expiryDate, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	 }
	 @Override
	 void processPayment() {
		 System.out.println("Processing credit card payment.");
		 
	 }
	 @Override
	 void validateTransaction() {
		 System.out.println("Validating card number, expiry, and CVV.");
	 }
	 protected String getTransactionId() {
		 return "123456789";
		 
	 } 
}
class UPIPayment extends Payment{
	String upiId;
    String phoneNumber;
	public UPIPayment(String upiId, String phoneNumber) {
		super();
		this.upiId = upiId;
		this.phoneNumber = phoneNumber;
	}
	 @Override
	 void processPayment() {
		 System.out.println("Processing UPI payment.");
		 
	 }
	 @Override
	 void validateTransaction() {
		 System.out.println("Validating UPI ID and phone number.");
	 }
	 protected String getTransactionId() {
		 return "987654321";
		 
	 } 
    
}
class PayPalPayment extends Payment{
	String email;
    String authToken;
	public PayPalPayment(String email, String authToken) {
		super();
		this.email = email;
		this.authToken = authToken;
	}
	@Override
	 void processPayment() {
		 System.out.println("Processing PayPal payment.");
		 
	 }
	 @Override
	 void validateTransaction() {
		 System.out.println("Validating email and authentication token.");
	 }
	 protected String getTransactionId() {
		 return "543216789";
		 
	 } 
    
}
public class PaymentProcessingSystem{
	public static void main(String[] args) {
		Payment pay=new creditCardPayment("1234567890123456", "12/25", "123");
		pay.processPayment();
		pay.validateTransaction();
		pay.generateTransactionId();
		System.out.println("______________________________");
		Payment pay1=new UPIPayment("user@upi", "1234567890"); 
		pay1.processPayment();
		pay1.validateTransaction();
		pay1.generateTransactionId();
		System.out.println("++++++++++++++++++++++++++++");
		Payment pay2=new PayPalPayment("user@example.com", "abc123");
		pay2.processPayment();
		pay2.validateTransaction();
		pay2.generateTransactionId();
		
		
	}
	
}