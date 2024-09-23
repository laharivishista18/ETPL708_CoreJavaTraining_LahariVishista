package com.evergent.corejava.Collections.Collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CC8_CollectionsReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> items = new ArrayList<>();
	        items.add("Apple");
	        items.add("Banana");
	        items.add("Apple");
	        items.add("Cherry");
	        items.add("Apple");
	        System.out.println("Before Modified list: " + items);
	        // Replacing all occurrences of "Apple" with "Orange"
	        Collections.replaceAll(items, "Apple", "Orange");

	        // Displaying the modified list
	        System.out.println("Modified list: " + items);

	}

}
