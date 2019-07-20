package redington.day2.practice;

public class Calculator2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator2 calc = new Calculator2();
		 int result=calc.add();
		 System.out.println("Total value in main method is" + result);
		 calc.calculatepercentage(result);
		
    }
	private void calculatepercentage( int r) {
		// TODO Auto-generated method stub
		int percentage = r/2;
		System.out.println("percentage is" + percentage);
		
		
	}
	private int add() {
		int tamil=80, english=90, total;
		 total =tamil+english;
		System.out.println("Total is"+ total);
		return total;
	}

}
