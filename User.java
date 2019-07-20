package com.redington.java.practice;

import java.util.Scanner;

public class User {
	float productprice;
	float discountrate;
	float discountamount;
	float salesprice;
	
	void findDiscountAmount()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the productprice:" );
		productprice= scan.nextFloat();
		
		System.out.println("enter the discountrate :" );
		discountrate= scan.nextFloat();
		discountamount= productprice*discountrate;
		System.out.println("The discountAmount is :" + discountamount);
	}
	void findsalesprice(){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the productprice :" );
		productprice= scan.nextFloat();
		
		System.out.println("enter the discountamount :" );
		discountamount= scan.nextFloat();
		
		salesprice= productprice-discountamount;
		System.out.println("The salesprice is:"+ salesprice);
		
	}

}
