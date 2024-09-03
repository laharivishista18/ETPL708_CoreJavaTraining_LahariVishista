package com.evergent.corejava.lahari.Application4;
import java.util.*;

import java.util.Scanner;
// Main Application Class
public class NoDueForm {
    // Method Overloading example
    public static void welcomeMessage(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static void welcomeMessage(String name, int ID) {
        System.out.println("Welcome, " + name + " with ID: " + ID + "!");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your ID number: ");
        int ID = s.nextInt();
        welcomeMessage(name, ID);

        // Creating objects for different sections
        Section labSection = new LabSection(name, ID);
        Section librarySection = new LibrarySection(name, ID);
        Section examSection = new ExamSection(name, ID);
        Section scholarSection = new ScholarSection(name, ID);

        boolean sectionMenu = true;
        while (sectionMenu) {
            System.out.println("=========================================================");
            System.out.println("Select the section to know the due amount:");
            System.out.println("L - Labs");
            System.out.println("B - Library");
            System.out.println("E - Examination Section");
            System.out.println("S - Scholarship Section");
            System.out.println("Q - Quit");
            System.out.println("=========================================================");
            System.out.print("Enter the section (L, l, E, S) or 'Q' to quit: ");
            String mod = s.next();

            switch (mod.toUpperCase()) {
                case "L":
                    labSection.calculateFee(); // Polymorphism in action
                    break;
                case "B":
                    librarySection.calculateFee(); // Polymorphism in action
                    break;
                case "E":
                    examSection.calculateFee(); // Polymorphism in action
                    break;
                case "S":
                    scholarSection.calculateFee(); // Polymorphism in action
                    break;
                case "Q":
                    sectionMenu = false;
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid section.");
            }
        }

        // Display total amount (Static method)
        Section.displayTotalAmount();
    }
}