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
public class PersonDirectory {
    
    ArrayList<Person> personList;
    Sys syst;
    
    public PersonDirectory(Sys syst){
        
        personList = new ArrayList<Person>();
        this.syst = syst;
        
    }
    
    public Person createPerson(long contactNo,String name,LocalDate dob){
        
        //Create person
        Person newPerson = new Person(contactNo,name,dob);
        
        //Add created person to a list
        personList.add(newPerson);
        
        return newPerson;
        
    }
    
}
