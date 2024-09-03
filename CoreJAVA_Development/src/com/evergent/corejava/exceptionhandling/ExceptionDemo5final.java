package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo5final {
	String name="null";
	int k=0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+e);
		}
		catch(ArithmeticException e){
			System.out.println("I can handle:"+e);
			System.out.println();
		}
		finally {
			System.out.println("Finally block close connections");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo5final ed5=new ExceptionDemo5final();
		ed5.myData();

	}
}
