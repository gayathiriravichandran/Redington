package com.redington.java.array;

import java.util.Scanner;

public class ArrayElement {
	int [] numbers= new int[5];
	Scanner scan = new Scanner(System.in);
	public void getValues()
	{
		for(int i=0;i<=4;i++){
			System.out.println("Enter a number for the position :" +i);
			numbers[i]= scan.nextInt();
		}
	}
	
	public void findElement()
	{
		System.out.println("Enter a number to find :" );
		int num = scan.nextInt();
		int check =0;
		int count=0;
		for(int i=0;i<=4;i++)
		{
			if(numbers[i]==num)
			{
				check=1;
				//System.out.println("found the number");
				count = count+1;
				System.out.println(num+"found in the"+i+"position");
             }
			
			
	}
		System.out.println(count);
		/*if(check==1)
		{
			System.out.println("Found the number");
		}else{
			System.out.println("Not found the number");
		}*/

}
	void findMax()
	{
		int max=0;
		for(int i =0; i<=4; i++)
		{
			if(numbers[i]> max)
			{
				max= numbers[i];
				
						
			}
		}System.out.println("maximum number is:" + max);
		
	}
	void findMin()
	{
		int min=numbers[0];
		for(int i =0; i<=4; i++)
		{
			if(numbers[i]< min)
			{
				min= numbers[i];
				
						
			}
		}System.out.println("minimum number is:" + min);
		
	}
}
