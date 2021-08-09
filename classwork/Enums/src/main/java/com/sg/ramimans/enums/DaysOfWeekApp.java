package com.sg.ramimans.enums;

import static com.sg.ramimans.enums.DaysOfWeek.FRIDAY;
import static com.sg.ramimans.enums.DaysOfWeek.MONDAY;
import static com.sg.ramimans.enums.DaysOfWeek.SATURDAY;
import static com.sg.ramimans.enums.DaysOfWeek.SUNDAY;
import static com.sg.ramimans.enums.DaysOfWeek.THURSDAY;
import static com.sg.ramimans.enums.DaysOfWeek.TUESDAY;
import static com.sg.ramimans.enums.DaysOfWeek.WEDNESDAY;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Aug. 9, 2021
 * purpose: 
 */
public class DaysOfWeekApp {
    public static void main(String[] args) {
        Scanner dayReader = new Scanner(System.in);
        System.out.println("Enter the day of the week to get number of days till Friday: ");
        String dayName = dayReader.nextLine();
        String[] weekDays = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        List<DaysOfWeek> daysOfWeek = new ArrayList<>();
        //not sure what the exercise instructions want me to do
        
        //line below is just so switch doesn't break
        DaysOfWeek day = SUNDAY;
        switch(day) {
            case MONDAY:
                 
            case TUESDAY:
                
            case WEDNESDAY:
                
            case THURSDAY:
                
            case FRIDAY:
                
            case SATURDAY:
                
            case SUNDAY:
                break;
            default:
                throw new UnsupportedOperationException("Invalid day of week");
                   
        }
    }
    
}
