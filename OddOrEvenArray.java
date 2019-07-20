package com.redington.java.array;

import java.util.Scanner;

public class OddOrEvenArray {
	
	int [] elements = new int[5];
	int[] oddnumber = new int[5];
	int[] Evennumber = new int[5];
	int n;
	
	public void getValues()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value :");
		n= scan.nextInt();
		
		for(int i=0 ; i<n; i++)
		{
			System.out.println("Enter the numbers :");
			elements[i]= scan.nextInt();
		}
	}
	
	public void findEven()
	{ 
		int a=0;
		for(int i=0 ; i<n ; i++)
		{
			
			//for(int k=0 ; k<=elements[i]; k++)
			//{
				if(elements[i] % 2 ==0)
				{
					Evennumber[a]=elements[i];
					a++;
				}
		}
	}
		public void oddNumber()
		{
			
		
				int e=0;
				for(int i=0 ; i<n ; i++)
				{
					if(elements[i] % 2 !=0)
				{
					oddnumber[e]=elements[i];
					e++;
				}
			}
		}
		//}
	
	public void display()
	{
		for(int i=0 ; i<n ; i++)
		{
			System.out.println(Evennumber[i]+ "  "+ oddnumber[i]);
		}
	}
	
	

}
