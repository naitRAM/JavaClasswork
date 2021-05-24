package ramimans.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: May 24, 2021
 * purpose: calculate and print out the total cost of custom window installation
 */
public class WindowMaster {
    public static void main(String[] args){
        float height;
        float width;
        String strHeight;
        String strWidth;
        Scanner myScanner = new Scanner(System.in);
        boolean isValidInput = false;
        do {
            try {
                System.out.println("Please enter the height of window: ");
                strHeight = myScanner.nextLine();
                System.out.println("Please enter the width of window: ");
                strWidth = myScanner.nextLine();
                height = Float.parseFloat(strHeight);
                width = Float.parseFloat(strWidth);
                isValidInput = true;
                float windowPerimeter = 2 * height + 2 * width;
                float windowArea = height * width;
                System.out.println("Window perimeter: " + windowPerimeter);
                System.out.println("Window Area: " + windowArea);
                float totalCost = 3.5f * windowArea + 2.25f * windowPerimeter;
                System.out.println("Total cost for this window is: $" + totalCost); 
            } catch (NumberFormatException ne) {
                System.out.println("Please enter valid width and/or height");
            }
        } while (isValidInput == false);   
    }
}
