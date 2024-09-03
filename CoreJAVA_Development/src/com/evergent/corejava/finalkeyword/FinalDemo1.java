package com.evergent.corejava.finalkeyword;

public class FinalDemo1 {
	final String cname="india";
	public void myData() {
		//cname="Welcome!";//we'll get an error as it is declared as final
		System.out.println(cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo1 fd1=new FinalDemo1();
		fd1.myData();
	}

}
