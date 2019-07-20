package com.redington.java.practice;

import java.util.Scanner;

public class SumofDigit {
	
	int no;
	int sum=0;int a =0;
	 void getInput()
	 {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number :");
		 no = scan.nextInt();
	 }
    void sumofDigits()
    {
    	while(no>0)
    	{
    		int rem = no%10 ;
    		//System.out.println(rem);
    		no = no/10;
    		//System.out.println(no);
    		sum = sum + rem;
    		
    		
    	}
    	System.out.println("Sum of digits : " + sum);
    	 while (sum>0)
    	 {
    		 int a = sum%10 ;
    		 
    	 }
    }
    
    public static void main (String [] args)
    {
    	SumofDigit sd = new SumofDigit();
    	sd.getInput();
    	sd.sumofDigits();
    	
    }
}
