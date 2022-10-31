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
public class HospitalArray {
    
    private ArrayList<Hospital> hospital;
    
    public HospitalArray() {
        this.hospital= new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        this.hospital = hospital;
    }
    
    public Hospital addNewHospital() {
        Hospital newHospital = new Hospital();
        hospital.add(newHospital);
        return newHospital;
    }
    
    public Hospital addNewHospitalEx() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteEmployee(Hospital h) {
        hospital.remove(h);
    }
    
    public void setValues() { 
        String filePath = "/Users/vishwashah/Downloads/Assignment2/files/Hospital.csv";
        try (Scanner sc = new Scanner(new File(filePath))) {
            sc.useDelimiter("[,\n]");
            String[] temp = new String[4];
            
            while (sc.hasNext()) {
                for(int i = 0; i < temp.length; i++) {
                    temp[i] = sc.next();
                }
                Hospital h = addNewHospital();
                h.setHospitalName(temp[0]);
                h.setHosID(Integer.parseInt(temp[1]));
                
                h.setHospitalCommunity(temp[2]);
                h.setHospitalCity(temp[3]);
            }
            System.out.println(hospital);
            sc.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println(hospital.size());
    }
}
