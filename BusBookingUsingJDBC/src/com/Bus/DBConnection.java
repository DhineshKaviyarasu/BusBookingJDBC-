package com.Bus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String url="jdbc:mysql://localhost:3306/busreserv";
	private static final String user="root";
	private static final String password="Dhinesh@02";
	
	public static Connection getconnection() throws SQLException {
		 return DriverManager.getConnection(url,user,password);
	}
}
