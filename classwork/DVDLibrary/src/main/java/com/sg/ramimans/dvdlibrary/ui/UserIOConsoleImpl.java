package com.sg.ramimans.dvdlibrary.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 16, 2021
 * purpose: 
 */
public class UserIOConsoleImpl implements UserIO{
    
    Scanner consoleInput = new Scanner(System.in);
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
    @Override
    public String promptString(String message) {
        print(message);
        return consoleInput.nextLine();
    }
    
    @Override
    public int promptValidInt(String message, int min, int max) {
        boolean isBadInput = true;
        int userInt = 0;
        while (isBadInput) {
            try {
                print(message);
                userInt = consoleInput.nextInt();
                while (userInt < min || userInt > max) {
                    print("");
                    print("ENTER A VALID CHOICE");
                    print("");
                    userInt = consoleInput.nextInt();
                }
                consoleInput.nextLine();
                isBadInput = false;
            } catch (InputMismatchException e) {
                consoleInput.nextLine();
                print("");
                print("ENTER A VALID CHOICE");
                print("");
            }
        }
        return userInt;
    }
    
}
