package com.redington.java.practice;

import java.util.Scanner;

public class SquareCube {
	int number;
	int square;
	int cube;
	
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number:");
		number= scan.nextInt();
		
		
	}
    void findSquareCube()
    {
    	square= number*number;
    	cube=number*number*number; 
    }
    void display()
    {
    	System.out.println("Square of the given number is:"+ square);
    	System.out.println("Cube of the given number is:"+ cube);

    }
}
