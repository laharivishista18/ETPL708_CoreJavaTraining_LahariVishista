package com.evergent.corejava.lahari.Application4;

import java.util.Scanner;

//Scholar Section class extending Section (Method Overriding)
class ScholarSection extends Section {
 public ScholarSection(String name, int ID) {
     super(name, ID);
 }

 @Override
 public void calculateFee() {
     System.out.println("Calculating Scholarship Section fees...");
     Scanner s = new Scanner(System.in);
     boolean scholarMenu = true;
     int scholarFee = 0;
     int tuitionFee=0;
     int messFee=0;

     while (scholarMenu) {
         System.out.println("=========================================================");
         System.out.println("Choose the due scholarship amount to be paid:");
         System.out.println("T - Tuition fees");
         System.out.println("M - Mess fees");
         System.out.println("Q - Return to main menu");
         System.out.print("Enter your choice (T, M) or 'Q' to return to the main menu: ");
         String mod = s.next();

         switch (mod.toUpperCase()) {
             case "T":
                 final int totalTuition = 150000;
                 System.out.print("Enter the scholarship amount secured: ");
                 int securedTuition = s.nextInt();
                 tuitionFee = totalTuition - securedTuition;
                 scholarFee+=tuitionFee;
                 System.out.println("The total tuition fees after scholarship: " + tuitionFee);
                 break;
             case "M":
                 final int totalMess = 50000;
                 System.out.print("Enter the scholarship amount secured for mess: ");
                 int securedMess = s.nextInt();
                 messFee = totalMess - securedMess;
                 scholarFee+=messFee;
                 System.out.println("The total mess fees after scholarship: " + messFee);
                 break;
             case "Q":
                 scholarMenu = false;
                 break;
             default:
                 System.out.println("Invalid option, please choose a valid section.");
         }
     }
     totalAmount += scholarFee;
     System.out.println("Total scholarship section fee: " + scholarFee);
 }
}
