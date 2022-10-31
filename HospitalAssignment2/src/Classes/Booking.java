/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author vishwashah
 */
public class Booking {
    String bookname;
    private int hosID;
    private int patientID;
    private int docID;

    public String getBookname() {
        return bookname;
    }

    public void setBook(String book) {
        this.bookname = book;
    }
    
    public int getHosID() {
        return hosID;
    }

    public void setHosID(int hosID) {
        this.hosID = hosID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }
    
    @Override
    public String toString() {
        return bookname;
    }
    
}
