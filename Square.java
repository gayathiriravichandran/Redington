package redington.day2.practice;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		for(int j= 1 ; j<=25 ; j++)
		{
			int n =j*j ;
			System.out.println(n);
	}
		
		for(int no=1 ; no<=10; no=no+2)
		{
			System.out.println(no);
			if(no==9)
			no=0;
				
			}
		
		int no1 =17;
		int i=2; boolean ifentry = false;
		//while(i<no1)
			while(i<Math.sqrt(no1))
		{
			if(no1 % i ==0)
			{
			System.out.println("not a prime");
			ifentry = true;
			break;
			
		}
			i++;
		}
		if (ifentry == false){
			System.out.println("prime number");
		}
		
		int a=100 , b=200 ,c=300;
				 a=a+b+c;
				 b=a-b-c;
				 c=a-b-c;
				 a=a-b-c;
				 System.out.println(+a+" "+b+" "+c);*/
				 
				 
				 
				/* int f=0 , s=1;
				 System.out.println(f);
				 System.out.println(s);
				 int times=3;
				 while(times>0)
				 {
					 int t= f+s;
					 System.out.println(t);
					 f=s;
					 s=t;
					 times--;
					 
				 }*/
int f=0, s=1;
System.out.println(f);
System.out.println(s);
int times=10;
while(times>0)
{
	s=f+s;
	f=s-f;
	times--;
	System.out.print(s+" ");
}
}
}
