package com.redington.java.practice;

import java.util.Scanner;

public class Calculator {
	int number1;
	int number2;
	int add;
	int sub;
	int div;
	int mul;
	
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		number1 = scan.nextInt();
		
		System.out.println("Enter the another number :");
		number2 = scan.nextInt();
	}
	
    void addition()
    {
    	 add = number1 +number2;
    	 System.out.println("The addition of number is:"+ add);
    	 
    }
    void subtraction()
    {
    	 sub = number1 - number2;
    	 System.out.println("The subtraction of number is:"+ sub);
    }
    void multiplication()
    {
    	 mul = number1 * number2;
    	 System.out.println("The multiplication of number is:"+ mul);
    }
    void divide()
    {
    	 div = number1 / number2;
    	 System.out.println("The division of number is:"+ div);
    }
   
	 
}
