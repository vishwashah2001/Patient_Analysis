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
    private ArrayList<Encounter>encounter_history_list;
    public EncounterHistory(){
        encounter_history_list= new ArrayList<>();
        
    }

    public ArrayList<Encounter> getEncounter_history_list() {
        return encounter_history_list;
    }

    public void setEncounter_history_list(ArrayList<Encounter> encounter_history_list) {
        this.encounter_history_list = encounter_history_list;
    }
    public void addEncounterinList(Encounter encounter){
        encounter_history_list.add(encounter);
    }
}
