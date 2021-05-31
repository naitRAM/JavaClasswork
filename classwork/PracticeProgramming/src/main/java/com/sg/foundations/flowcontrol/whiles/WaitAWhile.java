package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 30, 2021
 * purpose: demonstrate understanding of while loops
 */
public class WaitAWhile {
    public static void main(String[] args) {
        
        int timeNow = 5;
        int bedTime = 10;
        
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // time passes
        }
        
        // changing bedTime's value to 11 will print run the loop one more time
        // when timeNow = 10 and print that it's 11 before going to bed
        
        // using bedTime's original value but setting timeNow to 11 will not run the loop.
        // It will still run the print statements after the loop with timeNow value as 11
        
        // commenting out timeNow++ will cause an infinite loop printing out that
        // it's 5 o'clock
        
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I shoud go to bed ...");
    }
}
