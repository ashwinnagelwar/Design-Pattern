package com.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		Mobile mobile = MobileFactory.getMobile("android");
		System.out.println(mobile);
		
		Mobile apple = MobileFactory.getMobile("apple");
		System.out.println(apple);
	}
}
