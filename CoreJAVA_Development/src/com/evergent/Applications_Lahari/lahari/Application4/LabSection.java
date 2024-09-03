package com.evergent.corejava.lahari.Application4;

import java.util.Scanner;
// Lab Section class extending Section (Method Overriding)

class LabSection extends Section {
    public LabSection(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void calculateFee() {
        System.out.println("Calculating Lab Section fees...");
        Scanner s = new Scanner(System.in);
        boolean labMenu = true;
        int labFee = 0;
        int Dfee=0;
        int Cfee=0;
        int Mfee=0;

        while (labMenu) {
            System.out.println("=========================================================");
            System.out.println("The following are the labs that you have in your curriculum:");
            System.out.println("D - DEC Lab");
            System.out.println("C - Chemistry Lab");
            System.out.println("M - Microcontroller Lab");
            System.out.println("Q - Return to main menu");
            System.out.print("Enter the labs that you are due with (D, C, M) or 'Q' to return to the main menu: ");
            String mod = s.next();

            switch (mod.toUpperCase()) {
                case "D":
                	if(ID==5) {
                		Dfee=100;
                		//labFee+=100;
                	}
                	else if(ID==9) {
                		Dfee=50;
                		//labFee+=50;
                	}
                	else {
                		Dfee=50;
                		//labFee+=0;
                	}
                	labFee+=Dfee;
                    System.out.println("Amount to be paid in DEC lab: " + labFee);
                    break;
                case "C":
                	if(ID==5) {
                		Cfee=150;
                		//labFee+=150;
                	}
                	else if(ID==9) {
                		Cfee=250;
                		//labFee+=250;
                	}
                	else {
                		Cfee=0;
                		//labFee+=0;
                	}
                	labFee+=Cfee;
                    System.out.println("Amount to be paid in Chemistry lab: " + Cfee);
                    break;
                case "M":
                	if(ID==5) {
                		Mfee=1500;
                		//labFee+=1500;
                	}
                	else if(ID==9) {
                		Mfee=2000;
                		//labFee+=2000;
                	}
                	else {
                		Mfee=0;
                		//labFee+=0;
                	}
                	labFee+=Mfee;
                    System.out.println("Amount to be paid in Microcontroller lab: " + Mfee);
                    break;
                case "Q":
                    labMenu = false;
                    break;
                default:
                    System.out.println("Invalid option, please choose a valid lab.");
            }
        }
        totalAmount += labFee;
        System.out.println("Total lab section fee: " + labFee);
    }
}
