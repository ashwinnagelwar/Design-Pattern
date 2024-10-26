package com.abstractFactory;

public class Android implements Mobile{

	@Override
	public Mobile getMobile() {
		// TODO Auto-generated method stub
		return new Android();
	}

	@Override
	public String toString() {
		return "Android []";
	}

	

}
