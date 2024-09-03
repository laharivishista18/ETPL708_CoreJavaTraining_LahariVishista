package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Auto data types objects
		int a=10;//Primitive data type
		Integer i1=new Integer(a);//Wrapper class
		System.out.println(i1);
		//Object data convert into data types
		int a1=i1.intValue();
		System.out.println(a1);

	}
}
