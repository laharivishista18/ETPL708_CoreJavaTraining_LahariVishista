package com.evergent.corejava.Interfaces;

public class BookImpl implements Book {
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
		BookImpl book1=new BookImpl();
		book1.bookAuthor();
		book1.bookTitle();
		book1.bookPrice();
		book1.show();

	}

}
