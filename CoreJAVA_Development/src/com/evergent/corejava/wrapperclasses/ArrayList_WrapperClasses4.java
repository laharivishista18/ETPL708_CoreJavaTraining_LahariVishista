package com.evergent.corejava.wrapperclasses;
import java.util.ArrayList;
public class ArrayList_WrapperClasses4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i1=new Integer(a);
		ArrayList mylist=new ArrayList();
		mylist.add(i1);
		Integer i2=new Integer(100);
		mylist.add(i2);
		mylist.add(new Integer(200));
		System.out.println(mylist);
		ArrayList mylist1=new ArrayList();
		mylist1.add(100);
		System.out.println(mylist1.get(0));

	}

}
