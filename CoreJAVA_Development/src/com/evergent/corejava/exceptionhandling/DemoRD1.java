package com.evergent.corejava.exceptionhandling;

public class DemoRD1 {
	int k=0;
	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+e);
		}
	
		try {
			
			int t=10/k;
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle:"+e);
		}
	}
		public static void main(String[] args) {
			DemoRD1 r=new DemoRD1();
			r.myData();
			
		}
		

	}


