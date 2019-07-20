package com.redington.java.practice;

public class Leapyear {
	String findLeapyear(int n)
	{
		String val;
		if(n/4 ==0)
		{
			val="leapyear";
		}
		else
		{
			val="not leapyear";
		}
		return val;
	}

}
