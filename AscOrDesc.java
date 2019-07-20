package com.redington.java.array;

import java.util.Scanner;

public class AscOrDesc {
	
	int [] numbers = new int[5];
	int [] asc = new int[5];
	int[] desc = new int[5];
	
	public void getValues()
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println("Enter the numbers :");
			numbers[i]= scan.nextInt();
			asc[i]=numbers[i];
			desc[i]=numbers[i];
		}
		
	}
	public void findAsc()
	{
		for(int i=0 ; i<5 ; i++)
		{
			for(int j=i+1 ; j<5 ; j++)
			{
				if(asc[i]>asc[j])
				{
					int temp = asc[i];
					asc[i]=asc[j];
					asc[j]=temp;
				}
			}
			
			
		}
	}
	
	public void findDesc()
	{
		for(int i=0 ; i<5 ; i++)
		{
			for(int j=i+1 ; j<5 ; j++)
			{
				if(desc[i]<desc[j])
				{
					int temp = desc[i];
					desc[i]=desc[j];
					desc[j]=temp;
				}
			}
			
			}
	}
	public void display()
	{
		System.out.println("Ascending"+"    "+ " Descending");
		for(int i=0 ; i<5 ; i++)
		{
				System.out.println(+asc[i]  +  "        " +desc[i]);
		}
	}
}
