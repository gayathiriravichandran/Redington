package com.redington.java.oops;

class A{
	int a= 5;
	
	void display()
	{
		System.out.println(a);
	}
}
class B extends A{
	int b=7;
	void print()
	{
		System.out.println(b);
	}
}
public class SingleInheritance {
	public static void main (String[]args){
		B b1 = new B();
		b1.display();
		b1.print();
		
	}

}
