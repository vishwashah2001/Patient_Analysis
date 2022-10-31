/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vishwashah
 */
public class PersonArray {
    
    private ArrayList<Person> person;
    
    public PersonArray() {
        this.person= new ArrayList<Person>();
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }
    
    public Person addNewPerson() {
        Person newPerson = new Person();
        person.add(newPerson);
        return newPerson;
    }
    
    public Person addNewPersonEx() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteEmployee(Person p) {
        person.remove(p);
    }
    
    public void setValues() { 
        String filePath = "/Users/vishwashah/Downloads/Assignment2/files/Person.csv";
        try (Scanner sc = new Scanner(new File(filePath))) {
            sc.useDelimiter("[,\n]");
            String[] temp = new String[13];
            
            while (sc.hasNext()) {
                for(int i = 0; i < temp.length; i++) {
                    temp[i] = sc.next();
                }
                Person p = addNewPerson();
                p.setPersonType(temp[0]);
                p.setPersonID(Integer.parseInt(temp[1]));
                p.setPersonName(temp[2]);
                p.setPersonGender(temp[3]);
                p.setPersonAge(Integer.parseInt(temp[4]));
                p.setPersonContact(Long.parseLong(temp[5]));
                p.setPersonEmail(temp[6]);
                p.setCommunity(temp[7]);
                p.setCity(temp[8]);
                p.setHouseNo(Integer.parseInt(temp[9]));
                p.setStreet(temp[10]);
                p.setPass(temp[11]);
                p.setConfPass(temp[12]);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println(person.size());
    }
    
}
    

