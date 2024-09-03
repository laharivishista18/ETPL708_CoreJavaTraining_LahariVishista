package com.evergent.corejava.basicprogram;

public class biggest5numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=15,c=5,d=20,e=25;
		if(a>b&&a>c&&a>d&&a>e)
			System.out.println("a is big");
		else if(b>a&&b>c&&b>d&&b>e)
			System.out.println("b is big");
		else if(c>b&&c>a&&c>d&&c>e)
			System.out.println("c is big");
		else if(d>b&&d>c&&d>a&&d>e)
			System.out.println("d is big");
		else
			System.out.println("e is big");

	}

}
