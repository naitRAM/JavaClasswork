package com.sg.ramimans.birthdaycalculator;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Aug. 11, 2021
 * purpose: 
 */
public class BirthdayCalculator {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        
        // obtain user's birthday and convert to LocalDate object
        System.out.println("Please enter your birthdate in MM/DD/YYYY format: ");
        String stringBirthday = userInput.nextLine();
        LocalDate birthday = LocalDate.parse(stringBirthday, dateFormat);
        
        // the present date in LocalDate and String form
        LocalDate currentDate = LocalDate.now();
        String currentDateString = currentDate.format(dateFormat);
        
        // print day of week they were born
        DayOfWeek birthdayWeekday = birthday.getDayOfWeek();
        System.out.println("You were born on a " + birthdayWeekday.toString());
        
        // new LocalDate object representing user's birthday in this year
        int currentYear = currentDate.getYear();
        int birthdayMonth = birthday.getMonthValue();
        int birthdayDay = birthday.getDayOfMonth();
        LocalDate birthdayThisYear = LocalDate.of(currentYear, birthdayMonth, birthdayDay);
        
        // print day of week for user's birthday in current year
        DayOfWeek birthdayWeekdayCurrentYear = birthdayThisYear.getDayOfWeek();
        System.out.println("This year, your birthday is on a " + birthdayWeekdayCurrentYear);
        
        // Check if next birthday is this year or the next
        Boolean birthdayThisYearHasPassed = birthdayThisYear.isBefore(currentDate);
        LocalDate nextBirthday = birthdayThisYear;
        if (birthdayThisYearHasPassed) {
            nextBirthday = LocalDate.of(currentYear + 1, birthdayMonth, birthdayDay);
        }
        
        // use current date and next birthday to get the total number of days until then
        long daysUntilNextBirthday = ChronoUnit.DAYS.between(currentDate, nextBirthday);
        System.out.println("Since it's " + currentDateString + ", there's only " + daysUntilNextBirthday + " days until your next birthday!");
        
        // use actual birthday and next birthday to get number of years in between, so age at next birthday can be printed out
        long yearsOldNextBirthday = ChronoUnit.YEARS.between(birthday, nextBirthday);
        System.out.println("Bet you're excited to be turning " + yearsOldNextBirthday + "!");  
    }
    
}
