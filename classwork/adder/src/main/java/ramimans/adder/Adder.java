package ramimans.adder;

import java.util.Scanner;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 23, 2021
 * purpose: a class that adds two integers and prints their sum to console
 */
public class Adder {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String strOperand1;
        String strOperand2;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number to be added:");
        strOperand1 = myScanner.nextLine();
        System.out.println("Enter the second number to be added:");
        strOperand2 = myScanner.nextLine();
        operand1 = Integer.parseInt(strOperand1);
        operand2 = Integer.parseInt(strOperand2);
        int sum = operand1 + operand2;
        System.out.println("The sum is: " + sum);
    }
}
