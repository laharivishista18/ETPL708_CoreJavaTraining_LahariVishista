package com.evergent.corejava.constructors;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("Default constructor");
	}
	Employee3(int eno,String ename,double sal){
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Employee no:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee sal:"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee3();
		Employee3 emp2=new Employee3(123,"Lahari",55000);
		emp2.display();

	}

}
