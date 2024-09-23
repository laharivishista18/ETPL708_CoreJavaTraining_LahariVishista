package com.evergent.corejava.multithreading;// implementation of a producer and consumer. 
public class SynchronizedDemo { 
	public static void main(String args[]) { 
		Q q = new Q(); 
		new Producer(); 
		new Consumer(q); 
		System.out.println("Press Control-C to stop."); 
	} 
}
