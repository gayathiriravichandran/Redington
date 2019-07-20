package com.redington.java.testpractice;

import java.util.Scanner;

public class Factor {
	int n;
	int i;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		n= scan.nextInt();
	}
  void findFactor()
  {
	  
	  for( i= 1; i<=n; i++)
	  {
		  if(n%i == 0)
		  {
			  System.out.println(n+ "number is divisible by " +i);
		  }
	  }
	 
  }
}
