package com.evergent.corejava.exceptionhandling;

public class Exception19_Multi_Catch {
	String name="null";
	int k =0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("end");
		}
		catch(NullPointerException | ArithmeticException e) {
			System.out.println("I can handle:"+e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception19_Multi_Catch ed19=new Exception19_Multi_Catch();
		ed19.myData();

	}

}
