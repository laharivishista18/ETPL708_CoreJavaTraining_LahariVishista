package com.evergent.corejava.Collections.map;

import java.util.HashMap;

public class HashMapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> capitalcities=new HashMap<String,String>();
		capitalcities.put("India", "Delhi");
		capitalcities.put("USA", "Washington DC");
		capitalcities.put("Germany", "Berlin");
		System.out.println(capitalcities);
		for(String i:capitalcities.keySet()) {
			System.out.println(i);
		}
	}
}
