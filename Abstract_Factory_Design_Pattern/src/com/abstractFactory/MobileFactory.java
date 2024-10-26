package com.abstractFactory;

public class MobileFactory{

	public static Mobile getMobile(String str) {
		return MobileAbstractFactory.getMobile(str);
	}

}
