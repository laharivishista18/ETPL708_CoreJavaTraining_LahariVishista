package com.evergent.corejava.Collections.Queue;
import java.util.ArrayDeque;
public class Queue_ArrayDeque7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		ad.offer("Apple");
		ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.size());
		boolean t=ad.isEmpty();
		System.out.println(t);
		ad.clear();
		System.out.println(ad);

	}

}
