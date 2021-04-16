package com.tyss.jdbc;
import java.io.*;
import java.sql.*;

import java.sql.Statement;
import java.util.Properties;
public class SelectDynamic {
	public static void main(String[] args) throws IOException, SQLException {

			FileReader fr=new FileReader("jdbc.txt");
			Properties info = new Properties( );
			info.load(fr);
			String username=(String) info.get("username");
			String password=(String) info.get("password");
			System.out.println(username+" "+password);
			Connection con=null;
			Statement stt=null;
			try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems",username,password);
			System.out.println(" connection suceffully");
			String crea="insert into ems.employ values(6,'hj',12,56,21)";
			stt=con.createStatement();
			stt.executeUpdate(crea);
			System.out.println("insertion suceffully");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}finally {
			if(con!=null) {
			con.close();
			}
			if(stt!=null) {
			stt.close();
			}
			}



			}

			}


}

