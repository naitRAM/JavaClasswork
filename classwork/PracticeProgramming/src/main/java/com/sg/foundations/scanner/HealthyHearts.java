package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 29, 2021
 * purpose: calculate and print out user's max heart rate and target zone
 */
public class HealthyHearts {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = inputScanner.nextInt();
        // inputScanner.nextLine();
        int maxHR = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        int targetZoneMin = Math.round(maxHR * 50.0f / 100);
        int targetZoneMax = Math.round(maxHR * 85.0f / 100);
        System.out.println("Your target HR Zone is " + targetZoneMin + " - " + targetZoneMax + " beats per minute.");
    }
}
