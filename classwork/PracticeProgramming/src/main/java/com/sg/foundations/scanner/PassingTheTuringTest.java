package com.sg.foundations.scanner;

import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 28, 2021
 * purpose: to pass the Turing test
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        Scanner turingScanner = new Scanner(System.in);
        System.out.println("Hello friend!");
        System.out.println("What's your name?");
        String userName = turingScanner.nextLine();
        System.out.println("Hello " + userName + "! My name is Rami");
        System.out.println("Just wondering, what's your favourite colour?");
        String userColour = turingScanner.nextLine();
        System.out.println(userColour + " is nice! Mine is green!");
        System.out.println("They say that humans are best at distinguishing different shades of green.");
        System.out.println("My favorite fruit, Kiwi, is also green! What's your favourite fruit?");
        String userFruit = turingScanner.nextLine();
        System.out.println(userFruit + " is delicious! You have good taste " + userName + "!");
        System.out.println("What about your favourite number?");
        String stringUserNumber = turingScanner.nextLine();
        int userNumber = Integer.parseInt(stringUserNumber);
        System.out.println(userNumber + " is interesting! Mine is 4");
        float over4 = userNumber / 4f;
        System.out.print("Did you know that " + userNumber + " divided by 4 is: ");
        System.out.println(String.format("%.5f", over4));
        System.out.println("Anyways, it was nice talking to you " + userName + "!");
        
    }
}
