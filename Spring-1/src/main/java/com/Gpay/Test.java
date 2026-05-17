package com.Gpay;

public class Test {
	
	
	
	public static void main(String[] args) {
	
		
		PaymentService service=new PaymentService();
		
		service.upi=new UPIPayment();
		service.credit=new CreditCardPayment();
		
		service.pay(1000, "CREDIT");
		
	}
		

}
