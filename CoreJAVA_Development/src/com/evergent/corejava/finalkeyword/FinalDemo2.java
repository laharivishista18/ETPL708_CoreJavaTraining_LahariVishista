package com.evergent.corejava.finalkeyword;

class Myclass{
	final public void myProducts() {
		System.out.println("All Products");
	}
}
public class FinalDemo2 extends Myclass {
	final String cname="India";
	public void myProducts1() {//we can't override final methods nd we get error
		System.out.println("new products");
	}
	public void myData() {
		//cname=Welcome;//we are getting error
		System.out.println(cname);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo2 fd2=new FinalDemo2();
		fd2.myData();
		fd2.myProducts();
	}

}
