package gayu;

import java.util.Scanner;

public class GivenCharacter {
	
	char value ;
	
	
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character :");
		value = scan.next().charAt(0);
	}
	
	void findCharacter()
	{
	if (value>='A'&& value<='Z')	
	{
		System.out.println("upper case");
	}else if(value>='a' && value<='z')
	{
		System.out.println("Lower case");
	}else if (value>='0'&& value<='9')
	{
		System.out.println("Number");
	}
	else
	{
		System.out.println("Special character");
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GivenCharacter c1 = new GivenCharacter();
		c1.getInput();
		c1.findCharacter();

	}

}
