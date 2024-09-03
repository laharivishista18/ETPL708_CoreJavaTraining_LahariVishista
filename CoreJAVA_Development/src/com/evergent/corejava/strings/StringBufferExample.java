package com.evergent.corejava.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello ");
		System.out.println("Initial String:"+sb);
		//Append a String
		sb.append(" World!");
		System.out.println("After append:"+sb);
		//Insert at a specific position
		sb.insert(6, "Beautiful");
		System.out.println("After insert:"+sb);
		sb.replace(0,5,"Hi");
		System.out.println("After replace:"+sb);
		//Delete a substring
		sb.delete(0, 3);
		System.out.println("After delete:"+sb);
		//Reverse the string
		sb.reverse();
		System.out.println("After reverse:"+sb);
		//Capacity and length
		System.out.println("Capacity:"+sb.capacity());
		System.out.println("Length:"+sb.length());		

	}

}
