package com.evergent.corejava.user_stories;

public class LibraryUserInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUsers k=new KidUsers();
		k.registerAccount(10);
		k.registerAccount(18);
		k.requestBook("Kids");		
		k.requestBook("Fiction");
		AdultUser a=new AdultUser();
		a.registerAccount(5);
		a.registerAccount(23);
		a.requestBook("Kids");
		a.requestBook("Fiction");
		
		
		
		

	}

}
