package com.evergent.corejava.Collections.Stack;

import java.util.Stack;

public class Stack_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack=new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		mystack.clear();
		boolean b=mystack.isEmpty();
		System.out.println(b);
		System.out.println(mystack);
	}
}
