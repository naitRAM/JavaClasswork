package com.sg.foundations.flowcontrol.random;
import java.util.Random;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 30, 2021
 * purpose: implement random class in code
 */
public class ALittleChaos {
    public static void main(String[] args) {
        Random randomizer = new Random();
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        // randomizer.nextInt(101) or randomizer.nextInt(51) + 50 yield same results
        int num = randomizer.nextInt(100);
        
        // random numbers can be included in math statements
        // next line prints random double from 50 up to 100 (exclusive)
        // double num2 = randomizer.nextDouble() * (100 - 50) + 50; 
        // int num3 = randomizer.nextInt(6) + 1; // roll the dice
        // long num4 = randomizer.nextLong(); // generate a random long number
        // System.out.println(num2 + " " + num3 + " " + num4);
        
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);
        
        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");
        
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101));
        
    }
}
