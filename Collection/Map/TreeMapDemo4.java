package com.evergent.corejava.Collections.map;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Tree Map to store records
		TreeMap<Integer,String> studentRecords=new TreeMap<>();
		//Adding student records to TreeMap
		studentRecords.put(102, "lahari");
		studentRecords.put(103, "Vishista");
		studentRecords.put(104, "Harshitha");
		studentRecords.put(105, "Harika");
		System.out.println(studentRecords);
		//Displaying Treemap sorted by ID
		System.out.println("student Records(Sorted by ID):");
		for(Map.Entry<Integer,String>entry: studentRecords.entrySet()) {
			System.out.println("ID:"+entry.getKey()+",Name:"+entry.getValue());	
		}
		

	}

}
