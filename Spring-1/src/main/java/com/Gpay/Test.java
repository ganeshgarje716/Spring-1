package com.Gpay;

public class Test {
	
	
	
	public static void main(String[] args) {
	
		
		UPIPayment upi=new UPIPayment();
		CreditCardPayment credit=new CreditCardPayment();
		
		PaymentService service=new PaymentService(upi, credit);
		
//		service.upi=new UPIPayment();
//		service.credit=new CreditCardPayment();
//		?
		service.pay(1000, "CREDIT");
		service.pay(2000, "UPI");
		
		
		
		
		
	}
		

}
