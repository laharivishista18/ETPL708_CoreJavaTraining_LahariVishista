package com.evergent.corejava.laharivishista.application2;

import java.util.Scanner;



public class NODueForm  {
	enum section{ L,l,E,S,Q}
	enum labs{D,C,M,Q}
	enum library{F,S,T,f,Q}
	enum Exam{N,B,Q}
	enum Scholar{T,M,Q}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name=s.next();
		System.out.println("Enter your ID number");
		int ID =s.nextInt();
		System.out.println("Hi "+name+" Here comes the amount to be paid in order to get ur certificates");
		boolean sectionmenu=true;
		while(sectionmenu)
		{
			int amt=0;
			System.out.println("=========================================================");
			System.out.println("Select the section that you want to know the due amount");
			System.out.println("Sections");
			System.out.println("L- For Labs due");
			System.out.println("l - For Library due");
			System.out.println("E - For Examination Section Due");
			System.out.println("S - For Scholarship Section");
			System.out.println("=========================================================");
			System.out.println("Enter the section(L,l,E,S)");
			String mod=s.next();
			//System.out.println("You entered the section:");
			switch (section.valueOf(mod)) {
            	case L:
            		boolean labsMenu = true;
            		while (labsMenu) {
            			System.out.println("=========================================================");
            			System.out.println("The following are the labs that you have in your curriculum");
            			System.out.println("D - DEC Lab");
            			System.out.println("C - Chemistry Lab");
            			System.out.println("M - Microcontroller Lab");
            			System.out.println("Enter the labs that you are due with from (D, C, M) or 'Q' to return to the main menu:");
            			mod = s.next();
            			if (mod.equalsIgnoreCase("Q")) {
            				labsMenu = false;
            			} 
            			else {
            				switch (labs.valueOf(mod)) {
                            	case D:
                            		if(ID==5) {
                            		int dval = 100;
                            		System.out.println("The amount to be paid in DEC lab is " + dval);
                            		amt += dval;
                            		break;
                            		}
                            		else if(ID==9){
                            			int dval = 50;
                                		System.out.println("The amount to be paid in DEC lab is " + dval);
                                		amt += dval;
                                		break;
                            		}
                            		else {
                            			int dval = 0;
                                		System.out.println("The amount to be paid in DEC lab is " + dval);
                                		amt += dval;
                                		break;
                            		}
                            		
                            	case C:
                            		if(ID==5) {
                            		int cval = 150;
                            		System.out.println("The amount to be paid in Chemistry lab is " + cval);
                            		amt += cval;
                            		break;
                            		}
                            		else if(ID==9) {
                                		int cval = 250;
                                		System.out.println("The amount to be paid in Chemistry lab is " + cval);
                                		amt += cval;
                                		break;
                            		}
                                	else {
                                		int cval =0;
                                		System.out.println("The amount to be paid in Chemistry lab is " + cval);
                                		amt += cval;
                                		break;
                                	}
                                		
                            	case M:
                            		if(ID==5) {
                            		int mval = 1000;
                            		System.out.println("The amount to be paid in Microcontroller lab is " + mval);
                            		amt += mval;
                            		break;
                            		}
                            		else if(ID==9) {
                                		int mval = 1500;
                                		System.out.println("The amount to be paid in Microcontroller lab is " + mval);
                                		amt += mval;
                                		break;
                                		}
                            		else {
                            			int mval = 0;
                                		System.out.println("The amount to be paid in Microcontroller lab is " + mval);
                                		amt += mval;
                                		break;

                            			
                            		}
            				}
            			}
            		}
            		System.out.println("The total amount to be paid after Labs is " + amt);
            	case l:
            		boolean libraryMenu = true;
            		while (libraryMenu) {
            			System.out.println("=========================================================");
            			System.out.println("Choose the year that you need to return the books");
            			System.out.println("F - First year");
            			System.out.println("S - Second year");
            			System.out.println("T - Third year");
            			System.out.println("f - Fourth year");
            			System.out.println("Enter the year books that you have not submitted or 'Q' to return to the main menu:");
            			mod = s.next();
            			if (mod.equalsIgnoreCase("Q")) {
            				libraryMenu = false;
            			} 
            			else {
            				switch (library.valueOf(mod)) {
            					case F:
            						if(ID==5) {
            						int Fval = 1000;
            						System.out.println("The cost of 1st year books: " + Fval);
            						amt += Fval;
            						break;
            						}
            						else if(ID==9) {
                						int Fval = 1500;
                						System.out.println("The cost of 1st year books: " + Fval);
                						amt += Fval;
                						break;
                						}
            						else {
            							int Fval = 0;
                						System.out.println("The cost of 1st year books: " + Fval);
                						amt += Fval;
                						break;
            							
            						}
            					case S:
            						if(ID==5) {
            						int sval = 1500;
            						System.out.println("The cost of 2nd year books: " + sval);
            						amt += sval;
            						break;
            						}
            						else if(ID==9) {
                						int sval = 1800;
                						System.out.println("The cost of 2nd year books: " + sval);
                						amt += sval;
                						break;
                						}
            						else {
            							int sval = 0;
                						System.out.println("The cost of 2nd year books: " + sval);
                						amt += sval;
                						break;	
            						}
            						
            					case T:
            						if(ID==5) {
            						int tval = 2500;
            						System.out.println("The cost of 3rd year books: " + tval);
            						amt += tval;
            						break;
            						}
            						else if(ID==5) {
                						int tval = 2000;
                						System.out.println("The cost of 3rd year books: " + tval);
                						amt += tval;
                						break;
                						}
            						else {
            							int tval = 0;
                						System.out.println("The cost of 3rd year books: " + tval);
                						amt += tval;
                						break;
            							
            						}
            					case f:
            						if(ID==5) {
            						int fval = 1100;
            						System.out.println("The cost of 4th year books: " + fval);
            						amt += fval;
            						break;
            						}
            						else if(ID==9) {
                						int fval = 1300;
                						System.out.println("The cost of 4th year books: " + fval);
                						amt += fval;
                						break;
            						
            				}
            						else {
            							int fval = 0;
                						System.out.println("The cost of 4th year books: " + fval);
                						amt += fval;
                						break;
            						
            							
            						}
            			}
                }
                System.out.println("The total amount to be paid after adding Library is " + amt);
                }
		case E:
			System.out.println("Choose ur exam status");
			System.out.println("========================================================");
			System.out.println("N-No Backlog");
			System.out.println("B-Backlog");
			System.out.println("=========================================================");
			System.out.println("Select one from the status(N,B)");
			mod=s.next();
			switch(Exam.valueOf(mod)) {
			case N:
				int nval=0;
				System.out.println("The total amount to be paid in exam is"+nval);
				amt=amt+nval;
				break;
			case B:
				System.out.println("Enter the no.of backlogs uh have:");
				int AB=s.nextInt();
				int bval=500;
				int totalbval=bval*AB;
				System.out.println("The total amount to be paid for exam is"+AB+" * "+bval+" = "+ totalbval);
				amt=amt+totalbval;
				break;
			}
			System.out.println("The total amount to be paid after Examination section is:"+amt);
		case S:
			boolean scholar=true;
			while(scholar){
			System.out.println("=========================================================");
			System.out.println("Choose the due scholarship amount to be paid");
			System.out.println("T-Tuition fees");
			System.out.println("M-Mess fees");
			System.out.println("=========================================================");
			//System.out.println("Enter the due Scholarship amount uh need to be paid(T,M)");
			//mod=s.next();
                System.out.println("Enter the Scholarship details of (T,M) and 'Q' if uh are done");
                mod = s.next();
                
                if (mod.equalsIgnoreCase("Q")) {
                	scholar=false; 
                }
                else {
			switch (Scholar.valueOf(mod)) {
			case T:
				int total=150000;
				System.out.println("Enter the Scholarship amount that uh have secured");
				int tscholar=s.nextInt();
				int tdue=total-tscholar;
				System.out.println("The total tuition fees to be paid after the scholarship amount is"+total+"-"+tscholar+"="+tdue);
				amt=amt+tdue;
				break;
			case M:
				int mtotal=50000;
				System.out.println("Enter the mess Scholarship fee uh have secured:");
				int mscholar=s.nextInt();
				int mdue=mtotal-mscholar;
				System.out.println("The total mess fees to be paid after the scholarsship amount is"+mtotal+"-"+mscholar+"="+mdue);
				amt=amt+mdue;
				break;
			
			}
			}
    			}
			System.out.println("The total amount to be paid after Scholarship section is:"+amt);
			break;
		}
			

			
		System.out.println("Total amount to be paid in order to apply for certificates is:"+amt);
		break;
		}	

	

	}
	}
	
