package com.evergent.corejava.Collections.Collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CC4_CollectionsShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Pineapple");

        // Display the original list
        System.out.println("Original list: " + fruits);

        // Shuffling the list
        Collections.shuffle(fruits);

        // Display the shuffled list
        System.out.println("Shuffled list: " + fruits);
        

	}

}
