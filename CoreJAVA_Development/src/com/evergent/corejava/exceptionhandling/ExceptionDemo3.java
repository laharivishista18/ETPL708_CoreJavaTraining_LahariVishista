package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo3 {
	int k=0;
	String name="null";
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+e);
		}
		catch(ArithmeticException e){
			System.out.println("I can handle:"+e);
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo3 ed3=new ExceptionDemo3();
		ed3.myData();

	}

}
