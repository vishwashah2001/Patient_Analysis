/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import utility.UtilityFunctions;

/**
 *
 * @author vishwashah
 */
public class Sys {
    private String name;
    private PatientDirectory patDir;
    private PersonDirectory perDir;
  
    private ArrayList<City> cityList;
    
    public Sys(){
    
        patDir = new PatientDirectory(this);
        perDir = new PersonDirectory(this);
       
        cityList = new ArrayList<City>();
        
        createData(this);
        
//         ReadCSV csv = new ReadCSV(history);
//        csv.bulkLoad();
//
//        populateTable();
        
    }

    public City addCity(String cityName) {
        
        City newCity = new City(this,cityName);
        this.cityList.add(newCity);
        return newCity;
    }
    
   

    public PatientDirectory getPatDir() {
        return patDir;
    }

    public PersonDirectory getPerDir() {
        return perDir;
    }
    
    public boolean checkIfCityExists(String cityName){
        
        for(City city:this.getCityList()){
            
            if(city.getCitName().equals(cityName)){
                return true; // City exists
            }
            
        }
        
        return false;
    }
        
     public House findHouseInCity(Person person){
    
        for(City city:this.getCityList()){
            
            if(!city.findHouseInCommunity(person).equals(null)){
                return city.findHouseInCommunity(person);
            }
        
        }
        
        return null;
    }

    
    public void createData(Sys sys){
        
        UtilityFunctions util = new UtilityFunctions();
        
        //Add city
        sys.addCity("Boston");
        sys.getCity("Boston").newCommunity("Mission Main");
        
        sys.addCity("Leeds");
        sys.getCity("Leeds").newCommunity("Ruggles");
        
        
        //Add House
        Community community = sys.getCity("Boston").getCommunityByName("Mission Main");
        House house = community.createHouse(7, "Smith Street", "Mission Main", "Boston");
        
        Community community2 = sys.getCity("Leeds").getCommunityByName("Ruggles");
        House house2 = community.createHouse(8, "Ward Street", "Ruggles", "Leeds");
        
        PatientDirectory pD = sys.getPatDir();
        PersonDirectory perD = sys.getPerDir();
        
        //Create person
        Person per1 = perD.createPerson(1234, "Viraj Shah", util.convertToDate("31-Oct-1996"));
        Person per2 = perD.createPerson(5678, "John Dias", util.convertToDate("20-Dec-1996"));
        Person per3 = perD.createPerson(5678, "Sam Don", util.convertToDate("20-Dec-1996"));
       
        //Add Person to House
        
        house.getFamiliyMembers().add(per1);
        //Create patient
        Patient pat1 = pD.createPatient(per1);
        Patient pat2 = pD.createPatient(per2);
        Patient pat3 = pD.createPatient(per3);
        
        house2.addPersonToHouse(per3);
        
        // Step 1. Get patient
        Patient selectedPatient = pD.searchPatientByName("Viraj Shah");
        
        // Step 2. Create vital signs
        VitalSign vs = new VitalSign(90.0,60.0);
        
        // Step 3. Map vital signs, patient & encounter
        selectedPatient.getEncounterHistory().addEncounter(vs);
         pat3.getEncounterHistory().addEncounter(vs);
    }

    public City getCity(String cityName) {
        for(City city:this.cityList){
            
            if(city.getCitName().equals(cityName))
                    return city;
        }
        
        return null;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }
    
    
    
    
}
