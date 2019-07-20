package gayu;

 class Bank1 {
	
	
		Bank1 (int a)
		{
			System.out.println("A");
		}
	}
	class Paytm extends Bank1
	{
		Paytm()
		{
			super(5);
			System.out.println("B");
		}
	}
	
	public class Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paytm p = new Paytm();
          
	}

}
