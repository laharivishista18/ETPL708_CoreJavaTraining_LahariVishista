package com.evergent.corejava.exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 


public class CompileTimeFileDemo15 {

	public static void main(String[] args) {
		try {
			File f=new File("c:/mydata/myinfo.txt");
			Scanner s=new Scanner(f);
			while(s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
			s.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found:"+e.getMessage());
			//e.printStackTrace();
		}
		

	}

}
