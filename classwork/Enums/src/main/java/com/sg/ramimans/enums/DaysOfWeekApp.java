package com.sg.ramimans.enums;

import static com.sg.ramimans.enums.DaysOfWeek.FRIDAY;
import static com.sg.ramimans.enums.DaysOfWeek.MONDAY;
import static com.sg.ramimans.enums.DaysOfWeek.SATURDAY;
import static com.sg.ramimans.enums.DaysOfWeek.SUNDAY;
import static com.sg.ramimans.enums.DaysOfWeek.THURSDAY;
import static com.sg.ramimans.enums.DaysOfWeek.TUESDAY;
import static com.sg.ramimans.enums.DaysOfWeek.WEDNESDAY;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Rami Mansieh email: rmansieh@gmail.com data: Aug. 9, 2021 purpose:
 */
public class DaysOfWeekApp {

    public static void main(String[] args) {
        Scanner dayReader = new Scanner(System.in);
        System.out.println("Enter the day of the week to get the number of days until Friday: ");
        String dayName = dayReader.nextLine().trim().toUpperCase();
        /*
        Map<String, DaysOfWeek> dayStringToEnum = new HashMap<>();
        dayStringToEnum.put("monday", MONDAY);
        dayStringToEnum.put("tuesday", TUESDAY);
        dayStringToEnum.put("wednesday", WEDNESDAY);
        dayStringToEnum.put("thursday", THURSDAY);
        dayStringToEnum.put("friday", FRIDAY);
        dayStringToEnum.put("saturday", SATURDAY);
        dayStringToEnum.put("sunday", SUNDAY);
         */
        DaysOfWeek weekDay;       //not sure what the exercise instructions want me to do
        //weekDay = dayStringToEnum.get(dayName);
        weekDay = DaysOfWeek.valueOf(dayName);

        switch (weekDay) {
            case MONDAY:
                printDaysToFriday(4);
                break;
            case TUESDAY:
                printDaysToFriday(3);
                break;
            case WEDNESDAY:
                printDaysToFriday(2);
                break;
            case THURSDAY:
                printDaysToFriday(1);
                break;
            case FRIDAY:
                printDaysToFriday(0);
                break;
            case SATURDAY:
                printDaysToFriday(6);
                break;
            case SUNDAY:
                printDaysToFriday(5);
                break;
            default:
                throw new UnsupportedOperationException("Invalid day of week");

        }
    }

    private static void printDaysToFriday(int numDays) {
        System.out.println("There are " + numDays + " days until it's Friday!");
    }

}
