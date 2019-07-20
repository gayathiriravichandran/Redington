package com.redington.java.practice;

import java.util.Scanner;

public class IncomeTaxCalculator {
int taxableincome;
double taxpayable;

void getInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the taxableincome :");
	taxableincome=scan.nextInt();
}
void tax()
 {
	if((taxableincome<20000)&&(taxableincome<40000))
	{
	  taxpayable=(taxableincome - 20000)*0.1;	
	}
	else if((taxableincome>40000)&&(taxableincome<60000))
	{
		taxpayable=((taxableincome - 40000)*0.2)+(20000*0.1);	
	}
	else if(taxableincome>60000)
	{
		taxpayable=((taxableincome - 60000)*0.3)+(20000*0.1)+(20000*0.2);	
	}
	
	System.out.println(taxpayable);
  }

}
