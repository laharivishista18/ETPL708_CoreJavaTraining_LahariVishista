package com.evergent.corejava.exceptionhandling;

class ProductNotFoundException extends Exception {
	public ProductNotFoundException(String msg) {
		System.out.println("hello:"+msg);
	}
}
public class ProductImpl{
	int pno=105;
	public void myData() throws ProductNotFoundException{
		if(pno>100) {
			throw new ProductNotFoundException("There are no Products");
		}
		else {
			System.out.println("Products are there");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ProductImpl p1=new ProductImpl();
			p1.myData();
		}
		catch(ProductNotFoundException e) {
			System.out.println(e);
		}

	}

}
