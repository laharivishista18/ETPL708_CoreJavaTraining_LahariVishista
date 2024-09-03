package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Autoboxing of character
		
	char ch1='a';
	Character myc=new Character(ch1);
	//Autounboxing of  Character
	char ch=myc.charValue();
	//Print statements
	System.out.println("Value of ch:"+ch);
	System.out.println("Value of gf:"+myc);

	}

}
