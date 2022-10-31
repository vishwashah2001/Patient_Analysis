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
public class EncounterArray {
    private ArrayList<Encounter> encounter;
    
    public EncounterArray() {
        this.encounter= new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<Encounter> encounter) {
        this.encounter = encounter;
    }
    
    public Encounter addNewEncounter() {
        Encounter newEncounter = new Encounter();
        encounter.add(newEncounter);
        return newEncounter;
    }
    
    public Encounter addNewEncounterEx() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteEmployee(Encounter e) {
        encounter.remove(e);
    }
    
    public void setValues() { 
        String filePath = "/Users/vishwashah/Downloads/Assignment2/files/Encounter.csv";
        try (Scanner sc = new Scanner(new File(filePath))) {
            sc.useDelimiter("[,\n]");
            String[] temp = new String[7];
            
            while (sc.hasNext()) {
                for(int i = 0; i < temp.length; i++) {
                    temp[i] = sc.next();
                }
                Encounter e = addNewEncounter();
                e.setDate(temp[0]);
                //System.out.println("0 " + temp[0]);
                e.setPatientID(Integer.parseInt(temp[1]));
                e.setDocID(Integer.parseInt(temp[2]));
                e.setHosID(Integer.parseInt(temp[3]));
                e.setBloodPres(Integer.parseInt(temp[4]));
                //System.out.println("5 " + temp[5]);
                e.setHeartRate(Integer.parseInt(temp[5]));
                //System.out.println("6 " + temp[6]);
                int force = 20;
                e.setRespiRate(force);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(EncounterArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println(encounter.size());
    }
}


