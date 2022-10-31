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
public class CommunityArray {
    private ArrayList<Community> community;
    
    public CommunityArray() {
        this.community= new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunity() {
        return community;
    }

    public void setCommunity(ArrayList<Community> community) {
        this.community = community;
    }
    
    public Community addNewCommunity() {
        Community newCommunity = new Community();
        community.add(newCommunity);
        return newCommunity;
    }
    
    public Community addNewCommunityEx() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteEmployee(Community c) {
        community.remove(c);
    }
    
    public void setValues() { 
        String filePath = "/Users/vishwashah/Downloads/Assignment2/files/Community.csv";
        try (Scanner sc = new Scanner(new File(filePath))) {
            sc.useDelimiter("[,\n]");
            String[] temp = new String[3];
            
            while (sc.hasNext()) {
                for(int i = 0; i < temp.length; i++) {
                    temp[i] = sc.next();
                }
                Community c = addNewCommunity();
                c.setCommunityName(temp[0]);
                c.setCommunityID(Integer.parseInt(temp[1]));
                c.setCommunityCity(temp[2]);
            }
            System.out.println(community);
            sc.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(CommunityArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println(community.size());
    }
}

