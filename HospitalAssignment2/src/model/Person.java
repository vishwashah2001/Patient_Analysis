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
    
    private String name;
    private int age;
    private LocalDate dob;
    private long contactNo;
    private String addr;
    
    //Create a person
    public Person(long contactNo,String name,LocalDate dob){
       
        this.name = name;
        this.contactNo = contactNo;
        this.age = calculateAge(dob);
        this.dob = dob;
        this.addr = "146 Bolyston St., Jamaica Plain, Boston, MA 02130";
    }

    public String getAddr() {
        return addr;
    }

    
    public int calculateAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public long getContactNo() {
        return contactNo;
    }

    public boolean matchByName(String name) {
        
        return this.getName().equals(name);
    }
    
    
}
