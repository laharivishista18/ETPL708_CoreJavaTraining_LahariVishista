package com.evergent.corejava.abstract1;

public class ProductImpl1 extends Product {
	public void newProduct() {
		System.out.println("My new Product");
	}
	public void show() {
		System.out.println("Local methods of Product Impl class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl1 p1=new ProductImpl1();
		p1.show();
		p1.newProduct();
		p1.allProducts();

	}

}
