/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vishwashah
 */
public class BookingArray {
    private ArrayList<Booking> booking;
    
    public BookingArray() {
        this.booking= new ArrayList<Booking>();
    }

    public ArrayList<Booking> getBooking() {
        return booking;
    }

    public void setBooking(ArrayList<Booking> booking) {
        this.booking = booking;
    }
    
    public Booking addNewBooking() {
        Booking newBooking = new Booking();
        booking.add(newBooking);
        return newBooking;
    }
    
    public Booking addNewBookingEx() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteEmployee(Booking b) {
        booking.remove(b);
    }
    public void setValues() { 
        String filePath = "/Users/vishwashah/Downloads/Assignment2/files/Booking.csv";
        try (Scanner sc = new Scanner(new File(filePath))) {
            sc.useDelimiter("[,\n]");
            String[] temp = new String[4];
            
            while (sc.hasNext()) {
                for(int i = 0; i < temp.length; i++) {
                    temp[i] = sc.next();
                }
                Booking b = addNewBooking();
                b.setPatientID(Integer.parseInt(temp[1]));
                b.setDocID(Integer.parseInt(temp[2]));
                //b.setHosId(Integer.parseInt(temp[3]));
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println(booking.size());
    }
}
