package com.evergent.corejava.ram.Application3;

public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{
	int empno;
	double sal;
	String address;
	//Interface override methods
	public void employeeInfo(int eno,float sal) {//throws Exception{
		this.empno=eno;
		this.sal=sal;
	}
	public void employeeAddress(String address) {
		this.address=address;
	}
	public void employeeDetails() {
		System.out.println("Employee no:"+empno);
		System.out.println("Employee sal:"+sal);
		System.out.println("Employee address:"+address);
	}
	//abstract class implementation
	public void accountDetails() {
		System.out.println("My account Details is: 12345678");
	}
	public void show() {
		System.out.println("This is show local method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface methods calling
		EmployeeInformation emp=new EmployeeInformation();
		emp.employeeInfo(100,5000);
		emp.employeeAddress("HYd");
		emp.employeeDetails();
	//Abstarct class
		emp.accountDetails();
		emp.bankDetails();
		//Calling Bank RBI with HAS-A
		//Call local methods
		emp.show();
		//Calling Bank RBI with HAS-a
		BankRBI rbi=new BankRBI();
		BankRBI rbi1=new BankRBI(3.3,3.3);
		BankRBI.getBankDetails();

	}

}
