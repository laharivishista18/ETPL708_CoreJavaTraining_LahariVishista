package com.evergent.corejava.basicprogram;
enum Color{
	Red,Green,Blue
}
enum News{
	North,East,West,South
}
enum AbcProducts{
	Laptops,Desktops,Tabs
}
enum Days{
	M,T,W,Thurs,F,Saturday,Sunday
}
public class ColoursExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c=Color.Red;
		System.out.println(c);
		News s=News.North;
		System.out.println(s);
		AbcProducts p=AbcProducts.Laptops;
		System.out.println(p);
		Days day=Days.Sunday;
		System.out.println("Holiday:"+day);
	}

}
