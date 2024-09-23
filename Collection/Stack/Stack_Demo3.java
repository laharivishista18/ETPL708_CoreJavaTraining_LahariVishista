package com.evergent.corejava.Collections.Stack;

import java.util.Stack;
public class Stack_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack=new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack.search("White"));
		System.out.println(mystack.search("Red"));
		System.out.println(mystack);

	}

}
