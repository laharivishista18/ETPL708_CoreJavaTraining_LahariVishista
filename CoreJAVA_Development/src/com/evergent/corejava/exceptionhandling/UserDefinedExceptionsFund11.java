package com.evergent.corejava.exceptionhandling;
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}

public class UserDefinedExceptionsFund11 {//Mention that throws a custom checked exception
	public static void withdraw(double amount)throws InsufficientFundsException{
		double balance=500.00;
		if(amount>balance) {
			throw new InsufficientFundsException("Insufficient funds for withdrawal");
		}
		else {
			System.out.println("withdrawal successful");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			withdraw(600.00);
		}
		catch(InsufficientFundsException e) {
			System.out.println("Caught InsufficientFundsException"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Pgm continues after handling");

	}

}
