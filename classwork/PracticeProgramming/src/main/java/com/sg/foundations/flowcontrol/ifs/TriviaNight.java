package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 30, 2021
 * purpose: ask the user some trivia and keep score
 */
public class TriviaNight {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int totalQuestions = 3;
        int questionsLeft = totalQuestions;
        int userScore = 0;
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println();
        System.out.println("FIRST QUESTION! \nWhat is the lowest level"
        + " programming language?");
        System.out.println("1) Source Code" + "     " + "2) Assembly Language");
        System.out.println("3) C#" + "            " + "4) Machine Code");
        int answer1 = inputScanner.nextInt();
        questionsLeft--;
        System.out.println("\nYour Answer: " + answer1);
        if (answer1 == 4) {
            System.out.println("Correct!");
            userScore++;
        } else {
            System.out.println("Sorry, that was incorrect.");
        }
        System.out.println(questionsLeft + " questions remaining. Your score: "
                + userScore + " / " + totalQuestions );
        System.out.println("\nSecond Question\nWebsite security CAPTCHA forms are "
                + "descended from the work of?");
        System.out.println("1) Grace Hopper" + "        " + "2) Alan Turing");
        System.out.println("3) Charles Babbage" + "     " + "4} Larry Page");
        int answer2 = inputScanner.nextInt();
        questionsLeft--;
        System.out.println("\nYour Answer: " + answer2);
        if ( answer2 == 2) {
            System.out.println("Nice!");
            userScore++;
        } else {
            System.out.println("Oops, that was wrong.");
        }
        System.out.println(questionsLeft + " questions remaining. Your score: "
                + userScore + " / " + totalQuestions );
        System.out.println("\nLast Question!\nWhich of these sci-fi ships was once "
                + "slated for a full-size replica in Las Vegas?");
        System.out.println("1) Serenity" + "     " + "The Battlestar Galactica");
        System.out.println("3) The USS Enterprise" + "               " + 
                "4} The Millenium Falcon");
        int answer3 = inputScanner.nextInt();
        questionsLeft--;
        System.out.println("\nYour Answer: " + answer3);
        if ( answer3 == 3) {
            System.out.println("Right answer!");
            userScore++;
        } else {
            System.out.println("Incorrect.");
        }
        System.out.println(questionsLeft + " questions remaining. Your score: "
                + userScore + " / " + totalQuestions );
        System.out.println();
        if (userScore == 3) {
            System.out.println("Nice Job! - you got " + userScore + " / " +
                totalQuestions);
        } else if (userScore == 2) {
            System.out.println("Not bad! You got " + userScore + " / " + 
                totalQuestions);
        } else if (userScore == 1) {
            System.out.println("Oh no! You only got " + userScore + " / " + 
                totalQuestions);
        } else {
            System.out.println("That was miserable. You got " + userScore + " / "
            + totalQuestions);
        }
    }
}
