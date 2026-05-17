package com.Gpay;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		
		PaymentService service=new PaymentService();
		
		service.setPayment(new UPIPayment(), new CreditCardPayment());
		
		
//		PaymentService service=new PaymentService(new UPIPayment(), new CreditCardPayment());
		
//		service.upi=new UPIPayment();
//		service.credit=new CreditCardPayment();

		service.pay(1000, "CREDIT");
		service.pay(2000, "UPI");
		
		
		
		
		
	}
		

}
