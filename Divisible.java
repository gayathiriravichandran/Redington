package com.redington.java.practice;

import java.util.Scanner;

public class Divisible {
	
	int n;
	void getInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.print ("Enter the number:");
		n = scan.nextInt();
	}
	void divisible()
	{
		if((n%5==0)&&(n%11==0))
		{
			System.out.println("The given number " +n+  " is divisible by 5 & 11");
		}
		else {
			
	    System.out.println("The given number " +n+  " is not divisible by 5 & 11");
			
		}
	}

}
