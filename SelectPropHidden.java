package com.tyss.jdbc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SelectPropHidden {

	public static void main(String[] args) throws IOException {
		File  f=new File("C:\\Users\\bharath\\Desktop\jdbc1\jdbcAssinments\Access.txt");
		Properties p=new Properties();
		p.setProperty("username", "root");
		p.setProperty("password", "root");
		p.store(fw, "bharath");

	}

}

