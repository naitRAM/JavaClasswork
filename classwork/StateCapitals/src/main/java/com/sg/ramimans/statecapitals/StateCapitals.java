package com.sg.ramimans.statecapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 8, 2021
 * purpose: 
 */
public class StateCapitals {
    
    
    
    private final static String[] orderedStates = {"Alabama", "Alaska", "Arizona",
    "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida",
    "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
    "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
    "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire",
    "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", 
    "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
    "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
    "West Virginia", "Wisconsin", "Wyoming"};
    
    private final static String[] orderedCapitals = {"Montgomery", "Juneau", "Phoenix",
    "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", 
    "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines",
    "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston",
    "Lansing", "St. Paul", "Jackson", "Jefferson City", "Helena", "Lincoln",
    "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", 
    "Colombus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", 
    "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", 
    "Olympia", "Charleston", "Madison", "Cheyenne"};
    
    private final static Map<String, String> stateToCapital = assignCapitals();
    
    private static Map<String, String> assignCapitals() {
        Map<String, String> result = new HashMap<>();
        for (int i=0; i < orderedStates.length; i++) {
            result.put(orderedStates[i], orderedCapitals[i]);
        }
        return result;
    }
    
    
    
    public static void printStates() {
        Set<String> states = stateToCapital.keySet();
        for(String state : states) {
            System.out.println(state);
        }
    }
    
    public static void printCapitals() {
        Collection<String> capitals = stateToCapital.values();
        for(String capital : capitals) {
            System.out.println(capital);
        }
    }
    
    public static void printStatesToCapitals() {
        Set<String> states = stateToCapital.keySet();
        for(String state : states) {
            System.out.println("The capital of " + state + " is " + 
                stateToCapital.get(state));
        }
    }
    
}
    
 
    

