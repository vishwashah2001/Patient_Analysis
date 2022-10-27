/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
//mix from both 

/**
 *
 * @author vishwashah
 */
public class Community {
    private ArrayList<House> houseList;
    private String commName;
    public void setCommName(String commName) {
        
        this.commName = commName;
        
    }
    public Community (String commName){
     this.houseList = new ArrayList<>();
     this.commName = commName;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }
    public House findPersonInCommunity(Person person ){
        for (Iterator<House> it = this.getHouseList().iterator(); it.hasNext();) {
            House house = it.next();
            if(house.getFamiliyMembers.contains(person))
                return house;
        }
        return null;
    }
    public House createHouse(int houseNum, String streetName,String community,String city)
    {House newHouse = new House(houseNum, streetName, community, city);
    this.getHouseList().add(newHouse);
    return newHouse;
    }
      @Override
    public String toString(){
        return this.getCommName();
    }


    public String getCommName() {
        return commName;
    }

   
    
   
    
    
}
