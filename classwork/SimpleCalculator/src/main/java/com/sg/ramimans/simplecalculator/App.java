package com.sg.ramimans.simplecalculator;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 4, 2021
 * purpose: 
 */
public class App {
    public static void main(String[] args) {
        boolean calculating = true;
        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("What operation would you like to perform? \n"
                    + "Enter 'a' to add, 's' to subtract, 'm' to multiply, 'd' to divide:\n"
                    + "( ENTER 'e' TO EXIT )");
            String userResponse = userInput.nextLine();
            float num1;
            float num2;
            switch (userResponse) {
                case "a":
                    System.out.println("Enter first number to add: ");
                    num1 = Float.parseFloat(userInput.nextLine());
                    System.out.println("Enter second number to add: ");
                    num2 = Float.parseFloat(userInput.nextLine());
                    System.out.println(SimpleCalculator.add(num1, num2));
                    break;
                case "s":
                    System.out.println("Enter number to subtract from: ");
                    num1 = Float.parseFloat(userInput.nextLine());
                    System.out.println("Enter number to subtract from " + num1 + ":");
                    num2 = Float.parseFloat(userInput.nextLine());
                    System.out.println(SimpleCalculator.subtract(num1, num2));
                    break;
                case "m":
                    System.out.println("Enter first number to multiply: ");
                    num1 = Float.parseFloat(userInput.nextLine());
                    System.out.println("Enter second number to multiply: ");
                    num2 = Float.parseFloat(userInput.nextLine());
                    System.out.println(SimpleCalculator.multiply(num1, num2));
                    break;
                case "d":
                    System.out.println("Enter numerator of division operation");
                    num1 = Float.parseFloat(userInput.nextLine());
                    System.out.println("Enter denominator of division operation");
                    num2 = Float.parseFloat(userInput.nextLine());
                    System.out.println(SimpleCalculator.divide(num1, num2));
                    break;
                case "e":
                    System.out.println("Thanks for using SimpleCalculator! Goodbye!");
                    calculating = false;
            }   
        } while (calculating);
    }
}
