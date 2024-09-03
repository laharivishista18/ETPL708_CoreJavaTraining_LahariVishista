package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEno(100);
		emp.setEname("Lahari");
		emp.setSal(50000);
		System.out.println("Employee No:"+emp.getEno());
		System.out.println("Employee Name:"+emp.getEname());
		System.out.println("Employee Sal"+emp.getSal());
		

	}

}
