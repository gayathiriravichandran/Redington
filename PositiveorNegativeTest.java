package com.redington.java.practice;

import java.util.Scanner;

public class PositiveorNegativeTest {

	public static void main(String[] args) {
		PositiveorNegative a1= new PositiveorNegative();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = scan.nextInt();
		String result = a1.findPositiveorNegative(num);
		System.out.println("The given number is" + result);
		

	}

}
