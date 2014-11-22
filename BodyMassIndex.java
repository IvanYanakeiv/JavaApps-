/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class BodyMassIndex {

    private double mass;
    private double height;
    

    public BodyMassIndex(double mass, double height) {
        setHeight(height);
        setMass(mass);
    }
    
     public void setMass(double vMass) {
        if (vMass > 0) 
        {
            mass = vMass;
        }
     }    

    public double getMass() {
        return mass;
        
    }
    
    public void setHeight(double vHeight) {
        if (vHeight > 0) 
        {
            height = vHeight;
        }
    } 

    public double getHeight() {
        return height;
    }
    public double calculateBMI(){
        double bmi = mass / (height*height) ;
        return bmi;
        
    }
}