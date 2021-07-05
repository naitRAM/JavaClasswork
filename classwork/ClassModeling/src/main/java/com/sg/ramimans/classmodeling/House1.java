package com.sg.ramimans.classmodeling;

/**
 *
 * @author Rami Mansieh 
 * email: rmansieh@gmail.com data: Jul. 1, 2021 
 * purpose: house object with address info in a GPS mapping system
 */
public class House1 {
    
    // house will always be at a specific location on a map. address can exist, 
    // not exist (development under construction), or mutate (street name changes)
    private final double latitude;
    private final double longitude;
    private String address;
    
    public House1(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public House1(double latitude, double longitude, String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
