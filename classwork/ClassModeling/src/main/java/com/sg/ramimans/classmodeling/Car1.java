package com.sg.ramimans.classmodeling;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 2, 2021
 * purpose: a car in a car dealership inventory system
 */
public class Car1 {
    private final String make;
    private final String model;
    private final String trim;
    private final String colour;
    private final int year;
    private final String VIN;
    private float price;
    private boolean isSold;
    
    public Car1 (String make, String model, String trim, String colour, int year, String VIN, float price) {
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.colour = colour;
        this.year = year;
        this.VIN = VIN;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getTrim() {
        return trim;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public String getVIN() {
        return VIN;
    }

    public float getPrice() {
        return price;
    }

    public boolean isIsSold() {
        return isSold;
    }
    
    public void markAsSold() {
        this.isSold = true;
    }
    
    // change the price of a car
    public void setPrice(float newPrice) {
        this.price = newPrice;
    }
    
}
