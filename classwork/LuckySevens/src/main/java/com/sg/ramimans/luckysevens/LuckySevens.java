package com.sg.ramimans.luckysevens;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jun. 8, 2021
 * purpose: to show you foolish it is to play lucky sevens
 */
public class LuckySevens {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How much money you got?");
        int userFunds = userInput.nextInt();
        int numRolls = 0;
        int maxMoney = userFunds;
        int idealRolls = 0;
        Random diceRoller = new Random();
        int DiceSize = 6;
        
        while (userFunds > 0) {
            int diceRollPart1 = diceRoller.nextInt(DiceSize) + 1;
            int diceRollPart2 = diceRoller.nextInt(DiceSize) + 1;
            numRolls++;
            if (diceRollPart1 + diceRollPart2 == 7) {
                userFunds += 4;
            } else {
                userFunds--;
            }
            // if we use > instead of >= then idealRolls won't update if the same 
            // record high is reached again (but not exceeded)
            if (userFunds >= maxMoney) {
                maxMoney = userFunds;
                idealRolls = numRolls;
            }
        }
        
        System.out.format("You are broke after %d rolls.%n", numRolls);
        System.out.format("You should have quit after %d rolls when you had $%d", idealRolls, maxMoney);
        
    }
}
