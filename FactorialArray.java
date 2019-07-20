package gayu;

import java.util.Scanner;

public class FactorialArray {
	int [] num = new int[5];
	int [] numbers= new int[5];
	Scanner scan = new Scanner (System.in);
	
	public void getInput()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter the number :");
			numbers[i]=scan.nextInt();
		}
	}
	public void findFactorial()
	{
		
		for(int i =0 ; i<=4; i++)
		{
			int fact =1;
			for(int j=1; j<=numbers[i]; j++)
			{
			fact=fact*j;
			num[i]= fact;
		}System.out.println("Factorial of"  + fact);
		System.out.println(num[i]);
	}
	
	

	}
	public static void main (String[]args){
		FactorialArray f1 = new FactorialArray();
		f1.getInput();
		f1.findFactorial();
	}
}
