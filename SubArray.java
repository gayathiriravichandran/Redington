package com.redington.java.array;

import java.util.Scanner;

public class SubArray {
	
	int [] num = new int[10];
	Scanner scan = new Scanner(System.in);
	
	public void getValues()
	{
		for(int i=0;i<=9; i++)
		{
			System.out.println("Enter the number :");
			num[i]=scan.nextInt();
		}
	}
	public void print()
	{
		for(int i=3; i<=8 ;i++)
		{
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArray s1 = new SubArray();
		s1.getValues();
		s1.print();

	}

}
