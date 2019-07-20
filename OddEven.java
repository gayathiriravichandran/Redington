package com.redington.java.practice;

import java.util.Scanner;

public class OddEven {
	int number1;
	int number2;
	
	void getInput()
	{
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		number1= scan.nextInt();
		
		System.out.println("Enter the another number:");
		number2= scan.nextInt();
	}
	
	void findOddEvenNumber()
	{
		int remainder = number1%2;
		if(remainder==0)
			System.out.println(+number1+" :is even");
		else
			System.out.println(+number2+" :is odd" );
			
		
			
			
		
			
		

	}

}
