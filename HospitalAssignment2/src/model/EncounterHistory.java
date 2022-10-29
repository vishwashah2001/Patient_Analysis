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
    
    private ArrayList<Encounter> encounter_history_list;

    public EncounterHistory() {
        encounter_history_list = new ArrayList<>();
    }

    
    public ArrayList<Encounter> getEncounterHistoryList() {
        return encounter_history_list;
    }

    public void setEncounterHistoryList(ArrayList<Encounter> encounterHistoryList) {
        this.encounter_history_list = encounterHistoryList;
    }
    
    public void addEncounterInList(Encounter encounter){
        encounter_history_list.add(encounter);
    }
    
    
}

    
