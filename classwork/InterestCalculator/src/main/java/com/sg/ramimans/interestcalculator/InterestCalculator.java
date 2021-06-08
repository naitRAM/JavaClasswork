package com.sg.ramimans.interestcalculator;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jun. 8, 2021
 * purpose: calculate annual return on investment with quarterly compounding 
 */
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How much do you want to invest? ");
        double amount = userInput.nextDouble();
        System.out.println("How many years of investing?");
        int years = userInput.nextInt();
        System.out.println("What is the annual interest rate % growth?");
        double rate = userInput.nextDouble();
        double quarterlyInterestRate = rate/4;
        double currentBalance = amount;
        System.out.println("\nCalculating...");
        
        for (int yearNum = 1; yearNum <= years; yearNum++) {
            System.out.println("Year " + yearNum + ":");
            System.out.format("Begin with $%.2f%n", currentBalance);
            int numQuarters = 4;
            double earningsThisYear = 0;
            while (numQuarters > 0) {
                double earningsThisQuarter = currentBalance * (quarterlyInterestRate / 100);
                currentBalance += earningsThisQuarter;
                earningsThisYear += earningsThisQuarter;
                numQuarters--;
            }
            System.out.format("Earned $%.2f%n", earningsThisYear);
            System.out.format("Ended with $%.2f%n%n", currentBalance);
        }
    }
}
