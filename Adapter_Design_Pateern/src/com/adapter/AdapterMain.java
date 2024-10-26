package com.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		
		ThirdPartyPayment thirdPartyPayment=new ThirdPartyPayment();
		PaymentAdapter paymentAdapter=new PaymentAdapter(thirdPartyPayment);
		paymentAdapter.pay(34);
	}
}
