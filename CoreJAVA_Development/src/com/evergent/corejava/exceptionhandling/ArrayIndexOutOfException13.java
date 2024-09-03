package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutOfException13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbs= {1,2,3,4,5};
		try {
			System.out.println("Accessing element:"+numbs[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught"+e);
		}

	}

}
