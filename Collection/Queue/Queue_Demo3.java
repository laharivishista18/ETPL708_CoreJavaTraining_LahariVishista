package com.evergent.corejava.Collections.Queue;

import java.util.PriorityQueue;

public class Queue_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		pq.clear();
		System.out.println(pq.poll());
		//System.out.println(pq.remove());//Raises exception

	}

}
