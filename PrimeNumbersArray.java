package com.redington.java.array;

import java.util.Scanner;

public class PrimeNumbersArray {
	int [] primenumber = new int[5];
	int [] numbers = new int[5];
	int n;
	
	public void getValues()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value :");
		n= scan.nextInt();
		
		for(int i=0 ; i<n; i++)
		{
			System.out.println("Enter the numbers :");
			numbers[i]= scan.nextInt();
		}
		 System.out.println("=====================");
		    System.out.println("The prime numbers");
	}
	
	public void findPrimeNumbers()
	{
		for(int k=0 ; k<n ; k++)
		{
			int check=0;
		    for(int j=2; j<numbers[k];j++)
		      {
		    	if(numbers[k] % j ==0)
		    	{
		    		check=1;
		    		break;
		    		
		    	}
		      }
		   
		    	 if(check==0)
		    	{
		    		 
		    		System.out.println(numbers[k]);	
		    	}primenumber[k]=numbers[k];
		}
	}
				
		 public void printArray()
		 {
			 for(int i =0 ; i<n ; i++)
			 {
				 System.out.println(numbers[i]+ " " +primenumber[i]); 
			 }
		 }
		    
		
	

}
