package com.redington.java.oops;


	abstract class Abs
	{
	
	int m()
	{
	 return 1;	
	}
	abstract int n();
	}
	
	class ChildAbs extends Abs
	{
		int n()
		{
			return 2;
		}
	}
	public class Abstraction {
	public static void main(String[] args) {
		ChildAbs obj = new ChildAbs();
		obj.m();
		obj.n();
		

	}

}
