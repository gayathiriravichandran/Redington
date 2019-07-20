package com.redington.java.testpractice;

import java.util.Scanner;

public class Average {
	
	int n;
	int sum;
	int average;
	 void getInput()
	 {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the value :");
		 n = scan.nextInt();
	 }
	 void sumAverage()
	 {
		 sum = sum +n;
		 System.out.println("sum is :" +sum);
		 average = sum /n;
	 }

}
