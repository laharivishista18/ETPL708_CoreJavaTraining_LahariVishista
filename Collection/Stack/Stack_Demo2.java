package com.evergent.corejava.Collections.Stack;

import java.util.Stack;

public class Stack_Demo2 {
	public static void main(String args[]) {
	Stack mystack=new Stack();
	mystack.push("Red");
	mystack.push("Black");
	mystack.push("White");
	System.out.println(mystack);
	System.out.println(mystack.peek());
	System.out.println(mystack);
	}
}
