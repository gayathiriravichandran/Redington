package com.redington.java.practice;

import java.util.Scanner;

public class Multiplication {
	int num ;
	
	void printMultiplication()
	{
		//int n=5 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		num= scan.nextInt();
	}
	void findMultiplication()
	{
		
		for(int i=100; i>=1 ;i--)
		{
			//System.out.println(i*n);
			
		
		System.out.println(+i+"*"+num+"="+(i*num));
		}
	}
}
