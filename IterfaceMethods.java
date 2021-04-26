package com.tyss.jdbc.junitapi.JdbcClass1;

import java.util.ArrayList;

public interface IterfaceMethods {

	public void insert(int uid,String uname,String phno);

	public ArrayList<Object> select();

	public void update(int uid,String uname,String phno);

	public void delete(int uid);
}
