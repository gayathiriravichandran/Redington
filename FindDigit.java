package com.redington.java.practice;

import java.util.Scanner;

public class FindDigit {
	
	int n;
	
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = scan.nextInt();
	}
	void findDigit()
	{
		if(n>=0 && n<=9)
		{
			System.out.println( + n +  "1 digit number");
		}
		else if(n>=10 && n<=99)
		{
			System.out.println( + n +  " 2 digit number");
		}
		else if(n>=100)
		{
            System.out.println(+n+ " 3 digit number");
		}
	}

}
