package com.sg.foundations.flowcontrol.methods;
import java.util.Random;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jun. 6, 2021
 * purpose: to demonstrate the use of methods, parameters, and return statements
 */
public class BarelyControlledChaos {
    public static void main(String args[]) {
        
        String color = getColor();
        String animal = getAnimal();
        String colorAgain = getColor();
        int weight = getRandomInt(5, 200);
        int distance = getRandomInt(10, 20);
        int number = getRandomInt(10000, 20000);
        int time = getRandomInt(2, 6);
        
        System.out.println("Once, when I was very small...");
        System.out.println("I was chased by a " + color + ", " + weight + "lb" +
                " miniature " + animal + " for over " + distance + " miles!!");
        System.out.println("I had to hide in a field of over " + number + " " + 
                colorAgain + " poppies for nearly " + time + " hours until it "
                        + "left me alone!");
        System.out.println("\nIt was QUITE the experience, let me tell you!");
        
    }
    
    static String getColor() {
        Random randomChoice = new Random();
        String[] colorArray = new String[5];
        colorArray[0] = "green";
        colorArray[1] = "yellow";
        colorArray[2] = "blue";
        colorArray[3] = "red";
        colorArray[4] = "orange";
        return colorArray[randomChoice.nextInt(5)];
    }
    
    static String getAnimal() {
        // much shorter than getColor, array length dynamic this time
        Random randomChoice = new Random();
        String[] animalArray = {"hippopotamus", "rhinoceros", "elephant", "giraffe", "ostrich"};
        return animalArray[randomChoice.nextInt(animalArray.length)];
    }
    
    static int getRandomInt(int inclusiveMin, int inclusiveMax) {
        Random randomNumber = new Random();
        int num = randomNumber.nextInt(inclusiveMax + 1 - inclusiveMin) + inclusiveMin;
        return num;
    }
}
