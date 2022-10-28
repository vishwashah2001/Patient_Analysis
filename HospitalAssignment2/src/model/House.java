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
public class House {
    
    private int houseNum;
    private String unitNum;
    private String streetName;
    private String community;
    private String city;
    private long zipcode;
    ArrayList<Person> familiyMembers;
    
    public House(int houseNum,String streetName,
                 String community,String city
                    )
    {
        
        this.houseNum = houseNum;      
        this.streetName = streetName;
        this.community = community;
        this.city = city;      
        this.familiyMembers=new ArrayList<Person>();
        
    }

    public int getHouseNum() {
        return houseNum;
    }

    

    public String getStreetName() {
        return streetName;
    }

    public String getCommunity() {
        return community;
    }

    public String getCity() {
        return city;
    }

   

    public ArrayList<Person> getFamiliyMembers() {
        return familiyMembers;
    }
    
    public void addPersonToHouse(Person member){
        
        this.getFamiliyMembers().add(member);
    
    }
    
}
