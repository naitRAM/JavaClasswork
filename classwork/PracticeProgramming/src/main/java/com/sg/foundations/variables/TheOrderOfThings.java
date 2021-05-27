package com.sg.foundations.variables;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 27, 2021
 * purpose: 
 */
public class TheOrderOfThings {
    public static void main(String[] args) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;
        
        number = 5.0;
        opinion = "Awesome";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";
        
        noun = "dragons";
        
        // Using the + strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
        + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
    }
}
