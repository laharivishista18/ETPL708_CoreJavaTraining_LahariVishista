package com.evergent.corejava.wrapperclasses;
public class WrapperClassesDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1=4.5f;
		Float f2=new Float(f1);
		float f3=f2.floatValue();
		
		double d1=799.9;
		Double d2=new Double(d1);
		double d3=d2.doubleValue();
		
		byte b1=10;
		Byte b2=new Byte(b1);
		byte b3=b2.byteValue();
		
		System.out.println("FLoat Value:"+f1);
		System.out.println("FLoat object value is:"+f2);
		System.out.println("COnvert float object value is Primitive:"+f3);
		
		System.out.println("Double Value:"+d1);
		System.out.println("Double object value is:"+d2);
		System.out.println("COnvert double object value is Primitive:"+d3);
		
		System.out.println("Byte Value:"+b1);
		System.out.println("Byte object value is:"+b2);
		System.out.println("COnvert byte object value is Primitive:"+b3);
		
		

	}

}
