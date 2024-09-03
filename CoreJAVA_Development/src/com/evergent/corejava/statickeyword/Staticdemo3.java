package com.evergent.corejava.statickeyword;

public class Staticdemo3 {
	static String cname="India";
	static String name="Lahari";
	static public void myData() {
		System.out.println("MyData");
	}
	public void show() {
		System.out.println("myshow non static method");
	}
	//Cannot make a static reference to the non-static method show() from the type Staticdemo3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		//Cannot make a static reference to the non-static field name
		System.out.println(name);
		myData();
		//show();
		

	}

}
