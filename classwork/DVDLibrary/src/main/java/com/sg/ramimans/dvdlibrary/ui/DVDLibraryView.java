package com.sg.ramimans.dvdlibrary.ui;


import com.sg.ramimans.dvdlibrary.dto.DVD;
import java.util.Set;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 16, 2021
 * purpose: 
 */


public class DVDLibraryView {
    
    
    UserIO io = new UserIOConsoleImpl();
    
    public void displayMainMenu () {
        io.print("");
        io.print("******* DVD Library *******");
        io.print("1. Add a DVD");
        io.print("2. Edit a DVD");
        io.print("3. Remove a DVD");
        io.print("4. Search for a DVD by title");
        io.print("5. List DVD information");
        io.print("6. Show all DVDs");
        io.print("7. Exit");
    }
    
    public void displayEmptyLibrary() {
        io.print("");
        io.print("DVD Library is empty!");
    }
    
    public void displayAlreadyExists(String userTitle) {
        io.print("");
        io.print("Found DVD titled " + userTitle + "!");
    }
    
    public void displayNonExistent(String userTitle) {
        io.print("");
        io.print("Sorry, could not find " + userTitle);
    }
    
    public String getUserSearch() {
        io.print("");
        return io.promptString("Enter title to search: ");
    }
    
  
    
    public String getDVDTitle(String message) {
        String userTitle = io.promptString(message);
        return userTitle;
    }
    
    public String getDVDTitleToEdit () {
        io.print("");
        String title = getDVDTitle("Enter title of DVD to edit:");
        return title;
    }
    
    public String getDVDTitleToDelete () {
        io.print("");
        String title = getDVDTitle("Enter title of DVD to delete:");
        return title;
    }
    
    public String getDVDTitleToDisplay () {
        io.print("");
        String title = getDVDTitle("Enter title of DVD to display:");
        return title;
    }
    
    
    private int getMenuChoiceNumber(String message, int min, int max) {
        message = String.format(message + " (%s - %s):", min, max);
        io.print("");
        return io.promptValidInt(message, min, max);
    }
    
    public int getMainMenuChoice() {
        io.print("");
        String message = "Select an item number to continue";
        int min = 1;
        int max = 7;
        return getMenuChoiceNumber(message, min, max);
    }
    
    public void displayExitMessage() {
        io.print("");
        String exitMessage = "Thanks for using DVD Library!";
        io.print(exitMessage);
    }
    
    public String getNewTitle() {
        io.print("");
        String message = "Enter DVD title:";
        return getDVDTitle(message);
    }
    
    public DVD getNewData(String title) {
        
        String releaseDate = io.promptString("DVD release date:");
        String MPAARating = io.promptString("MPAA rating:");
        String director = io.promptString("Director:");
        String studio = io.promptString("Production Studio:");
        String rating = io.promptString("rating/notes:");
        DVD newDVD = new DVD(title);
        newDVD.setReleaseDate(releaseDate);
        newDVD.setMPAArating(MPAARating);
        newDVD.setDirectorName(director);
        newDVD.setStudio(studio);
        newDVD.setUserRating(rating);
        return newDVD;
    }
        
    
    public DVD getEditData(String title) {
        
        io.print("");
        String releaseDate = io.promptString("DVD release date:");
        String MPAARating = io.promptString("MPAA rating:");
        String director = io.promptString("Director:");
        String studio = io.promptString("Production Studio:");
        String rating = io.promptString("rating/notes:");
        DVD newDVD = new DVD(title);
        newDVD.setReleaseDate(releaseDate);
        newDVD.setMPAArating(MPAARating);
        newDVD.setDirectorName(director);
        newDVD.setStudio(studio);
        newDVD.setUserRating(rating);
        return newDVD;
    }
    
    public void displayAllDVDTitles(Set<String> titleSet) {
        io.print("");
        io.print(titleSet.size() + " entries found");
        io.print("");
        for (String title : titleSet) {
            io.print("");
            io.print("Title: " + title);
        }
    }
    
    public void displayDVD(DVD DVD) {
        io.print("");
        io.print("Title: " + DVD.getTitle());
        io.print("Release Date: " + DVD.getReleaseDate());
        io.print("MPAA Rating: " + DVD.getMPAArating());
        io.print("Director Name: " + DVD.getDirectorName());
        io.print("Production Studio: " + DVD.getStudio());
        io.print("User Rating: " + DVD.getUserRating());
    }
}
