package com.sg.ramimans.statecapitals2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 11, 2021
 * purpose: 
 */
public class StateCapitals2 {
    public static void main (String[] args) throws Exception  {
        Scanner userInput = new Scanner(System.in);
        Scanner statesFile = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
        
        Random randInt = new Random();
        Map<String, String> statesToCapitals = new HashMap<>();
        String record;
        String[] recordArray;
        List<String> statesList = new ArrayList<>();
        while (statesFile.hasNextLine()) {
            record = statesFile.nextLine();
            recordArray = record.split("::");
            statesToCapitals.put(recordArray[0], recordArray[1]);
            statesList.add(recordArray[0]);
        }
        statesFile.close();
        System.out.println("There are " + statesToCapitals.size() + " states in the USA");
        System.out.println("How many U.S. state capitals would you like to guess? (1 - 50)");
        int totalPlays = userInput.nextInt();
        userInput.nextLine(); // to avoid reading newline character instead of user input later
        int score = 0;
        
        for (int i=0; i < totalPlays; i++) {
            int randomIndex = randInt.nextInt(statesList.size());
            String stateToGuess = statesList.remove(randomIndex);
            System.out.println("What is the capital of " + stateToGuess + "?" );
            String userAnswer = userInput.nextLine();
            String correctAnswer = statesToCapitals.get(stateToGuess);
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The capitial of " + stateToGuess + " is " + correctAnswer);
            }
            
        }
        System.out.println("Out of " + totalPlays + " plays, you guessed the capitals of " + score + " state(s)");
        
    }
}
