package com.evergent.corejava.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet mySet=new HashSet();
		mySet.add(100);
		mySet.add("hello");
		mySet.add(45.5);
		mySet.add(100);//Don't allow duplicates
		System.out.println(mySet);
		Iterator i=mySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}


	}

}
