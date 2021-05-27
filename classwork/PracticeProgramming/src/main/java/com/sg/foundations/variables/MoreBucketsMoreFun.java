package com.sg.foundations.variables;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 27, 2021
 * purpose: 
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        // Declare ALL THE THINGS
        // (Usually it's a good idea to declare the at the beginning of the program)
        int butterflies, beetles, bugs;
    
        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterfles,");
        System.out.println("but there are " + bugs + " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one.");
        // Use -- unary operator to decrement butterflies by 1
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        /* Number of bugs will not decrease along with butterflies 
        because bugs was already initialized with an expression that included
        the value of butterflies before it was decremented
        */
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
    }
}
