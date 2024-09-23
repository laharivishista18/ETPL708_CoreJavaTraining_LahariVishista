package com.evergent.java.jdbc.book;

import java.sql.*;

public class BookDAO 
{	                         // 100 corejava 250 C
  public int addBook(BookBean book1)
  {
	  Connection con = null;
	  PreparedStatement pstmt = null;
	  try
	  	{
		  con=BookDB.getConnection();  		 		  
		  String ins_str ="insert into book values(?,?,?,?)";
		  pstmt = con.prepareStatement(ins_str);
		  pstmt.setInt(1,book1.getBookId());
		  pstmt.setString(2,book1.getTitle());
		  pstmt.setFloat(3,book1.getPrice());
		  pstmt.setString(4,book1.getGrade());
		  int updateCount = pstmt.executeUpdate();
		  con.close();
		  return updateCount;
	  	}
	  catch(Exception ex)
	  {
		  System.out.println(ex.toString());
		  return 0;
	  }  
  }
  
}
