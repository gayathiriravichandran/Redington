package com.redington.java.oops;

class X{
	int a= 5;
	
	void display()
	{
		System.out.println(a);
	}
}
class Y extends X{
	int b=7;
	void print()
	{
		System.out.println(b);
	}
}
class Z extends Y{
	int c=48;
	void show()
	{
		System.out.println(c);
	}
}



public class Inheritance {
	public static void main (String[]args){
		Y b1 = new Y();
		b1.display();
		b1.print();
		Z c1= new Z();
		c1.display();
		c1.print();
		c1.show();
		
		
	}



}
