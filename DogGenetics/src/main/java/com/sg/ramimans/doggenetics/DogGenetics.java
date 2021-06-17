package com.sg.ramimans.doggenetics;
import java.util.Random;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jun. 13, 2021
 * purpose: 
 */
public class DogGenetics {
    public static void main(String[] args) {
        int[] percentageArray = new int[5];
        Random randomNum = new Random();
        int num;
        for (int count = 0; count < percentageArray.length; count++) {
            //do {
                num = randomNum.nextInt(100) + 1;
            //} while (notInArray(num, percentageArray));
        }
    }
    //public static boolean notInArray(int number, int[] )
}
