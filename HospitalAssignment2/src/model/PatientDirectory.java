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
public class PatientDirectory {
    private ArrayList<Patient>patient_list;
    public PatientDirectory(){
        patient_list= new ArrayList<>();
        
    }

    public ArrayList<Patient> getPatient_list() {
        return patient_list;
    }

    public void setPatient_list(ArrayList<Patient> patient_list) {
        this.patient_list = patient_list;
    }
    public void addNewPatient(Patient patient){
        patient_list.add(patient);
    }
    
    
}
