package com.adapter;

public class PaymentAdapter implements PaymentProcessor{

	private ThirdPartyPayment thirdPartyPayment;
	
	
	
	public PaymentAdapter(ThirdPartyPayment thirdPartyPayment) {
		
		this.thirdPartyPayment = thirdPartyPayment;
	}



	@Override
	public void pay(int price) {
		thirdPartyPayment.makePayment(price);
	}

}
