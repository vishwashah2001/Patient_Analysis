/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vishwashah
 */
public class VitalSign {
    
    private double bloodPressure_LOW;
    private double bloodPressure_HIGH;
    
    
    public VitalSign(double bloodPressure_LOW,double bloodPressure_HIGH){
       
        this.bloodPressure_LOW = bloodPressure_LOW;
        this.bloodPressure_HIGH = bloodPressure_HIGH;
    }

    public double getBloodPressure_LOW() {
        return bloodPressure_LOW;
    }
    
    public double getBloodPressure_HIGH() {
        return bloodPressure_HIGH;
    }
     public void setBloodPressure_HIGH(double bloodPressure_HIGH) {
        this.bloodPressure_HIGH = bloodPressure_HIGH;
    }
     
     public void setBloodPressure_LOW(double bloodPressure_LOW) {
        this.bloodPressure_LOW = bloodPressure_LOW;
    }}

