package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 29, 2021
 * purpose: print out story using grammar input from user
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("I need a noun: ");
        String noun = inputScanner.nextLine();
        System.out.println("Now an adjective: ");
        String adjective = inputScanner.nextLine();
        System.out.println("Another noun:  ");
        String secondNoun = inputScanner.nextLine();
        System.out.println("And a number: ");
        String number = inputScanner.nextLine();
        System.out.println("Another adjective: ");
        String secondAdjective = inputScanner.nextLine();
        System.out.println("A plural noun: ");
        String pluralNoun = inputScanner.nextLine();
        System.out.println("Another one: ");
        String secondPluralNoun = inputScanner.nextLine();
        System.out.println("One more: ");
        String thirdPluralNoun = inputScanner.nextLine();
        System.out.println("A verb (infinitive form): ");
        String presentVerb = inputScanner.nextLine();
        System.out.println("Same verb (past participle): ");
        String pastVerb = inputScanner.nextLine();
        System.out.println();
        System.out.println("*** NOW LET'S GET MAD (libs) ***");
        String story = String.format("%1$s: the %2$s frontier. These are the voyages of the starship %3$s. "
                + "Its %4$s-year mission: to explore strange %5$s %6$s, to seek out %5$s %7$s and %5$s %8$s,"
                + " to boldly %9$s where no one has %10$s before.", noun, adjective, secondNoun, number, 
                secondAdjective, pluralNoun, secondPluralNoun, thirdPluralNoun, presentVerb, pastVerb);
        System.out.println(story);
        
        
    }
}
