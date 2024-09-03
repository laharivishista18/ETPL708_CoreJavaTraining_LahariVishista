package com.evergent.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(10,"Laptop",50000);
		System.out.println("Product No:"+p.getPno());
		System.out.println("Product Name:"+p.getPname());
		System.out.println("Product price:"+p.getPrice());

	}

}
