package gayu;



 class A1 {
	int i = 10;
	}

	class B{
		
		void display(A1 a)
		{
			System.out.println(a.i);
		}
	}
		
	public class A{	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			B b = new B();
			b.display(new A1());
			

		}



}
