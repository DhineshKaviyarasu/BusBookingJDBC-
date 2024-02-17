package com.Bus;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Booking {
    String psgName;
    int busNo;
    Date date;

    Booking() throws ParseException {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter passenger name:");
        psgName=input.next();
        System.out.println("Enter bus no:");
        busNo= input.nextInt();
        System.out.println("Enter date dd-mm-yyyy:");
        String dateInput=input.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        date=dateFormat.parse(dateInput);
    }
    public boolean isAvaliable() throws SQLException{
        int capacity= BusDAO.buscapacity(busNo);
        
        int booked=BookingDAO.getbookingcount(busNo, date);


        return booked<capacity;
    }

}
