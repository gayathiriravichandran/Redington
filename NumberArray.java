package com.redington.java.array;

import java.util.Scanner;

public class NumberArray {
	int sum=0;
	
	int [] numbers = new int[5];
	
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<=4;i++)
		{
			System.out.println("Enter the number: ");
			numbers[i]= scan.nextInt();
		}
		
		for(int j=0;j<=4;j++){
			System.out.println(numbers[j]);
		}
		for(int k=0; k<=4;k++){
			sum=sum+numbers[k];
			
		}
		
		System.out.println("sum is :" +sum);
	}

}
