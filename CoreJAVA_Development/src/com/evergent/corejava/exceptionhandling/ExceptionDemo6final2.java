package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo6final2 {
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
	finally {
		System.out.println("Finally block close connections");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo6final2 ed6=new ExceptionDemo6final2();
		ed6.myData();


	}

}
