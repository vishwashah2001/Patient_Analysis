/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author vishwashah
 */
public class Encounter {
    
    private int encounter_num;
    private int encounter_id;
    private ArrayList<VitalSign> vitalsign_list;

    public int getEncpatientid() {
        return encounter_id;
    }

    public void setEncpatientid(int encpatientid) {
        this.encounter_id = encpatientid;
    }
    
    public Encounter(){
    vitalsign_list = new ArrayList<>();
    }

    public int getEncounterno() {
        return encounter_num;
    }

    public void setEncounterno(int encounterno) {
        this.encounter_num = encounterno;
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalsign_list;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalsign_list = vitalSignList;
    }
    
    public void addVitalSign(VitalSign vitalSign){
    this.vitalsign_list.add(vitalSign);
            }
    
}


