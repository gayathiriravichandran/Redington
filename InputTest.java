package com.redington.java.practice;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
	Input a1 =new Input();
	
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the name:");
	String name1= scan.nextLine();
	System.out.println("enter the another name:");
	String name2 = scan.nextLine();
	String result = a1.getInput(name1,name2);
	System.out.println( result);

	}

}
