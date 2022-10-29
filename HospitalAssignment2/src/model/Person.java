/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author vishwashah
 */
public class Person {
        
    private String fname;
    private String lname;
    private int age;
    private String city;
    private String community;
    private int HouseNo;

    public String getFirstname() {
        return fname;
    }

    public void setFirstname(String firstname) {
        this.fname = firstname;
    }

    public String getLastname() {
        return lname;
    }

    public void setLastname(String lastname) {
        this.lname = lastname;
    }

    public int getPersonage() {
        return age;
    }

    public void setPersonage(int personage) {
        this.age = personage;
    }

    public String getPersoncityname() {
        return city;
    }

    public void setPersoncityname(String personcityname) {
        this.city = personcityname;
    }

    public String getPersoncommunityname() {
        return community;
    }

    public void setPersoncommunityname(String personcommunityname) {
        this.community = personcommunityname;
    }

    public int getPersonhouseno() {
        return HouseNo;
    }

    public void setPersonhouseno(int personhouseno) {
        this.HouseNo = personhouseno;
    }
    
    @Override
    public String toString(){
        return fname;
    }
      
}
