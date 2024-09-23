package com.evergent.corejava.Collections.Stack;

import java.util.Stack;
public class Stack_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack=new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		

	}

}
