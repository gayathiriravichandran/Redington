package com.redington.java.oops;

public class Overloading {
int add(int a, int b)
{
	int c= a+b;
	System.out.println("Sum of 2 variables:"+ c);
	return c;
	
}
int add(int a, int b, int c)
{
	int d= a+b+c;
	System.out.println("Sum of 3 variables:"+ d);
	return d;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
		obj.add(4, 6);
		obj.add(2,8,3);
		

	}

}
