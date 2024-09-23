package com.evergent.corejava.io.serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class ProductSerializable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("C:/Users/lahari.sampangi/Documents/Example_file2.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Product p1=new Product(1001,"Mouse",450);
			Product p2=new Product(1002,"Keyboard",400);
			Product p3=new Product(1003,"Laptop",410);	
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			System.out.println("Write object into Example.txt");
			oos.close();			
		}
		catch(Exception e) {
			System.out.println("I can handle:"+e);
			
		}

	}

}
