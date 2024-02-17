package com.Bus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingDAO {

	public static int getbookingcount(int busNo, Date date) throws SQLException {
        String query="select count(psgName) from booking where bus_no=? and travel_date=?";
		
		Connection con= DBConnection.getconnection();
		PreparedStatement pst=con.prepareStatement(query);
		
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		
		pst.setInt(1, busNo);
		pst.setDate(2, sqldate);
		
		ResultSet rs=pst.executeQuery();
		
		rs.next();
		
		return rs.getInt(1); 
		
	}

	public static void addBooking(Booking booking) throws SQLException {
		 
		
		String qurey="Insert into booking values(?,?,?)";
		
		Connection con=DBConnection.getconnection();
		
		PreparedStatement pst=con.prepareStatement(qurey);
		
		java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());

		pst.setString(1, booking.psgName);
		
		pst.setInt(2, booking.busNo);
		
		pst.setDate(3, sqldate);
		

		pst.executeUpdate();
		
		
	}

	
}
