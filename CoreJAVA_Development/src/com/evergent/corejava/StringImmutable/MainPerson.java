package com.evergent.corejava.StringImmutable;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable person=new PersonImmutable("Lahari",2);

		System.out.println("Name:"+person.MyName());
		System.out.println("Age:"+person.MyAge());
	}

}
