/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.logic;

/**
 *
 * @author ahill
 */
public class LogicExerciseB {

    /**
     * Given a number, return the 'place rank' word associated with it.
     * I.e. pretend you're ranking folks running in a race from the order they
     * arrived at the finish line. Assume nonzero, positive inputs! 
     * Also, start by going up to 100, but stretch to more if you can!
     *
     * Ex:
     * placeOf( 1 ) ->   "1st"
     * placeOf( 3 ) ->   "3rd"
     * placeOf( 22 ) ->   "22nd"
     *
     * @param place
     * @return String
     */
    public static String placeOf(int place) {
        
        String placeToString = Integer.toString(place);
        int onesDigit = place % 10;
        Boolean isRuleException = place % 100 >= 11 && place % 100 <= 13;
        
        
        if (isRuleException) {
            return placeToString + "th";
        } else if (onesDigit == 1) {
            return placeToString + "st";
        } else if (onesDigit == 2) {
            return placeToString + "nd";
        } else if (onesDigit == 3) {
            return placeToString + "rd";
        }
        return placeToString + "th";
    }

}
