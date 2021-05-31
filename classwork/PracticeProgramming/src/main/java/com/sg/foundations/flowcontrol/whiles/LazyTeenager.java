package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 30, 2021
 * purpose: 
 */
public class LazyTeenager {
    public static void main (String[] args) {
        Random randomizer = new Random();
        int cleaningPoint = randomizer.nextInt(10) + 1;
        int cleaningChance = 0;
        do {
            cleaningChance += 1;
            System.out.println("Clean your room!!" + " (x" + cleaningChance + ")");
            
            if (cleaningChance == 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            } else if (cleaningChance >= cleaningPoint) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            }
        } while (cleaningChance < cleaningPoint);
        //System.out.println(cleaningChance);
        //System.out.println(cleaningPoint);
    }
        
}
