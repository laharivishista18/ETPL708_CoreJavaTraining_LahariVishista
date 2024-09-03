package com.evergent.corejava.constructors;

class Car{
	String color;
	int maxSpeed;
	//Default constructor
	Car(){
		color="White";
		maxSpeed=120;
	}
	Car(String color,int maxSpeed){
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void display() {
		System.out.println("Color:"+color);
		System.out.println("MaxSpeed:"+maxSpeed);
	}
}
public class MyCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		Car c2=new Car("Red",150);
		c1.display();
		c2.display();

	}

}
