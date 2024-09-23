package com.evergent.corejava.Collections;
import java.util.HashSet;
public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet mySet=new HashSet();
		mySet.add(100);
		mySet.add("hello");
		mySet.add(45.5);
		mySet.add(100);//Don't allow duplicates
		System.out.println(mySet);

	}

}
