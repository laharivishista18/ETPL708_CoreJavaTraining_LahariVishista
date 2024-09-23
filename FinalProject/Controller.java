package com.evergent.corejava.FinalProject;
import java.util.Scanner;
public class Controller {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        LibService libraryService = new LibService();
		        int choice;
		        do {
		            System.out.println("1. Add a New Book");
		            System.out.println("2. Get Book Details");
		            System.out.println("3. Update Book Availability");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter Book ID: ");
		                    int bookId = scanner.nextInt();
		                    scanner.nextLine();  // Consume newline
		                    System.out.print("Enter Book Title: ");
		                    String title = scanner.nextLine();
		                    System.out.print("Enter Book Author: ");
		                    String author = scanner.nextLine();
		                    System.out.print("Is the book available (true/false)? ");
		                    boolean isAvailable = scanner.nextBoolean();
		                    int result = libraryService.addBook(bookId, title, author, isAvailable);
		                    if (result > 0) {
		                        System.out.println("Book added successfully.");
		                    } else {
		                        System.out.println("Failed to add book.");
		                    }
		                    break;

		                case 2:
		                    System.out.print("Enter Book ID: ");
		                    bookId = scanner.nextInt();
		                    Book book = libraryService.getBook(bookId);
		                    if (book != null) {
		                        System.out.println("Book ID: " + book.getBookId());
		                        System.out.println("Title: " + book.getTitle());
		                        System.out.println("Author: " + book.getAuthor());
		                        System.out.println("Availability: " + (book.isAvailable() ? "Available" : "Not Available"));
		                    } else {
		                        System.out.println("Book not found.");
		                    }
		                    break;

		                case 3:
		                    System.out.print("Enter Book ID: ");
		                    bookId = scanner.nextInt();
		                    System.out.print("Is the book available (true/false)? ");
		                    isAvailable = scanner.nextBoolean();
		                    result = libraryService.updateBookAvailability(bookId, isAvailable);
		                    if (result > 0) {
		                        System.out.println("Book availability updated successfully.");
		                    } else {
		                        System.out.println("Failed to update book availability.");
		                    }
		                    break;

		                case 4:
		                    System.out.println("Exiting...");
		                    break;

		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice != 4);
		        scanner.close();
		    }
		}


