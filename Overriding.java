package com.redington.java.oops;


	class Cpp
	{
		void m()
		{
			System.out.println(" I am learning c++");
		}
	}
	class Java extends Cpp
	{
		void m()
		{
			System.out.println(" I am learning Java");
		}
	}

	public class Overriding {
	public static void main(String[] args) {
		
		Cpp cpp = new Cpp();
		cpp.m();
		Java java = new Java();
		java.m();

	}

}
