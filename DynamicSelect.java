package com.tyss.jdbc;
import java.sql.*;
public class DynamicSelect {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
			String query="delete  from employee where e_id=?" ;
			stmt=con.prepareStatement(query);
			stmt.setInt(1, 2);
			int count =stmt.executeUpdate();
			System.out.println("no of rows affeceted "+count);
			System.out.println("delete is sussesful");

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}
}
