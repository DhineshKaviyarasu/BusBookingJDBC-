package com.Bus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO {
	
	public static void displaybusinfo() throws SQLException {
		
		String query="select * from bus";
		
		Connection con= DBConnection.getconnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus no is : "+rs.getInt(1));
			if(rs.getInt(2)==0) {
				System.out.println("Bus is Without  Ac ");

			}
			else {
				System.out.println("Bus is With Ac");

			}
			System.out.println("Bus Capacity : "+rs.getInt(3));
			
		}
		System.out.println("-----------------------");
	}
	
	public static int buscapacity(int id) throws SQLException {
		String qurey="select capacity from bus where id=id";
		Connection con= DBConnection.getconnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(qurey);
		rs.next();
		
		return rs.getInt(1);
	}

}
