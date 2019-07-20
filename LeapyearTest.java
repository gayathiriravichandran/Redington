package com.redington.java.practice;

import java.util.Scanner;

public class LeapyearTest {

	public static void main(String[] args) {
		
		Leapyear a1= new Leapyear();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year :");
		int n = scan.nextInt();
		String result = a1.findLeapyear(n);
		System.out.println("The given year is" + result);
		

	}

}
