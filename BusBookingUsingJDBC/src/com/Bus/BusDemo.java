package com.Bus;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args)throws SQLException, ParseException {
    	
    	BusDAO.displaybusinfo();
//        
        int useroption = 1;
        Scanner input=new Scanner(System.in);
        
        while (useroption==1) {
            System.out.println("Enter 1 to Book or 2 to exit:");
            useroption=input.nextInt();
            if (useroption==1){
                Booking booking=new Booking();
                if(booking.isAvaliable()){
                    BookingDAO.addBooking(booking);
                    System.out.println("Your booking is conformed.");
                }else {
                    System.out.println("Selected bus is full in that date.pls try another bus or date");
                }
            }
        }
    	
    	
    }
}
