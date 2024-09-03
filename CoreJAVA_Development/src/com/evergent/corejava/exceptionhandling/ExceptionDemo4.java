package com.evergent.corejava.exceptionhandling;
//Exception handling should follow hierarchical 
public class ExceptionDemo4 {
	String name=null;
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
			System.out.println(e);
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo4 ed4=new ExceptionDemo4();
		ed4.myData();
	}

}
