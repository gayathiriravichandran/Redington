package com.redington.java.string;

import java.util.Scanner;

public class Green {
	
	Scanner scan = new Scanner(System.in);
	
	public void findWord()
	{
		String s = new String();
		System.out.println("Enter a sentence ");
		s = scan.nextLine();
		System.out.println(s.contains(" green"));
	}

  public static void main(String[] args)
  {
	  Green g = new Green();
	  g.findWord();
  }
}
