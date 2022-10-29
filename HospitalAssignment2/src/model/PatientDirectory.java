/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author vishwashah
 */
public class PatientDirectory {
    private ArrayList<Patient> patient_list;
    
    public PatientDirectory(){
    patient_list = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patient_list;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patient_list = patientList;
    }
    
    public void addNewPatient(Patient patient){
    patient_list.add(patient);
    }
    
}
