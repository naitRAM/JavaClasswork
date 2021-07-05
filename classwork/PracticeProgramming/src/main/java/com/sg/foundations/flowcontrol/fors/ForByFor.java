package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author Rami Mansieh 
 * email: rmansieh@gmail.com 
 * date: Jun. 20, 2021 
 * purpose: to go crazy 
 */
public class ForByFor {

    public static void main(String[] args) {
        // each row to print
        for (int i = 0; i < 3; i++) {
            //printed out at the start of each row
            System.out.print("|");
            // each column to print inside the row
            for (int j = 0; j < 3; j++) {
                // each symbol to print inside the column
                for (int k = 0; k < 3; k++) {
                    // when the line is even
                    if (i % 2 == 0) {
                        // when the column is even 
                        if (j % 2 == 0) {
                        System.out.print("*");
                        } else { // when the column is odd
                        System.out.print("$");
                        }
                    } else { // when the line is odd
                        // when the column is even
                        if (j % 2 == 0) {
                            System.out.print("@");
                        } else { // when the column is odd
                            System.out.print("#");
                        }
                    }
                }
                // printed out after each column
                System.out.print("|");
            }
            // printed out after each line
            System.out.println("");
        }

    }
}
