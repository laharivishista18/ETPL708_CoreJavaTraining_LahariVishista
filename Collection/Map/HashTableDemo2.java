package com.evergent.corejava.Collections.map;

import java.util.Hashtable;

public class HashTableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable mymap=new Hashtable();
		mymap.put(100,"Lahari");
		mymap.put(2000,"Vishista");
		mymap.put(300,"HArsha");
		mymap.put(100,"Revanth");
		//mymap.put(null,"Dimpu");//Exception
		//mymap.put(700,null);//Exception
		//mymap.put(600,null);//Exception
		mymap.put(3000,5654);
		System.out.println(mymap);

	}

}
