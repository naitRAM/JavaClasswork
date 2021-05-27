package com.sg.foundations.variables;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 27, 2021
 * purpose: a simple menu greeting for a restaurant
 */
public class MenuOfChampions {
    public static void main(String[] args) {
        String restaurantName = "Mansieh's Mediterranean Specials";
        String asciiArt = ".:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:.";
        String priceDecorator = " ***** "; 
        String falafel = "Tahini Falafel Wrap";
        String shawarma = "Grilled Chicken Breast Shawarma";
        String fattoush = "Fattoush Salad";
        double falafelPrice = 6.50;
        double shawarmaPrice = 8.00;
        double fattoushPrice = 4.50;
        
        // print out menu header
        System.out.println(asciiArt);
        System.out.println();
        System.out.print("               ");
        System.out.println(restaurantName);
        System.out.println();
        System.out.print("                            ");
        System.out.println("MENU");
        System.out.println();
        System.out.println(asciiArt);
        System.out.println();
        
        //print out menu
        System.out.print("               ");
        System.out.println( "$" + falafelPrice + priceDecorator + falafel);
        System.out.print("               ");
        System.out.println("$" + shawarmaPrice + priceDecorator + shawarma);
        System.out.print("               ");
        System.out.println("$" + fattoushPrice + priceDecorator + fattoush);
        
    }
}
