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
public class PersonDirectory {
    private ArrayList<Person>person_list;
    public PersonDirectory(){
        person_list=new ArrayList<>();
        
    }

    public ArrayList<Person> getPerson_list() {
        return person_list;
    }

    public void setPerson_list(ArrayList<Person> person_list) {
        this.person_list = person_list;
    }
    public void addNewPerson(Person person){
        person_list.add(person);
    }
    
}
