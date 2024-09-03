package com.evergent.corejava.statickeyword;

public class StaticDemo4 {
	static String cname="India";
	static String name="Lahari";
	static public void myData() {//static method
		System.out.println("MyData:Static method");
	}
	public void myshow() {//non static method
		myData();
		System.out.println("myshow non static method"+cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo4.cname);
		System.out.println(cname);
		myData();
		StaticDemo4  s4=new StaticDemo4();
		s4.myshow();
	}
}
