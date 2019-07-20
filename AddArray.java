package com.redington.java.array;

import java.util.Scanner;

public class AddArray {
int [] number = new int[10];
int sum;
int i;	
	public int getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		for ( i=0 ; i<10 ; i++)
		{
		number[i]=scan.nextInt();
		 sum = sum+number[i];
		}
		//for ( i=0 ; i<10 ; i++)
		//{
		//	 sum = sum+number[i];
		
		
		//}
		System.out.println(sum);
		return sum;
		
	}

}
