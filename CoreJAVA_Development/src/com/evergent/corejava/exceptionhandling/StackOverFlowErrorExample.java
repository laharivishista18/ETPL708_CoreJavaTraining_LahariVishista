package com.evergent.corejava.exceptionhandling;

public class StackOverFlowErrorExample {
	public static void main(String args[]) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverFlowError caught:"+ e.getMessage());
		}
	}
	public static void recursiveMethod() {
		recursiveMethod();
	}

}
