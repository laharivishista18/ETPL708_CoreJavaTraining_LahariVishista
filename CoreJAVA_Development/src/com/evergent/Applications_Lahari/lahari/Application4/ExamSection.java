package com.evergent.corejava.lahari.Application4;

import java.util.Scanner;

//Exam Section class extending Section (Method Overriding)
class ExamSection extends Section {
 public ExamSection(String name, int ID) {
     super(name, ID);
 }

 @Override
 public void calculateFee() {
     System.out.println("Calculating Exam Section fees...");
     Scanner s = new Scanner(System.in);
     System.out.println("Enter your exam status:");
     System.out.println("N - No Backlogs");
     System.out.println("B - Backlogs");
     String mod = s.next();

     int examFee = 0;
     if (mod.equalsIgnoreCase("N")) {
         examFee = 0;
         System.out.println("No backlogs, no fees.");
     } else if (mod.equalsIgnoreCase("B")) {
         System.out.print("Enter the number of backlogs: ");
         int backlogs = s.nextInt();
         examFee = backlogs * BACKLOG_FEE;
         System.out.println("The total amount to be paid for exams: " + examFee);
     }
     totalAmount += examFee;
     System.out.println("Total exam section fee: " + examFee);
 }
}