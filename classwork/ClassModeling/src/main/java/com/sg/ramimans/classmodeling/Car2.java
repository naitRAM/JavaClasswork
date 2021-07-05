package com.sg.ramimans.classmodeling;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 2, 2021
 * purpose: Abstracting a car object stored in a video game
 */
public class Car2 {
    
    // a car selected in a game will have specific make and model always
    private final String make;
    private final String model;
    // we can change the color and other features before playing with color
    private String color;
    
    // every car in a video game will have a make and model at the very least
    public Car2 (String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void addDecal() {
        
    }
    
    
}

