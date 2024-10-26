package com.abstractFactory;

public class FactoryMain {

	

	public static void main(String[] args) {
		
		Mobile android = MobileFactory.getMobile("android");
		System.out.println(android);
		
		Mobile apple = MobileFactory.getMobile("apple");
		System.out.println(apple);
	}
}
