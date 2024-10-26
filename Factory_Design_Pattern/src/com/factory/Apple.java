package com.factory;

public class Apple implements Mobile{

	@Override
	public String getMobile(String str) {
		return "this is apple mobile";
	}

	@Override
	public String toString() {
		return "Apple []";
	}

}
