package com.evergent.corejava.Collections;
import java.util.TreeSet;
import java.util.Iterator;
/**
 * @author Lahari.Sampangi
 *
 */
public class TreeSetDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet mySet=new TreeSet();
		mySet.add(100);
		mySet.add(40);
		mySet.add(180);
		mySet.add(100);//Don't allow duplicates
		System.out.println(mySet);//Gives in Sorted order
		Iterator i=mySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
