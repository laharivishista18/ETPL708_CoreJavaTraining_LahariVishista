package com.evergent.corejava.io.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeserializableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Product p=new Product();
			FileInputStream fis=new FileInputStream("C:/Users/lahari.sampangi/Documents/Example_file2.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			while((p=(Product)ois.readObject())!=null){
				System.out.println("Product Data:"+p.getPid()+p.getPname()+p.getPrice());
			}
		}
		catch(Exception e) {
			System.out.println("End of the file");
		}
	}

}
