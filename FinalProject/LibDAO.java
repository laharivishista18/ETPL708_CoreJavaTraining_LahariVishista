package com.evergent.corejava.FinalProject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LibDAO {
		    public int addBook(Book book) {
		        Connection con = null;
		        PreparedStatement pstmt = null;
		        try {
		            con = LibDBConnection.getConnection();
		            String sql = "INSERT INTO library_books (bookId, title, author, isAvailable) VALUES (?, ?, ?, ?)";
		            pstmt = con.prepareStatement(sql);
		            pstmt.setInt(1, book.getBookId());
		            pstmt.setString(2, book.getTitle());
		            pstmt.setString(3, book.getAuthor());
		            pstmt.setBoolean(4, book.isAvailable());
		            int updateCount = pstmt.executeUpdate();
		            con.close();
		            return updateCount;
		        } catch (Exception ex) {
		            System.out.println(ex.toString());
		            return 0;
		        }
		    }

		    public Book getBook(int bookId) {
		        Connection con = null;
		        PreparedStatement pstmt = null;
		        try {
		            con = LibDBConnection.getConnection();
		            String sql = "SELECT * FROM library_books WHERE bookId=?";
		            pstmt = con.prepareStatement(sql);
		            pstmt.setInt(1, bookId);
		            ResultSet rs = pstmt.executeQuery();
		            Book book = new Book();
		            if (rs.next()) {
		                book.setBookId(rs.getInt("bookId"));
		                book.setTitle(rs.getString("title"));
		                book.setAuthor(rs.getString("author"));
		                book.setAvailable(rs.getBoolean("isAvailable"));
		            }
		            con.close();
		            return book;
		        } catch (Exception ex) {
		            System.out.println(ex.toString());
		            return null;
		        }
		    }

		    public int updateBookAvailability(int bookId, boolean isAvailable) {
		        Connection con = null;
		        PreparedStatement pstmt = null;
		        try {
		            con = LibDBConnection.getConnection();
		            String sql = "UPDATE library_books SET isAvailable=? WHERE bookId=?";
		            pstmt = con.prepareStatement(sql);
		            pstmt.setBoolean(1, isAvailable);
		            pstmt.setInt(2, bookId);
		            int updateCount = pstmt.executeUpdate();
		            con.close();
		            return updateCount;
		        } catch (Exception ex) {
		            System.out.println(ex.toString());
		            return 0;
		        }
		    }
		}

