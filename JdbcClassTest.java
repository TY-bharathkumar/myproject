package com.tyss.jdbc.junitapi.JdbcClass1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class JdbcClassTest extends TestCase {
	@Test
	public void testInsert() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root@123");
	    JdbcClass jc = new JdbcClass();
	    jc.insert(1, "Bk","9618373829" );
//	     assertEquals(1, i);
	    String query = "select * from student";
	    Statement stmt = con.createStatement();
	   ResultSet rs= stmt.executeQuery(query);
	   assertEquals(1,rs.getInt(1));
	   assertEquals("Bk",rs.getString(2));
	   assertEquals("9618373829",rs.getString(3));
	   con.close();
	   
	} catch (Exception e) {
	e.getMessage();
	}
	}
	@Test
	public void testUpdate() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root@123");
	    JdbcClass jc = new JdbcClass();
	    jc.update(1, "kumar", "69584847");
//	    assertEquals(1, i);
	    String query = "select * from junit";
	    Statement stmt = con.createStatement();
	   ResultSet rs= stmt.executeQuery(query);
	   assertEquals("kumar", rs.getString(2));
	 
	   con.close();
	} catch (Exception e) {
	e.getMessage();
	}

	}

//	@Test
//	public void testSelect() {
//	JdbcClass jc = new JdbcClass();
//	ArrayList<Object> obj=jc.select();
//	assertEquals(obj!=null, true);
//	}



	@Test
	public void testDelete() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root@123");
	    JdbcClass jc = new JdbcClass();
	    jc.delete(1);
//	     assertEquals(1, i);
	    String query = "select * from junit";
	    Statement stmt = con.createStatement();
	   ResultSet rs= stmt.executeQuery(query);
	   assertEquals(rs.next(), false);
	   con.close();
	} catch (Exception e) {
	e.getMessage();
	}
	}
}
