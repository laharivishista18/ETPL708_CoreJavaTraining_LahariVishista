package com.evergent.corejava.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class CF11_HashSet_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> mySet=new HashSet<String>();
		mySet.add("hello");
		mySet.add("Welcome");
		System.out.println(mySet);
		Iterator i=mySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
