package com.sg.ramimans.classmodeling;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 2, 2021
 * purpose: Abstracting an airplane in a flight simulator
 */
public class Airplane2 {
    
    // every airplane in a flight simulator has an immutable make and model
    private final String make;
    private final String model;
    
    // make and model of an airplane added to a flight sim collection are already defined 
    public Airplane2(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
 
    public void displayControls() {
        
    }
    
    public void increaseThrottle() {
        
    }
    
    public void setAutopilot() {
        
    }
}
