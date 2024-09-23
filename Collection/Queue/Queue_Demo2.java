package com.evergent.corejava.Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>pq=new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);


	}

}
