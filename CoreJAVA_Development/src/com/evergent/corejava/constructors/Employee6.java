package com.evergent.corejava.constructors;

class MyEmployee{
	int eno;
	public MyEmployee() {
		
	}
	public MyEmployee(int eno) {
		System.out.println("MyEmployeeNo:"+eno);
	}
}
public class Employee6 extends MyEmployee {
	String ename;
	double sal;
	Employee6(){
		System.out.println("Default constructor");
	}
	Employee6(int eno,String ename,double sal){
		super(eno);
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
		new Employee6();
		Employee6 emp2=new Employee6(123,"Lahari",55000);
		emp2.display();

	}

}
