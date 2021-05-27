package com.sg.foundations.variables;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 27, 2021
 * purpose: 
 */
public class InABucket {
    public static void main(String[] args) {
        
        // You can declare all KINDS of variables.
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;
        
        // But declaring them just sets up the space for data
        // to use the variable, you have to put data IN it first!
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPig = 82.65f;
        grainsOfSand = 2147000000;
        
        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies: ");
        System.out.println(piesEaten);
        System.out.println("See this massive Teacup Pig?");
        System.out.print("It weighs " + weightOfTeacupPig + " kilograms, "); 
        System.out.println("and can hold 65 liters of sand!");
        System.out.print("That's more than " + grainsOfSand + " grains!");
    }
}
