package com.evergent.corejava.abstract1;


public class ProductImpl2 extends Product {
	public void newProduct() {
		System.out.println("My new Product");
	}
	public void show() {
		System.out.println("Local methods of Product IMpl2 class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p2=new ProductImpl2();
		p2.allProducts();
		p2.newProduct();
		//p2.show();//We will get an error as p2 show is local method

	}

}
