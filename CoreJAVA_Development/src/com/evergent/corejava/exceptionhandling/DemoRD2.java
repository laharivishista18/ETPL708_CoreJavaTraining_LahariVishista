package com.evergent.corejava.exceptionhandling;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


public class DemoRD2 {
	//public class MathOperations {

	    // Method to calculate the square root of a number, throws NegativeNumberException if the number is negative
	    public static double squarert(double number) throws NegativeNumberException {
	        if (number < 0) {
	            throw new NegativeNumberException("Cannot calculate the square root of a negative number: " + number);
	        }
	        else
	        	
	        return Math.sqrt(number);
	    }

	    public static void main(String[] args) {
	        try {
	            System.out.println("Square root of 25: " + squarert(25));
	            System.out.println("Square root of -5: " + squarert(-5)); // This will trigger NegativeNumberException
	        } catch (NegativeNumberException e) {
	            System.out.println("Caught the exception: " + e.getMessage());
	        }
	    }
	}


	
