package com.evergent.corejava.Collections.Queue;

import java.util.Deque;
import java.util.LinkedList;
public class Queue_LinkedList10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String>q1=new LinkedList<>();
		q1.add("la");
		q1.offer("ha");
		q1.add("ri");
		q1.add("vi");
		q1.add("sh");
		System.out.println(q1);
		System.out.println(q1.poll());
	}

}
