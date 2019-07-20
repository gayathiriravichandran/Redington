package com.redington.java.practice;

import java.util.Scanner;

public class EBbill {
	
	int unit;
	float bill;
	 void getInput()
	 {
		 Scanner scan = new Scanner(System.in);
			System.out.print ("Enter the unit :");
			unit =scan.nextInt();
	 }
	 void ebBill()
	 {
		 if(unit<=100)
		 {
			 bill = unit*5;
		 }
		 else if(unit>100 && unit<=200)
		 {
			 bill = ((unit-100)*7)+(100*5);
		 }
		 else if (unit>200 && unit<=300)
		 {
			 bill = ((unit-200)*10)+(100*5)+(100*7);
		 }
		 else if(unit>300)
		 {
			 bill = ((unit-300)*15)+(100*5)+(100*7)+(100*10); 
		 }
		 System.out.println(bill);
	 }
	 

}
