package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 30, 2021
 * purpose: to make the user feel old
 */

public class YourLifeInMovies {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Hey, let's play a game! What's your name? ");
        String userName = inputScanner.nextLine();
        System.out.println("Ok, " + userName + ", when where you born?");
        int birthYear = inputScanner.nextInt();
        if (birthYear < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        }
        if (birthYear < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago?");
        }
        if (birthYear < 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
        if (birthYear < 1975) {
            System.out.println("The release of the original Jurassic Park movie is closer to the lunar landing"
                    + " then it is to today!");
        }
        if (birthYear < 1965) {
            System.out.println("And the Mash TV series has been around for almost half a century!");
        }
    }
}
