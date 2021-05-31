package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 30, 2021
 * purpose: demonstrate use of if/else and if/else-if/else statements
 */
public class SpaceRustlers {
    public static void main(String[] args){
        int aliens = 25;
        int spaceships = 10;
        int cows = 100;
        
        if (aliens > spaceships) {
            System.out.println("Vrroom, vroom! Let's get going! ");
        } else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        // check if condition is true and run the statment in the block if it is
        if (cows == spaceships) {
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        }   // if first condition doesn't run then check else if condition
        else if (cows > spaceships) {
            System.out.println("Dangit! I don't know how we're going to fit all these cows in here!");
        } // removing the following else condition will not change anything if any preceding conditions in statement were true
        else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if (aliens > cows) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else {
            System.out.println("Oh no! The herds got restless and took over! Looks like WE'RE hamburger now!!");
        }
    }
}
