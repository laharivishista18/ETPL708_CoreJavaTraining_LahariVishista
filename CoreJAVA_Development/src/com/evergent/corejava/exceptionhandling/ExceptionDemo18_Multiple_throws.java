package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo18_Multiple_throws {
	String name="null";
	int k=0;
	public void myData()throws NullPointerException,ArithmeticException{
		System.out.println("one");
		System.out.println(name.length());
		int d=10/k;
		System.out.println(d);
		System.out.println("end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionDemo18_Multiple_throws ed18=new ExceptionDemo18_Multiple_throws();
			ed18.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle"+e);
		}
	}

}
