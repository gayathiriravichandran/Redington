package com.redington.java.array;

import java.util.Scanner;

public class BasicArrays {
int i;
	int [] marks = new int[10];
	
	public void getInput()
	{
		Scanner scan = new Scanner(System.in);
		for ( i=0 ; i<10 ; i++)
		{
		marks[i]=scan.nextInt();
		
		}
		
		
		System.out.println(marks[i]);	
	}
			
}
