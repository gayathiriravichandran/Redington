package siva.array;

public class LengthArray {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6};
		int b[]=new int [a.length];
		b=a;
		a[0]=20;
		System.out.println(b[0]);
	}

}
