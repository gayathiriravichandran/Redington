package com.redington.java.array;

import java.util.Scanner;

public class PerfectNumbers {

	int [] numbers = new int[5];
	int [] sum = new int[5];
	
	public void getValues()
	{
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<5 ; i++)
		{
			System.out.println("Enter the numbers :");
			numbers[i]=scan.nextInt();
		}
	}
	
	public void findPerfect()
	{
		for(int i=0; i<5 ; i++)
		{
			for(int j=1 ; j<numbers[i]; j++)
			{
				if(numbers[i] % j==0)
				{
					sum[i]=sum[i]+j;
				}
			}//System.out.println(+sum[i]);
		}
	}
	public void display()
	{
		for(int i=0 ; i<5 ;i++)
		{
			if(numbers[i]==sum[i])
			{
				System.out.println(+numbers[i]+  "is a perfect number");
				
			}else
			{
				System.out.println(+numbers[i]+  "is not a perfect number");
			}
		}
	}
	
}
