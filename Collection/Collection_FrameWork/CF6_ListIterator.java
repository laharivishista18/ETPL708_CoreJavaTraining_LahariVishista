package com.evergent.corejava.Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;


public class CF6_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("lahari");
		list.add("vishista");
		list.add("Harshitha");
		list.add("Harika");
		
		ListIterator li=list.listIterator();
		li.add("Welcome");
		li.add("Hello");
		while(li.hasNext()) {
			String s=(String)li.next();
			System.out.println(s);
			if(s.equals("Harshitha")) {
				li.remove();
			}}
			while(li.hasPrevious()) {
				System.out.println(li.previous());
			}
		}
	}


