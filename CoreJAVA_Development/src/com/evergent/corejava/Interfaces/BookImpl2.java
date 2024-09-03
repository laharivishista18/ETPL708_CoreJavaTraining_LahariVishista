package com.evergent.corejava.Interfaces;
//We can't create object to interface but we can create reference to Interface

public class BookImpl2 implements Book {
	public void bookTitle() {
		System.out.println("Core JAVA");
	}
	public void bookAuthor() {
		System.out.println("Oracle Crop:"+cname);
	}
	public void bookPrice() {
		System.out.println("Rs 500");
	}
	public void show() {
		System.out.println("Local methods of BookIMPL");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cannot instantiate the type Book
		//Book b2=new Book();
		Book b2=new BookImpl2();
		b2.bookAuthor();
		b2.bookTitle();
		b2.bookPrice();
		//b2.show();//will get an error as it is in local class

	}

}
