package com.redington.java.array;

import java.util.Scanner;

public class PrimeRangeArray {
	
	int [] primenumber = new int[5];
	//int [] numbers = new int[5];
	int startnum , endnum , count=0;
	
	public void getValues()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting value :");
		startnum= scan.nextInt();
		System.out.println("Enter end value :");
		endnum= scan.nextInt();
		
//		for(int i=startnum ; i<endnum; i++)
//		{
//			System.out.println("Enter the numbers :");
//			primenumber[i]= scan.nextInt();
//		}
		 System.out.println("=====================");
		    System.out.println("The prime numbers");
	}
	
	public void findPrimeNumbers()
	{
		for(int k=startnum ; k<endnum ; k++)
		{
			int check=0;
		    for(int j=2; j<k;j++)
		      {
		    	if(k % j ==0)
		    	{
		    		check=1;
		    		break;
		    		
		    	}
		      }
		   
		    	 if(check==0)
		    	{
		    		count++;
		    		primenumber[count]=1;
		    		System.out.println(k);	
		    	}
		}System.out.println(primenumber[count]);	
	}
				
	

}
