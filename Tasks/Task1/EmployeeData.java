package com.evergent.corejava.Collections.Tasks1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee details");
		for(int i=0;i<3;i++){
			Employee obj=new Employee();
			System.out.println("Enter the id");
			obj.setId(sc.nextInt());
			System.out.println("Enter the name");
			obj.setName(sc.next());
			System.out.println("Enter the salary");
			obj.setSalary(sc.nextFloat());
			list.add(obj); 		}		 
	
		Iterator<Employee> obj=list.iterator();
		while(obj.hasNext()){
			System.out.println("Iterator order");
			Employee ob=obj.next();
			System.out.println(ob.getId()+ " "+ ob.getName()+ " "+ob.getSalary());
		} 	
	}

	}


