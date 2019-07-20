package com.redington.java.practice;

import java.util.Scanner;

public class OddNumber {
	
	int i;
	int num;
	
		void printOddNumber()
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		num= scan.nextInt();
		
	}
	void findOddNumber()
	
	{
		for( i = 1; i<=10;i++)
		{
			if(i%2 !=0)
			System.out.println(i);
			
		}
	}

}
