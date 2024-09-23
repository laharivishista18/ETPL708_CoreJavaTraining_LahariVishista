package com.evergent.corejava.Collections;

import java.util.LinkedList;

public class CF8_LinkedList1 {

	public static void main(String[] args) {
		LinkedList mylist=new LinkedList();
		mylist.add("TATA");
		mylist.add("BMW");
		mylist.add("VoLVo");
		mylist.addFirst("Maruthi");
		mylist.addLast("Safari");
		mylist.remove(3);
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);
		// TODO Auto-generated method stub

	}

}
