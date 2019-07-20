package com.redington.java.practice;

import java.util.Scanner;

public class PrimeNumber {
	
	int n;
	
	public void getInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter a number :");
		n = scan.nextInt();
	}
	
	public void PrimeNumberorNot()
	{
		
		int check = 0;
		for( int i=2 ; i<n ; i++)
		{
			if (n % i == 0)
			{
				check = 1;
				//System.out.println("n is :" +n+ " i is :" +i);
				break;
			}
		}
		if (check ==0)
		{
			System.out.println(+n+ " is Prime Number");
		}
		else 
		{
			System.out.println(+n+ " is not a Prime Number");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNumber n1 = new PrimeNumber();
		n1.getInput();
		n1.PrimeNumberorNot();

	}

}
