package com.redington.java.practice;

import java.util.Scanner;

public class GrossSalary {
	
	double basic_salary;
	double gross_salary;
	
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the salary :");
		basic_salary =scan.nextDouble();
		
	}
	void grossSalary()
	{
		if(basic_salary <=10000)
		{
			double HRA = basic_salary*0.2;
			double DA = basic_salary*0.8;
			gross_salary = basic_salary + HRA + DA;
			System.out.println(gross_salary);
		}
		else if(basic_salary <=20000)
		{
			double HRA = basic_salary*0.25;
			double DA = basic_salary*0.9;
			gross_salary = basic_salary + HRA + DA;
			System.out.println(gross_salary);
		}
		else if(basic_salary >20000)
		{
			double HRA = basic_salary*0.3;
			double DA = basic_salary*0.95;
			gross_salary = basic_salary + HRA + DA;
			System.out.println(gross_salary);
		}
	}

}
