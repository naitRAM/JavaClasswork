package com.sg.ramimans.statecapitals3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 11, 2021
 * purpose: 
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner capitalsData = new Scanner(new BufferedReader(new FileReader("MoreStateCapitals.txt")));
        Scanner userInput = new Scanner(System.in);
        Map<String, Capital> stateToCapitalData = new HashMap<>();
        int numRecords = 0;
        while (capitalsData.hasNextLine()) {
            String record = capitalsData.nextLine();
            String[] recordArray = record.split("::");
            String state = recordArray[0];
            String capital = recordArray[1];
            long population = Long.parseLong(recordArray[2]);
            int squareMileage = Integer.parseInt(recordArray[3]);
            
            Capital capitalObject = new Capital(capital, population, squareMileage);
            stateToCapitalData.put(state, capitalObject);
            numRecords++;
        }
        System.out.println(numRecords + " state capitals were loaded into stateToCapitalData Map");
        Set<String> statesSet = stateToCapitalData.keySet();
        /*
        for (String state : statesSet) {
            Capital capitalObject = stateToCapitalData.get(state);
            System.out.println("The capital of the state of " + state + " is " + capitalObject.getName() +
                    ", it's population is " + capitalObject.getPopulation() + ", and it's area is " +
                    capitalObject.getSquareMileage() + " square miles!");
        }
        */
        System.out.println("Enter a population limit to see states and capitals with greater population counts: ");
        int popLimit = userInput.nextInt();
        //userInput.nextLine();
        for (String state: statesSet) {
            Capital capitalObject = stateToCapitalData.get(state);
            if (capitalObject.getPopulation() > popLimit) {
                String capitalName = capitalObject.getName();
                System.out.println(capitalName + ", " + state + " has a population of " + capitalObject.getPopulation());
            }
        }
        
        System.out.println("Enter a square mileage to see the capitals of states that are smaller in area: ");
        int maxSquareMileage = userInput.nextInt();
        for (String state: statesSet) {
            Capital capitalObject = stateToCapitalData.get(state);
            if (capitalObject.getSquareMileage() < maxSquareMileage) {
                String capitalName = capitalObject.getName();
                System.out.println(capitalName + ", " + state + " has a square mileage of " + capitalObject.getSquareMileage());
            }
        }
        
    }
}
