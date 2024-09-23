package com.evergent.corejava.Collections.Stack;

import java.util.Stack;

public class Stack_Demo5_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a Stack
		Stack<String> stack=new Stack<>();
		//Pushing elements onto a Stack
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		stack.push("Date");
		//Displaying the stack
		System.out.println("Stack:"+stack);
		//Peeking at the top element
		String topElement=stack.peek();
		System.out.println("Top element:"+topElement);
		//Popping an element from stack
		String removedElement=stack.pop();
		System.out.println("Stack after pop:"+stack);
		//Checking if the Stack is Empty
		boolean isEmpty=stack.isEmpty();
		System.out.println("Is the Stack Empty?"+isEmpty);
		//Searching for an element
		int position=stack.search("Banana");
		System.out.println("Position of Banana from top:"+position);
		//Clearing the stack
		stack.clear();
		System.out.println("stack after clearing");
	}
}
