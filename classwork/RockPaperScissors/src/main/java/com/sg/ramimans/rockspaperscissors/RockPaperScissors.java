package com.sg.ramimans.rockspaperscissors;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jun. 9, 2021
 * purpose: user plays 1-10 Rock-Paper-Scissors rounds versus computer
 */
public class RockPaperScissors {
    
    public static void main (String[] args) {
        
        boolean keepPlaying;
        do {
            // playGame() returns true iff user agrees to play again
            keepPlaying = playGame();
        } while (keepPlaying);
    }
    
    // play number of rounds according to user input and keep track of score;
    // print game results; return false if user won't keep playing or round 
    // input is out of range, return true if user wants to play again
    public static boolean playGame() {
        int wins = 0;
        int losses = 0; 
        int ties = 0;
        int roundLimit = readRoundLimit();
        
        if (isValidRoundLimit(roundLimit)) {
            
            for (int round = roundLimit; round > 0; round--) {
                int[] results = playRound(wins, losses, ties);
                wins = results[0];
                losses = results[1];
                ties = results[2];
            }
            
            printGameResult(wins, losses, ties);
            
            if (willPlayAgain()) {
                return true;
            } else {
                printThanks();
                return false;
            }
        }
        
        return false;
    }
    
    // get user play and compare to computer random play, increment one of the
    // parameters based on the play, print the results of round and return 
    // parameters respectively in array
    public static int[] playRound(int userWins, int userLosses, int userTies) {
        String computerPlay = getRandomPlay();
        String userPlay = readUserPlay();
        if ( isUserWinner(userPlay, computerPlay)) {
            userWins++;
        } else if ( isUserLoser(userPlay, computerPlay)) {
            userLosses++;
        } else {
            userTies++;
        }
        printRoundResult(userPlay, computerPlay);
        int[] resultArray = {userWins, userLosses, userTies};
        return resultArray;
    }
    
    // returns "rock", "paper", or "scissors" randomly
    public static String getRandomPlay() {
        String[] choiceArray = {"rock", "paper", "scissors"};
        Random randomChoice = new Random();
        return choiceArray[randomChoice.nextInt(choiceArray.length)];
    }
    
    // helper method to get a user input string
    public static String readUserString(String prompt) {
        Scanner userInput = new Scanner(System.in);
        printMsg(prompt);
        return userInput.nextLine();
    }
    
    // helper method to get a user integer, handles input mismatch
    public static int readUserInt(String prompt) {
        Scanner userInput = new Scanner(System.in);
        boolean badInput = true;
        int userInt = 0;
        
        while (badInput) {
            try {
                printMsg(prompt);
                userInt = userInput.nextInt();
                badInput = false;
                
            } catch (InputMismatchException ex) {
                printMsg("Enter a whole number please. ");
                userInput.nextLine();
            }
        }
        
        return userInt;
    }
    
    // returns a suggested round limit from the user, no range handling
    public static int readRoundLimit() {
        String prompt = "How many rounds would you like to play? (1 - 10)";
        return readUserInt(prompt);
    }
    
    // returns "rock", "paper", "scissors" based on user input (1, 2, or 3)
    // handles range and continues to prompt if out of range
    public static String readUserPlay() {
        String prompt = "Choose 1 for rock, 2 for paper, 3 for scissors:";
        String errorPrompt = "Enter a valid choice. ";
        int userChoice = readUserInt(prompt);
        String choice = "";
        while (userChoice < 1 || userChoice > 3) {
            printMsg(errorPrompt);
            userChoice = readUserInt(prompt);
        }
        switch (userChoice) {
            case 1: 
                choice = "rock";
                break;
            case 2:
                choice = "paper";
                break;
            case 3:
                choice = "scissors";
        }
        return choice;
    }
    
    // System.out.println is ugly
    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
    // compares user choice of rock paper scissors to the computer choice and 
    // prints result to console
    public static void printRoundResult (String userChoice, String compChoice) {
        String tieMsg = "It's a tie!";
        String winMsg = "You won this round!";
        String lossMsg = "Sorry, you lost this round!";
        printMsg("You played " + userChoice);
        printMsg("Computer played " + compChoice);
        if (isUserWinner(userChoice, compChoice)) {
            printMsg(winMsg);
        } else if (isUserLoser(userChoice, compChoice)) {
            printMsg(lossMsg);
        } else {
            printMsg(tieMsg);
        }
    }
    
    // evaluates user losses, wins, and ties to print out the overall game result
    public static void printGameResult(int totalWins, int totalLosses, int totalTies) {
        String winMsg = "Congrats, you are the overall winner!";
        String lossMsg = "Sorry, but you lost the game :(";
        String tieMsg = "You tied this game. Play again to win!";
        
        printMsg("You won: " + totalWins + " rounds");
        printMsg("You lost: " + totalLosses + " rounds");
        printMsg("You tied: " + totalTies + " rounds");
        
        if (totalWins > totalLosses) {
            printMsg(winMsg);
        } else if (totalWins < totalLosses) {
            printMsg(lossMsg);
        } else {
            printMsg(tieMsg);
        }
    }
    
    // end message printed after user plays at least once
    public static void printThanks() {
        String THANKS = "Thanks for playing!";
        printMsg(THANKS);
    }
    
    // returns true if and only if round limit is between 1 - 10 (inclusive)
    public static boolean isValidRoundLimit(int round) {
        return round >= 1 && round <= 10;
    }
    
    // returns true iff user inputs "yes" and false if "no" or anything else.
    // input is not case-sensitive
    public static boolean willPlayAgain() {
        String playAgainPrompt = "That was fun! Play again? (yes/no)";
        String choice = readUserString(playAgainPrompt);
        String lowercaseChoice = choice.toLowerCase();
        if (lowercaseChoice.equals("yes")) {
            return true;
        } else if (lowercaseChoice.equals("no")) {
            return false;
        }
        printMsg("That wasn't valid input!");
        return false;
    }
    
    // returns true if and only if the user is a winner
    public static boolean isUserWinner(String userChoice, String compChoice) {
        if (userChoice.equals("rock") && compChoice.equals("scissors")) {
            return true;
        } else if (userChoice.equals("scissors") && compChoice.equals("paper")) {
            return true;
        } else if (userChoice.equals("paper") && compChoice.equals("rock")) {
            return true;
        }
        return false;
    }
    
    // returns true if and only if the user lost the round
    public static boolean isUserLoser(String userChoice, String compChoice) {
        if (userChoice.equals("rock") && compChoice.equals("paper")) {
            return true;
        } else if (userChoice.equals("scissors") && compChoice.equals("rock")) {
            return true;
        } else if (userChoice.equals("paper") && compChoice.equals("scissors")) {
            return true;
        }
        return false;
    }
    
    
    
}
