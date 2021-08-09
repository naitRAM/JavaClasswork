package com.sg.ramimans.enums;

import static com.sg.ramimans.enums.MathOperator.DIVIDE;
import static com.sg.ramimans.enums.MathOperator.MINUS;
import static com.sg.ramimans.enums.MathOperator.MULTIPLY;
import static com.sg.ramimans.enums.MathOperator.PLUS;
import java.util.Scanner;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Aug. 9, 2021
 * purpose: 
 */
public class MathOperatorApp {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter first operand: ");
        int operand1 = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Enter second operand: ");
        int operand2 = Integer.parseInt(userInput.nextLine());
        
        System.out.println(operand1 + " + " + operand2 + " = " + IntMath.calculate(PLUS, operand1, operand2));
        System.out.println(operand1 + " - " + operand2 + " = " + IntMath.calculate(MINUS, operand1, operand2));
        System.out.println(operand1 + " * " + operand2 + " = " + IntMath.calculate(MULTIPLY, operand1, operand2));
        System.out.println(operand1 + " / " + operand2 + " = " + IntMath.calculate(DIVIDE, operand1, operand2));
    }
}
