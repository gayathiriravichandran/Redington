package siva.array;

import java.util.Scanner;

public class ReverseArray {
	int i=0;
	
	int[] rev = new int[5];
	int [] num = new int[5];
	Scanner scan = new Scanner(System.in);
	
	public void getInput()
	{
		System.out.println("enter the number :");
		num[i]= scan.nextInt();
	if(num[i]<5)
	{
		
		i++;
		getInput();
	}
		
	}
	public void reverse()
	{
	 if	(num[i]>0)
	 {
		 rev[i]=num[i]% 10;
		 
		 num[i]= num[i]/10;
		 i++;
		 System.out.println(+rev[i]);
		 reverse();
		 
	 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ReverseArray ra = new ReverseArray();
       ra.getInput();
       ra.reverse();
	}

}
