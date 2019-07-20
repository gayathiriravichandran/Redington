package com.redington.java.practice;

import java.util.Scanner;

public class PrimeNumberRange {
	
int n;
int start;
int end;
	
	public void getInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter start number :");
		start  = scan.nextInt();
		System.out.println(" Enter end number :");
		end  = scan.nextInt();
	}
	
	public void PrimeNumberorNot()
	{
		for(n = start ; n<end ; n++)
		{
		
		int check = 0;
		for( int i=2 ; i<n ; i++)
		{
			if (n % i == 0)
			{
				check = 1;
				System.out.println("n is :" +n+ " i is :" +i);
				//break;
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
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNumberRange n1 = new PrimeNumberRange();
		n1.getInput();
		n1.PrimeNumberorNot();

	}

}
