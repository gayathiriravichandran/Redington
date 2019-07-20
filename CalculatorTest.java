package com.redington.java.practice;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.getInput();
      
		boolean b = true;
		while (b)
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Divide");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			
			
			
			if(choice ==1)
			{
				c.addition();
			}
			else if (choice == 2)
			{
				c.subtraction();
			}
			else if (choice == 3)
			{
				c.multiplication();
			}
			else if (choice == 4)
			{
				c.divide();
			}
			else{
				System.out.println("Wrong choice");
			}
			System.out.println("Do you want to continue(Y/N)");
			char cho = scan.next().charAt(0);
	
			if (cho=='N' )
			{
				
				b= false;
				
			}
		}
	}

}
