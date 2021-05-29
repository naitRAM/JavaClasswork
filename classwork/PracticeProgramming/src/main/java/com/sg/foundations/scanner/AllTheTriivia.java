package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 29, 2021
 * purpose: ask trivia then troll user
 */
public class AllTheTriivia {
    public static void main(String[] args) {
        
        Scanner answerScanner = new Scanner(System.in);
        
        // ask trivia questions, store answers
        System.out.println("What is the fastest land mammal?");
        String answer1 = answerScanner.nextLine();
        System.out.println("What is the longest river in the world? ");
        String answer2 = answerScanner.nextLine();
        System.out.println("How many ribs are there in a human body? ");
        String answer3 = answerScanner.nextLine();
        System.out.println("What is absolute zero in degrees Celsius? ");
        String answer4 = answerScanner.nextLine();
        
        // reply with mixed up answers
        System.out.println("No way! I didn't know that the " + answer2 + " is the fastest land mammal!");
        System.out.println("Isn't it amazing that the " + answer1 + " is the longest river?");
        System.out.println("I'm not sure if it's possible to have " + answer4 + " ribs.");
        System.out.println("Absolute zero is apparently " + answer3 + " degress Celsius, hmmmm.");
        
    }
}
