package com.redington.java.array;

import java.util.Scanner;

public class ReplaceElement {
	int num;
	int [] number =new int[5];
	Scanner scan =new Scanner(System.in);
	
public void getInput()
{
	for(int i=0 ; i<=4; i++)
	{
		System.out.println("Enter the number");
		number[i]=scan.nextInt();
	}
}
public void findNumber()
{
	
	
		System.out.println("Enter a number to find :" );
		 num = scan.nextInt();
		int check =0;
		int count=0;
		for(int i=0;i<=4;i++)
		{
			if(number[i]==num)
			{
				check=1;
				//System.out.println("found the number");
				count = count+1;
				System.out.println(num+"found in the"+i+"position");
             }
		
	}
}

public void findReplace()
{
	int a= num ;
	System.out.println("Enter the number to replace :");
	int replace = scan.nextInt();
	for(int i=0; i<=4;i++)
	{
		num=replace;
		
	}System.out.println(+a +"is replaced by " + replace);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceElement e1 = new ReplaceElement();
		e1.getInput();
		e1.findNumber();
		e1.findReplace();

	}

}
