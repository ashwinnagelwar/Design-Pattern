package com.abstractFactory;

public class Apple implements Mobile{

	@Override
	public Mobile getMobile() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public String toString() {
		return "Apple []";
	}

	

}
