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
    
    ArrayList<Patient> patientList;
    Sys syst;
    
    public PatientDirectory(Sys syst){
        
        patientList = new ArrayList<Patient>();
        this.syst = syst;
        
    }
    
    
     public Patient getPatientById(int id){
        
       for(Patient p: patientList){
            
            if(p.matchById(id)){
                return p;
            }
            
            //Patient not found
            
        }
        return null;
        
    }
    
    public Patient createPatient(Person person){
        
        //Create person
        Patient newPatient = new Patient(person);
        
        //Add created person to a list
        patientList.add(newPatient);
        
        return newPatient;
        
    }
    
    public Patient searchPatientByName(String name){
        
        for(Patient p: patientList){
            
            if(p.matchByName(name)){
                return p;
            }
            
            //Patient not found
            
        }
        return null;
    }
    
    public void getPatientLatestEncounter(Patient pat){
    
        ArrayList<Encounter> eccList = pat.getEncounterHistory().getEncounterList();
        int len = eccList.size();
        
        
        Encounter lastestEncounter = eccList.get(len-1);
        
        System.out.println("BP_LOW: "+lastestEncounter.getVital().getBloodPressure_LOW());
        
        
    }
     public Patient getPatientFromEncounter(Encounter encounter){
        
        for(Patient pat:this.getPatientList()){
            
            if(pat.getEncounterHistory().getEncounterList().contains(encounter))
                return pat;
        
        }
        
        return null;
    }
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    
}