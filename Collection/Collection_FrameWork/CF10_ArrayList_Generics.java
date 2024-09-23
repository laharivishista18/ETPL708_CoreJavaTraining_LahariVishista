package com.evergent.corejava.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CF10_ArrayList_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList=new ArrayList();
		myList.add(100);
		myList.add(80);
		myList.add(90);
		myList.add(100);
		System.out.println(myList);
		Iterator i=myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
