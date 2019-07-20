package com.redington.java.array;

import java.util.Scanner;

public class SumOfDigits {
	int [] rev = new int[5];
	int [] number = new int[5];
 	int [] num = new int[5];
	int [] sum = new int[5];
	public void getValues()
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=4; i++)
		{
			System.out.println("Enter the number :");
			num[i]=scan.nextInt();
			number[i]= num[i];
		}
	}
	
	public void sumOfDigits()
	{
		for(int i=0;i<=4; i++)
		{

			
			while(num[i]>0)
			{
				 rev[i] = num[i]%10;
				//System.out.println(n);
				sum[i] = sum[i]+rev[i];
				 num[i]=num[i]/10;
			}
			
			System.out.println(sum[i]);
			
		}
		}
public void divisible()
	{
		for(int i=0 ; i<=4 ; i++)
		{
			if (number[i]%sum[i] ==0)
			{
			  System.out.println(number[i] + "Divisible by " +sum[i]);	
			}else
			{
				System.out.println(number[i] + "not Divisible by " +sum[i]);
			}
			
		}
	}
		
		

		
	}



