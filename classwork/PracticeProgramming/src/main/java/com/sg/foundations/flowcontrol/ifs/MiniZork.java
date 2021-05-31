package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 30, 2021
 * purpose: demonstration of nested if-else statements with a text-based game
 */
public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are standing in an open field west of a white house.");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("There is also an old rusty car parked in the driveway.");
        System.out.println("Go to the house, go to the car, or open the mailbox?");
        
        String action = userInput.nextLine();
        
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in?");
            action = userInput.nextLine();
            
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking?");
                action = userInput.nextLine();
                
                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places"
                            + " isn't a good idea.");
                    System.out.println("You've been eatern by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields "
                            + "looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
                
            } else if (action.equals("stick your hand in")) {
                System.out.println("You stick your hand inside the mailbox...");
                System.out.println("You feel around for any mail, but the mailbox is deep.");
                System.out.println("As you thrust your arm deeper, it is bitten off by a grue.");
                System.out.println("You are now lying on the ground bleeding in shock. Rest in Peace");
            }
        } else if (action.equals("go to the house")) {
                System.out.println("You walk towards the house.");
                System.out.println("As you approach, you here a screech from behind the front door...");
                System.out.println("Try the front door or approach the rear entrance?");
                action = userInput.nextLine();
                
                if (action.equals("try the front door")) {
                    System.out.println("You pull off the boards, the door opens inwards slowly, it creaks...");
                    System.out.println("You hear another screech, this time closer!");
                    System.out.println("As you look up towards the sound you see an open mouth... ");
                    System.out.println("You have been decapitated by a grue's bite. Rest in Peace");
                } else if (action.equals("approach the rear entrance")) {
                    System.out.println("You come around through the backyard and enter through the rear door");
                    System.out.println("You are now in a kitchen. You here an eerie groan.");
                    System.out.println("There is a knife rack on the counter and a fridge that is slightly ajar...");
                    System.out.println("Your stomach groans. Was that the same groan from earlier? You feel hungry now.");
                    System.out.println("Head to the fridge? Grab a knife?");
                    action = userInput.nextLine();
                    if (action.equals("grab a knife")) {
                        System.out.println("You grab a long butcher knife from the rack.");
                        System.out.println("As you admire it's shiny glean, a grue emerges from the fridge.");
                        System.out.println("You cry out like a wimp and slash as you close your eyes in fear.");
                        System.out.println("Lucky swing! The grue lies writhing on the floor head-less.");
                        System.out.println("You're still alive but it might not be over yet...");
                    } else if (action.equals("head to the fridge")) {
                        System.out.println("As you swing open the fridge, a grue lunges at you.");
                        System.out.println("You duck quickly and run for the knife rack...");
                        System.out.println("You slip on some grue slime and slide towards the rack");
                        System.out.println("As you regain your balance, another grue emerges from the other fridge door");
                        System.out.println("You thought YOU were hungry? Look at these grues feeding on your guts!");
                        System.out.println("Should have grabbed that knife first!");
                        
                    }
                }
        } else if (action.equals("go to the car")) {
            System.out.println("As you walk to the car, you hear a groan coming from the trunk ...");
            System.out.println("You get in the driver's seat, there is a key in the ignition.");
            System.out.println("There is also a latch to open the trunk from the inside.");
            System.out.println("Engage the latch or start the car?");
            action = userInput.nextLine();
            if (action.equals("start the car")) {
                System.out.println("You start the car. Oddly it seems to run fine.");
                System.out.println("As you pull out of the driveway you look in the rearview.");
                System.out.println("The backseat has folded in from the trunk and there is a gruel staring back at you...");
                System.out.println("It only takes a second for the gruel to bite your head off, so at least it will be quick.");
                System.out.println("Rest in Peace.");
            } else if (action.equals("engage the latch")) {
                System.out.println("As you engage the latch, a gruel jumps out of the trunk");
                System.out.println("It lunges at your door repeatedly, denting it as it screeches at you!");
                System.out.println("You try the ignition as the glass cracks...");
                System.out.println("You put it in reverse and burn rubber as you reverse towards the field.");
                System.out.println("The gruel gets caught in your wheel as you accelerate and gets crushed!");
                System.out.println("Lucky break, you could have been eaten!");
            }
        }
        
    }
}
