package com.evergent.corejava.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("JAVA");
		String str2=new String("JAVA");
		if(str1==str2) {
			System.out.println("true");
		}
		else
			System.out.println("false");
		if(str1.equals(str2)) {
			System.out.println("True");
		}
		else
			System.out.println("False");

	}

}
