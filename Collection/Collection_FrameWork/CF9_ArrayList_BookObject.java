package com.evergent.corejava.Collections;

import java.util.ArrayList;

class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
public class CF9_ArrayList_BookObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("CoreJava");
		Book b2=new Book("Let us C");
		Book b3=new Book("Programming Index JAVA");
		ArrayList mylist=new ArrayList();
		mylist.add(b1);
		mylist.add(b2);
		mylist.add(b3);
		System.out.println(mylist);
	}

}
