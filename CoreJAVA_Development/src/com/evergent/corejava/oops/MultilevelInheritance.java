package com.evergent.corejava.oops;
class PersonData{
public void myPersonData() {
	System.out.println("PersonData Class method");
}
}
class PersonInfo extends PersonData{
	public void myDetails() {
		System.out.println("Personinfo class method");
	}
}
public class MultilevelInheritance extends PersonInfo{
	public void show() {
		System.out.println("local method");
	}
public static void main(String args[]) {
	MultilevelInheritance mli=new MultilevelInheritance();
	mli.myPersonData();
	mli.myDetails();
	mli.show();
	}
}
