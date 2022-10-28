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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterList;
    
    public EncounterHistory(Patient patient){
        this.encounterList = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }
    
    public Encounter addEncounter(VitalSign vital){
        
        Encounter newEncounter = new Encounter(vital);
        encounterList.add(newEncounter);
        return newEncounter;
    }}
    
