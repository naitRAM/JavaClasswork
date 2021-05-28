package com.sg.foundations.variables;

import java.util.Scanner;


/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 28, 2021
 * purpose: a program that sums three input integers
 */
public class BestAdderEver {
    public static void main(String[] args) {
        Scanner calcScanner = new Scanner(System.in);
        System.out.println("Enter the first number to be summed: ");
        String stringNum1 = calcScanner.nextLine();
        System.out.println("Enter the second number to be summed: ");
        String stringNum2 = calcScanner.nextLine();
        System.out.println("Enter the last number to be summed: ");
        String stringNum3 = calcScanner.nextLine();
        int num1 = Integer.parseInt(stringNum1);
        int num2 = Integer.parseInt(stringNum2);
        int num3 = Integer.parseInt(stringNum3);
        int sum = num1 + num2 + num3;
        System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + sum);
    }
}
