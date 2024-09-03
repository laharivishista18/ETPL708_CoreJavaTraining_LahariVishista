package com.evergent.corejava.oops;

public class HAS_A_RelationDemo {
	public void show() {
		System.out.println("Show Method");
	}
	public static void main(String[] args) {
		HAS_A_RelationDemo has=new HAS_A_RelationDemo();
		has.show();
		Person person=new Person();
		person.personDetails();
		// TODO Auto-generated method stub

	}

}
