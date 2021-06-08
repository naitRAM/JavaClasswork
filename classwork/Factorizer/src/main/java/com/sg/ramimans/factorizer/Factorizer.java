package com.sg.ramimans.factorizer;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jun. 8, 2021
 * purpose: find out a number's factors, whether it's perfect and/or prime
 */
public class Factorizer {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What number would you like to factor?");
        int userNum = userInput.nextInt();
        System.out.println("The factors of " + userNum + " are:");
        int factorCount = 0;
        int factorSum = 0;
        for (int i = 1; i <= userNum; i++) {
            if (userNum % i == 0) {
                System.out.print(i + " ");
                factorCount++;
                factorSum += i;
            }
        }
        System.out.println("\n" + userNum + " has " + factorCount + " factors.");
        if (factorSum - userNum == userNum) {
            System.out.println(userNum + " is a perfect number.");
        } else {
            System.out.println(userNum + " is not a perfect number");
        }
        if (factorCount == 2) {
            System.out.println(userNum + " is a prime number.");
        } else {
            System.out.println(userNum + " is not a prime number.");
        }
    }
}
