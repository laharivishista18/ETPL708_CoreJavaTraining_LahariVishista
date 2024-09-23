package com.evergent.corejava.FinalProject;

public class LibService {
		    LibDAO libraryDAO = new LibDAO();

		    public int addBook(int bookId, String title, String author, boolean isAvailable) {
		        Book book = new Book();
		        book.setBookId(bookId);
		        book.setTitle(title);
		        book.setAuthor(author);
		        book.setAvailable(isAvailable);
		        return libraryDAO.addBook(book);
		    }

		    public Book getBook(int bookId) {
		        return libraryDAO.getBook(bookId);
		    }

		    public int updateBookAvailability(int bookId, boolean isAvailable) {
		        return libraryDAO.updateBookAvailability(bookId, isAvailable);
		    }
		}


