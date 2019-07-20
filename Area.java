package com.redington.java.practice;

import java.util.Scanner;

public class Area {
	int length;
	int breath;
	int result;
	
	void AreaOfTriangle(){
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the length:");
		length= scan.nextInt();
		System.out.println("enter the breath:");
		breath= scan.nextInt();
		result=2*length*breath;
		System.out.println("Area of triangle is:"+ result);
		
		
	}
	

}
