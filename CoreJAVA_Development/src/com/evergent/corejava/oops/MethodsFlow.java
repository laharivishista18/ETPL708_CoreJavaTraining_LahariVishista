package com.evergent.corejava.oops;

public class MethodsFlow {
	//No Arg No return
	public void display() {
		System.out.println("My name is Lahari");
		System.out.println("NANR");
	}
	//Arg with No return
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	//Arg with Return
	public int myData(int a,int b) {
		return a*b;
	}
	//No arg with return
	public int myChange() {
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsFlow mf=new MethodsFlow();
		mf.display();
		mf.add(5, 6);
		int c=mf.myData(4, 5);
		System.out.println(c);
		int mc=mf.myChange();
		System.out.println(mc);

	}

}
