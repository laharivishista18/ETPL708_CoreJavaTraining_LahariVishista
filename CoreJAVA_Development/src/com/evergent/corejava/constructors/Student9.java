package com.evergent.corejava.constructors;

public class Student9 {
	String name;
	int age;
	//Constructor
	public Student9(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//Copy constructor
	public Student9(Student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	//Method to display student details
	public void displayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student9 s1=new Student9("Lahari",21);
		Student9 s2=new Student9(s1);
		//Creating copy of s1
		s1.displayDetails();//Display details of s1
		s2.displayDetails();//Display details of s2
	}

}
