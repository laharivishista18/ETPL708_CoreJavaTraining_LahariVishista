package com.evergent.corejava.abstract1;

public class ProductImpl3 extends Product3 {
	public ProductImpl3() {
		System.out.println("ProductImpl subclass Constructor");
	}
	public void newProduct() {
		System.out.println("My new Product");
	}
	public void show() {
		System.out.println("Local methods of ProductImpl class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product3 p2=new ProductImpl3();
		p2.newProduct();
		//p2.show();
		 

	}

}
