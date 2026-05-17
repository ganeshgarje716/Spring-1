package com.Gpay;

public class PaymentService {
	
	
	UPIPayment upi;
	
	CreditCardPayment credit;
	
	
	public void setPayment(UPIPayment upi, CreditCardPayment credit) {
		
		this.upi=upi;
    	this.credit=credit;
	}
	
//	public PaymentService(UPIPayment upi, CreditCardPayment credit) {
//		
//		this.upi=upi;
//		this.credit=credit;
//	}
	
	
	public void pay(double amount, String type) {
		
		if (type.equals("UPI")) {
			
			upi.processPayment(amount);
		}
		if (type.equals("CREDIT")) {
			
			credit.processPayment(amount);
		}
		
		
		System.out.println("Payment Success ... RS = "+amount);
		
	}

}
