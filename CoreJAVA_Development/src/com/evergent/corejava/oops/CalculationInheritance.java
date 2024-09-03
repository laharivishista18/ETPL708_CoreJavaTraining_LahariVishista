package com.evergent.corejava.oops;

public class CalculationInheritance extends Calculation {
	public void show() {
		System.out.println("Show method local class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationInheritance cal=new CalculationInheritance();
		cal.show();
		cal.addition();

	}

}
