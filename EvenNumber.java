package com.redington.java.practice;
import java.util.Scanner;

public class EvenNumber {

    int i;
	int num;
	
		void printEvenNumber()
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		num= scan.nextInt();
		
	}
	void findEvenNumber()
	
	{
		for( i = 1; i<=10;i++)
		{
			if(i%2 ==0)
			System.out.println(i);
			
		}
	}




}
