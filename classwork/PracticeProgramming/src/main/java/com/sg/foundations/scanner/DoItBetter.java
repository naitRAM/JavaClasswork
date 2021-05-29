package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 29, 2021
 * purpose: one up the user 
 */
public class DoItBetter {
    public static void main(String[] args) {
        Scanner answerScanner = new Scanner(System.in);
        System.out.println("How many miles can you run? ");
        int miles = answerScanner.nextInt();
        int myMiles = miles * 2 + 1;
        answerScanner.nextLine();
        System.out.println("Oh yeah? Well I can run " + myMiles + " miles!");
        System.out.println("How many hotdogs can you eat?");
        int hotdogs = answerScanner.nextInt();
        int myHotdogs = hotdogs * 2 + 1;
        System.out.println("ReallY? I can actually eat " + myHotdogs + ".");
        System.out.println("How many languages do you know ?");
        int languages = answerScanner.nextInt();
        int myLanguages = languages * 2 + 1;
        answerScanner.nextLine();
        System.out.println("Not bad. But i can speak " + myLanguages + " languages, hmph.");
        
    }
}
