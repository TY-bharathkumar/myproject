package com.tyss.jdbc.junitapi.JdbcClass1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcClass implements IterfaceMethods {
	Connection con= null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	Statement stmt=null;
	public void insert(int uid, String uname, String phno) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc.mysql://localhost:3306/ems", "root", "root");
			String query="insert into  junit values(?,?,?) ";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, uid);
			pstmt.setString(2, uname);
			pstmt.setString(3, phno);

			pstmt.execute();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Object> select() {
		ArrayList<Object> obj=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root@123");
			String query = "select * from student";
			stmt = con.createStatement();
			rs= stmt.executeQuery(query);
			obj = new ArrayList<Object>();
			while(rs.next())
			{
				int i1= rs.getInt("uid");
				obj.add(i1);
				String s1 = rs.getString("uname");
				obj.add(s1);
				String p=rs.getString("phno");
				obj.add(p);
			}


			con.close();
		} catch (Exception e) {
			e.getMessage();
		}

		return obj;
	}

	public void update(int uid, String uname, String phno) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
			String query="update junit set uname=? set phno=? where uid=?";
			pstmt =con.prepareStatement(query);
			pstmt.setString(1, uname);
			pstmt.setString(2, phno);
			pstmt.setInt(3, uid);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



	public void delete(int uid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root@123");
			String query = "delete from junit where sid=?;";
			PreparedStatement pm = con.prepareStatement(query);
			pm.setInt(1, uid);
			pm.execute();
			con.close();
		} catch (Exception e) {
			e.getMessage();
		}

	}

}





