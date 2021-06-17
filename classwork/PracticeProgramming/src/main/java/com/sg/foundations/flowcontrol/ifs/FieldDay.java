package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jun. 15, 2021
 * purpose: 
 */
public class FieldDay {
    public static void main (String[] args) {
        String word1 = "Baggins";
        String word2 = "Dresden";
        String word3 = "Howl";
        String word4 = "Potter";
        String word5 = "Vimes";
        String redDragons = "Red Dragons";
        String darkWizards = "Dark Wizards";
        String movingCastles = "Moving Castles";
        String goldenSnitches = "Golden Snitches";
        String nightGuards = "Night Guards";
        String blackHoles = "Black Holes";
        
        String rawName = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's your last name?");
        rawName = sc.nextLine();
        String name = rawName.trim();
        
        if (name.compareTo(word1) < 0) {
            System.out.println("Aha! You're on the team \"" + redDragons + "\"!\n" +
"Good luck in the games!");
        } else if (name.compareTo(word2) < 0) {
            System.out.println("Aha! You're on the team \"" + darkWizards + "\"!\n" +
"Good luck in the games!");
        } else if (name.compareTo(word3) < 0) {
            System.out.println("Aha! You're on the team \"" + movingCastles + "\"!\n" +
"Good luck in the games!");
        } else if (name.compareTo(word4) < 0) {
            System.out.println("Aha! You're on the team \"" + goldenSnitches + "\"!\n" +
"Good luck in the games!");
        } else if (name.compareTo(word5) < 0) {
            System.out.println("Aha! You're on the team \"" + nightGuards + "\"!\n" +
"Good luck in the games!");
        } else {
            System.out.println("Aha! You're on the team \"" + blackHoles + "\"!\n" +
"Good luck in the games!");
        }
    }
}
