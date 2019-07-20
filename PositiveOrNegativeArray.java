package gayu;

import java.util.Scanner;

public class PositiveOrNegativeArray {

	int [] num = new int[5];
	Scanner scan = new Scanner(System.in);
	
	void getInput()
	{
		for(int i=0; i<=4; i++)
		{
			System.out.println("Enter the number :");
			num[i]= scan.nextInt();
		}
	}
	void find()
	{
		for(int i=0; i<=4; i++)
		{
			if(num[i]>=0){
				System.out.println("The number" + num[i] +"is positive number");
		}else{
			System.out.println("The number" + num[i] +"is negative number");
		}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 PositiveOrNegativeArray a1 = new PositiveOrNegativeArray();
 a1.getInput();
 a1.find();
	}

}
