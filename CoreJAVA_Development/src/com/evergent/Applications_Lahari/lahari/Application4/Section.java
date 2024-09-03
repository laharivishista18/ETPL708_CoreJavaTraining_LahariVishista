package com.evergent.corejava.lahari.Application4;

	// Base abstract class for all sections (Inheritance and Encapsulation)
	abstract class Section implements Due {
	     String name;
	     int ID;
	     static int totalAmount = 0; // Static keyword: total amount for all sections
	     static final int BACKLOG_FEE = 500; // Final constant for backlog fees

	    // Constructor
	    public Section(String name, int ID) {
	        this.name = name;
	        this.ID = ID;
	    }

	    // Getter and Setter (Encapsulation)
	    public String getName() {
	        return name;
	    }

	    public int getID() {
	        return ID;
	    }

	    // Abstract method (Polymorphism)
	    public abstract void calculateFee();

	    // Static method to display the total amount
	    public static void displayTotalAmount() {
	        System.out.println("Total amount to be paid for all sections: " + totalAmount);
	    }
	}



