package com.sg.ramimans.classmodeling;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 1, 2021
 * purpose: 
 */
public class Airplane1 {
    private final String airplaneID;
    private double locationX;
    private double locationY;
    private float elevation;
    private float velocity;
    private int bearing;
    
    public Airplane1 (String airplaneID) {
        this.airplaneID = airplaneID;
        // this.setPlaneData(this.airplaneID);
    }

    public String getAirplaneID() {
        return airplaneID;
    }

    public double getLocationX() {
        return locationX;
    }

    public double getLocationY() {
        return locationY;
    }

    public float getElevation() {
        return elevation;
    }

    public float getVelocity() {
        return velocity;
    }

    public int getBearing() {
        return bearing;
    }
    /*

    private void setLocationX(String airplaneID) {
        this.locationX = calculateLocationX(airplaneID);
    }

    private void setLocationY(String airplaneID) {
        this.locationY = calculateLocationY(airplaneID);
    }

    private void setElevation(String airplaneID) {
        this.elevation = calculateElevation(airplaneID);
    }

    private void setVelocity(String airplaneID) {
        this.velocity = calculateVelocity(airplaneID);
    }

    private void setBearing(String airplaneID) {
        this.bearing = calculateBearing(airplaneID);
    }
    
    private void setPlaneData(String airplaneID) {
        calculateLocationX(airplaneID);
        calculateLocationY(airplaneID);
        calculateElevation(airplaneID);
        calculateVelocity(airplaneID);
        calculateBearing(airplaneID);
    }
    
    
    */
    
    
    
    
}
