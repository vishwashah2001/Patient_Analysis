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
    
    VitalSign vital;
    private LocalDate lastVisitDate;
    private long id;
    static long count = 0;
    
    public Encounter(){
        count = count + 1;
        this.id = count;
    }

    public long getId() {
        return id;
    }
    
    public VitalSign getVital() {
        return vital;
    }

    public LocalDate getLastVisitDate() {
        return lastVisitDate;
    }
    
    public Encounter(VitalSign vital){
        
        this.lastVisitDate = LocalDate.now();
        this.vital = vital;
         count = count + 1;
        this.id = count;    

    }
    
   // @Override
    //public String toString(){
      //  UtilityFunctions util = new UtilityFunctions();
        //return util.covertDateToString(this.getLastVisitDate());
    //}
    
}

