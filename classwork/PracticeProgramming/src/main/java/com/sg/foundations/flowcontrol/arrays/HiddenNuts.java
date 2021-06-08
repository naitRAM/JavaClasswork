package com.sg.foundations.flowcontrol.arrays;
import java.util.Random;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jun. 8, 2021
 * purpose: demonstrate iteration on Arrays
 */
public class HiddenNuts {
    public static void main(String[] args) {
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        
        for (int i=0; i < hidingSpots.length; i++) {
            
            if (hidingSpots[i] != null) {
                if (hidingSpots[i].equals("Nut")) {
                    System.out.println("Found it! It's in spot# " + i);
                }
            }     
        }
        // another way to do it below
        /*
        boolean hasNoNut = true;
        int currentSpot = 0;
        while (hasNoNut) {
            if (hidingSpots[currentSpot] != null) {
                if (hidingSpots[currentSpot].equals("Nut")) {
                    System.out.println("Found it! It's in spot# " + currentSpot);
                    hasNoNut = false; 
                }
            }
            currentSpot++; 
        }
        */
    }
}
