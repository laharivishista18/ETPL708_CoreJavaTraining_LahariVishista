package com.evergent.corejava.statickeyword;

public class StaticDemo2 {
	static String cname="India";
	static public void MyData() {
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo2.MyData();
		System.out.println(cname);
		MyData();
		

	}

}
