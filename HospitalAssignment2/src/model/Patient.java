/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vishwashah
 */
 public class Patient {
        
    private int patient_id;
    private String patient_fname;
    private String patient_lname;
    private int patient_age;
    private String patient_community;
    private String patient_city;
    private int patient_house;

    public int getPatientid() {
        return patient_id;
    }

    public void setPatientid(int patientid) {
        this.patient_id = patientid;
    }

    public String getPatientfirstname() {
        return patient_fname;
    }

    public void setPatientfirstname(String patientfirstname) {
        this.patient_fname = patientfirstname;
    }

    public String getPatientlastname() {
        return patient_lname;
    }

    public void setPatientlastname(String patientlastname) {
        this.patient_lname = patientlastname;
    }

    public int getPatientage() {
        return patient_age;
    }

    public void setPatientage(int patientage) {
        this.patient_age = patientage;
    }

    public String getPatientcommunity() {
        return patient_community;
    }

    public void setPatientcommunity(String patientcommunity) {
        this.patient_community = patientcommunity;
    }

    public String getPatientcity() {
        return patient_city;
    }

    public void setPatientcity(String patientcity) {
        this.patient_city = patientcity;
    }

    public int getPatienthouse() {
        return patient_house;
    }

    public void setPatienthouse(int patienthouse) {
        this.patient_house = patienthouse;
    }

    @Override
    public String toString(){
        return String.valueOf(patient_id);
    }
    
    
    
}
