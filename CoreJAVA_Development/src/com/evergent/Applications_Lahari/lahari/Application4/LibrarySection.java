package com.evergent.corejava.lahari.Application4;

import java.util.Scanner;

//Library Section class extending Section (Method Overriding)
class LibrarySection extends Section {
 public LibrarySection(String name, int ID) {
     super(name, ID);
 }

 @Override
 public void calculateFee() {
     System.out.println("Calculating Library Section fees...");
     Scanner s = new Scanner(System.in);
     boolean libraryMenu = true;
     int libraryFee = 0;
     int Ffee=0;
     int Sfee=0;
     int Tfee=0;
     int Rfee=0;

     while (libraryMenu) {
         System.out.println("=========================================================");
         System.out.println("Choose the year for which you need to return the books:");
         System.out.println("F - First year");
         System.out.println("S - Second year");
         System.out.println("T - Third year");
         System.out.println("R - Fourth year");
         System.out.println("Q - Return to main menu");
         System.out.print("Enter the year books that you have not submitted (F, S, T, f) or 'Q' to return to the main menu: ");
         String mod = s.next();

         switch (mod.toUpperCase()) {
             case "F":
             	if(ID==5) {
             		Ffee=1000;
             		//libraryFee+=1000;
             	}
             	else if(ID==9) {
             		Ffee=1500;
             		//libraryFee+=1500;
             	}
             	else {
             		Ffee=0;
             		//libraryFee+=0;
             	}
             	libraryFee+=Ffee;
      
                 System.out.println("Cost of 1st year books: " + Ffee);
                 break;
             case "S":
             	if(ID==5) {
             		Sfee=1800;
             	}
             	else if(ID==9) {
             		Sfee=2000;
             	}
             	else {
             		Sfee+=0;
             	}
             	libraryFee+=Sfee;
                 System.out.println("Cost of 2nd year books: " + Sfee);
                 break;
             case "T":
             	if(ID==5) {
             		Tfee=2500;
             	}
             	else if(ID==9) {
             		Tfee=2000;
             	}
             	else {
             		Tfee+=0;
             	}
             	libraryFee+=Tfee;
             
                 System.out.println("Cost of 3rd year books: " + Tfee);
                 break;
             case "R":
             	if(ID==5) {
             		Rfee=1100;
             	}
             	else if(ID==9) {
             		Rfee=1300;
             	}
             	else {
             		Rfee=0;
             	}
             	libraryFee+=Rfee;
                 
                 System.out.println("Cost of 4th year books: " + Rfee);
                 break;
             case "Q":
                 libraryMenu = false;
                 break;
             default:
                 System.out.println("Invalid option, please choose a valid year.");
         }
     }
     totalAmount += libraryFee;
     System.out.println("Total library section fee: " + libraryFee);
 }
}
