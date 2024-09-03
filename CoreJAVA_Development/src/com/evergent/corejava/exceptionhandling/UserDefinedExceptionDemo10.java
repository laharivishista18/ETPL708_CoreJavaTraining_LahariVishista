package com.evergent.corejava.exceptionhandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
	
}
public class UserDefinedExceptionDemo10 {//Method throws the custom Checked Exception
	public static void checkAge(int age)throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("age must be 18 or older");
		}
		else {
			System.out.println("Access granted-you are old enough");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(16);
		}
		catch(InvalidAgeException e) {
			System.out.println("Caught the exception:"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("pgm continues after handling exception:");

	}

}
