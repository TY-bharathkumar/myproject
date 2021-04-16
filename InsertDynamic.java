package com.tyss.jdbc;
import java.sql.*;
public class InsertDynamic {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?user=root&password=root");
			String query="insert into employee values(?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, 6);
			pstmt.setString(2, "Mallesh");
			pstmt.setInt(3, 50);
			pstmt.setLong(4, 9658741);
			int count=pstmt.executeUpdate();
			System.out.println("no of rows effected : "+count);
			System.out.println("Insertion is done ");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
