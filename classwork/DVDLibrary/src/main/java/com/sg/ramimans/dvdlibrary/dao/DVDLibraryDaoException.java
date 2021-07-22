package com.sg.ramimans.dvdlibrary.dao;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 21, 2021
 * purpose: understand how Exception interface is incorporated in MVC apps
 */
public class DVDLibraryDaoException extends Exception {
    public DVDLibraryDaoException(String message) {
        super(message);
    }
    
    public DVDLibraryDaoException(String message, Throwable cause) {
        super(message);
    }
    
    
}
