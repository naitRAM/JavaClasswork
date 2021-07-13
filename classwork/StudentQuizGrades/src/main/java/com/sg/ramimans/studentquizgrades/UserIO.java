package com.sg.ramimans.studentquizgrades;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 9, 2021
 * purpose: 
 */
public interface UserIO {
    
    void print(String message);
    
    String readString(String prompt);
    
    int readInt(String prompt);
    
    int readInt(String prompt, int min, int max);
    
    double readDouble(String prompt);
    
    double readDouble(String prompt, double min, double max);
    
    float readFloat(String prompt);
    
    float readFloat(String prompt, float min, float max);
    
    long readLong(String prompt);
    
    long readLong(String prompt, long min, long max);
}
