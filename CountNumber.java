package com.redington.java.array;

import java.util.Scanner;

public class CountNumber {
	
	int [] num = new int[20];
	Scanner scan = new Scanner(System.in);
	
	public void getValues()
	{
		for(int i=0;i<=19; i++)
		{
			System.out.println("Enter the number :");
			num[i]=scan.nextInt();
		}
	}
	
	public void countPositiveNumber()
	{
		int count=0 ,count1=0, count2=0;
		for(int i =0; i<=19 ; i++)
		{
			
		if(num[i]>0)
				{
					count=count+1;
					
				}else if(num[i]<0)
				{
					count1 = count1+1 ;
				}
		else 
				{
					 count2= count2+1;
					
				}
				
				}System.out.println("Positive number" +  count );
				System.out.println("Negative number"  +  count1);
				System.out.println("number of Zeros " + count2);
			}
	
	public void countOddorEvenNumber()
	{
		int count3=0 , count4=0;
		for(int i =0; i<=19 ; i++)
		{
			
		if(num[i]%2==0)
				{
					count3=count3+1;
					
				}else 
				{
					 count4= count4+1;
					
				}
				
				}System.out.println("Even number" + count3 );
				System.out.println("Odd number" + count4);
			}

	
	
	
	public static void main(String []args){
		CountNumber c1 = new CountNumber();
		c1.getValues();
		c1.countPositiveNumber();
		c1.countOddorEvenNumber();
	}
		
	}


