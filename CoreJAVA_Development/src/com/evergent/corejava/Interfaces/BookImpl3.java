package com.evergent.corejava.Interfaces;
public class BookImpl3 implements Book,NewBook {
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
	public void myNewBook() {
		System.out.println("MyNewBook");
	}
	public void dataInfo() {
		System.out.println("MyNewDataInfo");
	}
	public static void main(String[] args) {
		BookImpl3 b3=new BookImpl3();
		b3.bookAuthor();
		b3.bookTitle();
		b3.bookPrice();
		b3.myNewBook();
		b3.dataInfo();


}
}