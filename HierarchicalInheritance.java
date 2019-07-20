package com.redington.java.oops;


class RBI
{
	double debit (double balance, double amount)
	
	{
	balance = balance-amount;
	return balance;
	}
	double credit (double balance, double amount)
	{
		balance = balance+amount;
		return balance;
	}
	double rateOfInterest (double balance)
	{
		balance = (balance*7.5)/100;
		return balance;
	}
}
	class IOB extends RBI
	{
		double rateOfInterest (double balance)
		{
			balance = (balance*7.1)/100;
			return balance;
		}
		
		
	}
	class KVB extends IOB
	{
		double rateOfInterest (double balance)
		{
			balance = (balance*9.1)/100;
			return balance;
		}
		boolean checkMinimumBalance(double balance){
			if(balance>=500){
			return true;
			}
			else{
				return false;
			
			}
		}
	}
	
	
	public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KVB kvb = new KVB();
		double balance = 5000;
		System.out.println(kvb.checkMinimumBalance (501));
		System.out.println(kvb.checkMinimumBalance (300));
		System.out.println(kvb.credit (1000,50));
		System.out.println(kvb.debit (2000,200));
		kvb.rateOfInterest(balance);
	
		
	}

}
