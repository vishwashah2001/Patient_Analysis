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
public class Encounter {
    private int encounter_num;
    private int encounter_id;
    private ArrayList<VitalSign>vitalsign_list;

    public int getEncounter_num() {
        return encounter_num;
    }

    public void setEncounter_num(int encounter_num) {
        this.encounter_num = encounter_num;
    }

    public int getEncounter_id() {
        return encounter_id;
    }

    public void setEncounter_id(int encounter_id) {
        this.encounter_id = encounter_id;
    }

    public ArrayList<VitalSign> getVitalsign_list() {
        return vitalsign_list;
    }

    public void setVitalsign_list(ArrayList<VitalSign> vitalsign_list) {
        this.vitalsign_list = vitalsign_list;
    }
    public void addVitalSign(VitalSign vitalSign){
        this.vitalsign_list.add(vitalSign);
    }
    
}
