/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author vishwashah
 */
public class Community {
    private String communityName;
    private int communityID;
    private String communityCity;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public int getCommunityID() {
        return communityID;
    }

    public void setCommunityID(int communityID) {
        this.communityID = communityID;
    }

    public String getCommunityCity() {
        return communityCity;
    }

    public void setCommunityCity(String communityCity) {
        this.communityCity = communityCity;
    }

  
    
    @Override
    public String toString() {
        return communityName;
    }
    
}
