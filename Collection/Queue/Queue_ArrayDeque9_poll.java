package com.evergent.corejava.Collections.Queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque9_poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollFirst());


	}

}
