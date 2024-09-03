package com.evergent.corejava.oops;

public class Person {
	String name="Lahari";
	int age=21;
	String address="hyderabad";
	public void personDetails() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(address);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.personDetails();
		
		

	}

}
