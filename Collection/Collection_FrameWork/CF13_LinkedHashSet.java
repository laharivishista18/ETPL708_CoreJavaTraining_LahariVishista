package com.evergent.corejava.Collections;
import java.util.LinkedHashSet;
public class CF13_LinkedHashSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet();
		//Adding elements to Linked HashSet
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Grapes");
		//Displaying the LinkedHashSet
		System.out.println("LinkedHashSet:"+linkedHashSet);
		//Iterating through LinkedHashSet
		for(String fruit:linkedHashSet) {
			System.out.println(fruit);
		}
		//Checking if set contains an element,returns true if this set contains specification
		System.out.println("Contains 'Mango:"+linkedHashSet.contains("Mango"));
		//Removing an element
		linkedHashSet.remove("Banana");
		System.out.println("After removing 'Banana':"+linkedHashSet);
		//Checking the size of LinkedHashSet
		System.out.println("Size of LinkedHashSet:"+linkedHashSet.size());
		//Clearing the LinkedHashSet
		System.out.println("After clearing:"+linkedHashSet);
	}}