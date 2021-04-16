package com.tyss.jdbc;

import java.sql.*;

public class UpdateJdbc {
public static void main(String[] args) {
	Connection con=null;
	Statement stmt=null;
	//load the driver
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver has been created");
		//get the connection via driver
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?user=root&password=root");
		//issue sequel query via connection
		String query="update Employee set ename='Rahul' where e_id=5";
		stmt=con.createStatement();
		int count=stmt.executeUpdate(query);
		System.out.println("count is : "+count);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		//close the all jdbc objects
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(stmt!=null)
			
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
}
