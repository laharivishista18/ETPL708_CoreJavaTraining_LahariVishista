package com.evergent.corejava.Collections.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> ad=new LinkedList<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		ad.offer("Apple");
		ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.size());
		System.out.println(ad.isEmpty());
	}
}
