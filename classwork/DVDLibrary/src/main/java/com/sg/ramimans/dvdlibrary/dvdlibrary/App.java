package com.sg.ramimans.dvdlibrary.dvdlibrary;

import com.sg.ramimans.dvdlibrary.controller.DVDLibraryController;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 16, 2021
 * purpose: 
 */
public class App {
    
    public static void main (String[] args) {
        DVDLibraryController controller = new DVDLibraryController();
        controller.run();
    }
}
