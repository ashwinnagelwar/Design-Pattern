package com.builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile.MobileBuilder()
				.setCameraSize("55px")
				.setName("Oppo")
				.setPrice("230000")
				.build();
		
		System.out.println(mobile);
		
		//In builder design pattern, we implement a class such as we do not required to initialize it all parameters
		//we can achievw this optional initailization by creating a class within same class and defining all setters method 
		//for its parameteters, and then only required parametres we can used to create parant class object as above
		

	}
}
