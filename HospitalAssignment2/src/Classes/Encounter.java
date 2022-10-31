/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author vishwashah
 */
public class Encounter {
     private String date;
    private int patientID;
    private int docID;
    private int hosID;
    private int bloodPres;
    private int heartRate;
    private int respiRate;
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public int getHosID() {
        return hosID;
    }

    public void setHosID(int hosID) {
        this.hosID = hosID;
    }

    public int getBloodPres() {
        return bloodPres;
    }

    public void setBloodPres(int bloodRate) {
        this.bloodPres = bloodRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getRespiRate() {
        return respiRate;
    }

    public void setRespiRate(int respiRate) {
        this.respiRate = respiRate;
    }
    
    @Override
    public String toString() {
        return date;
    }
    
    
}
