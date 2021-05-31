package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 30, 2021
 * purpose: simple number guessing game using if statements
 */
public class GuessMe {
    public static void main(String[] args) {
        int myNum = 7;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Can you guess the secret number? ");
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
