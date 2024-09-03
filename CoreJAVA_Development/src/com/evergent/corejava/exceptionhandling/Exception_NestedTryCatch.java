package com.evergent.corejava.exceptionhandling;

public class Exception_NestedTryCatch {
	String name=null;
	int k=0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			try {
				int t=10/k;
			}
				catch(ArithmeticException e) {
					System.out.println("Nested try:"+e);
				}
			finally {
				System.out.println("Finally block:Inner try");
			}
			System.out.println("end");
		}
		catch(NullPointerException | ArithmeticException e) {
			System.out.println("I can handle:"+e);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_NestedTryCatch n=new Exception_NestedTryCatch();
		n.myData();
		

	}

}
