package com.evergent.corejava.Collections;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class CF14_ArrayList_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<String>();
		list.add("Core Java");
		list.add("J2EE");
		list.add("J2EE");
		list.add("MyJava");
		System.out.println(list);
		Set<String>s=new HashSet<String>();
		s.addAll(list);
		System.out.println(s);
		Set<String> s1=new HashSet<String>();
		s1.add("Core Java");
		s1.add("J2EE");
		s1.add("J2EE");
		s1.add("MyJava");
		s1.add("CoreJava");
		if(s.equals(s1)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}

	}

}
