package siva.array;

import java.util.Scanner;

public class SortCharArray {
	
	
	char [] name = new char[5];
	char [] asc =  new char[5];
	
	
	public void getInput()
	{
		Scanner scan = new Scanner (System.in);
		for(int i=0; i<5 ; i++)
		{
			System.out.println("Enter the character :");
			name[i]= scan.next().charAt(0);
			asc[i]=name[i];
		}
		
	}
	public void sortCharacter()
	{
		for(int i=0;i<5;i++)
		{
		  for(int j=i+1; j<5;j++)
		  {
			  if(asc[i]>asc[j])
			  {
				  char temp=asc[i];
				  asc[i]=asc[j];
				  asc[j]=temp;  
			  }
		  }System.out.println(asc[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortCharArray sc = new SortCharArray();
		sc.getInput();
		sc.sortCharacter();

	}

}
