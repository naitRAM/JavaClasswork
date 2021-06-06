package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 31, 2021
 * purpose: fizz buzz that keeps track of fizz and/or buzz count
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        int userNum = userInput.nextInt();
        int count = 0;
        System.out.println("");
        for (int i = 0; count < userNum; i++) {
            if (i==0) {
                System.out.println(i);
            } else if (i%3 == 0 && i%5 ==0) {
                System.out.println("fizz buzz");
                count++;
            } else if (i%3 == 0){
                System.out.println("fizz");
                count++;
            } else if (i%5 == 0){
                System.out.println("buzz");
                count++;
            } else {
                System.out.println("" + i); 
            }
        }
        System.out.println("Tradition!!!!!");
    }
    
}
