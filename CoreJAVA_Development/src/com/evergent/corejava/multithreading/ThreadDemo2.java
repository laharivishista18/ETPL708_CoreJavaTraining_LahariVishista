package com.evergent.corejava.multithreading;

class Myclass2 implements Runnable{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass2 my=new Myclass2();
		Thread t1=new Thread(my);
		t1.start();

	}

}
