package com.sg.foundations.flowcontrol.random;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 30, 2021
 * purpose: 
 */
public class GuessMeMore {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int myNum = randomizer.nextInt(201) - 100;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Can you guess the number between -100 and 100? ");
        int userNum = inputScanner.nextInt();
        System.out.println("Your guess: " + userNum);
        
        if (myNum == userNum) {
            System.out.println("Wow, nice guess! That was it!");
        }
        if (userNum < myNum) {
            System.out.println("Ha, nice try - too low! I chose " + myNum + ".");
        }
        if (userNum > myNum) {
            System.out.println("Too bad, way too high. I chose " + myNum + ".");
        }
    }
}
