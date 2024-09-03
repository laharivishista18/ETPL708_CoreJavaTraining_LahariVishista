package com.evergent.corejava.statickeyword;

public class StaticDemo5 {
	static {
		System.out.println("StaticBlock:open db/network connections");
	}
	static String cname="India";
	static public void myData() {
		System.out.println("MyData");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();
	}

}
