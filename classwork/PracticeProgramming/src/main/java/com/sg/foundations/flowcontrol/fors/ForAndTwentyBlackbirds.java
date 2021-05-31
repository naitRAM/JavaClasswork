package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 31, 2021
 * purpose: practice using for loops
 */
public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {
        int birdsInPie = 0;
        // starts printing out i as 1 and stops after i is 24
        // need to change i to 1 and < to <= in the stop condition of for loop
        for (int i = 1; i <= 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}
