package com.redington.java.testpractice;

import java.util.Scanner;

public class SumOfDigits {
	
	int n ; 
	
	int sum = 0 ;
	 
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = scan.nextInt();
	}
	void findSumofDigits()
	{
		int a= n;
		while(n>0)
		{
			int rev = n%10;
			//System.out.println(n);
			sum = sum+rev;
			 n=n/10;
		}
		
		System.out.println("sum is :" +sum);
		
		
		if (a%sum ==0)
		{
			System.out.println("YES");
		}else
		{
			System.out.println("NO");
		}
	}

}
