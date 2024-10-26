package com.abstractFactory;

public class MobileAbstractFactory {

	
	public static Mobile getMobile(String str)
	{
		if(str=="android")
		{
			return new Android();
		}else if(str=="apple")
		{
			return new Apple();
		}
		return null;
	}
}
