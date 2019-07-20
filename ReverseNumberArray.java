package com.redington.java.array;

import java.util.Scanner;

public class ReverseNumberArray {
	int [] num = new int[10];
	int [] reverse = new int[10];
	int [] element = new int[10];
	Scanner scan = new Scanner(System.in);
	
	public void getValues()
	{
		for(int i=0 ; i<=9 ; i++)
		{
			System.out.println("Enter the value : ");
			element[i]= scan.nextInt();
			//num[i]=element[i];
		}
		}
	
	public void findReverse()
	{
		
		for(int i=9 ; i>=0 ; i--)
		{
			num[i]=element[i];
			reverse[i]=element[i];
			//System.out.println(element[i]);
			System.out.println("The given " + num[i]+ "stored in" +reverse[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumberArray a1 = new ReverseNumberArray();
		a1.getValues();
		a1.findReverse();

	}

}
