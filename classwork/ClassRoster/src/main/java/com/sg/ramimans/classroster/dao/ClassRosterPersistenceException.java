package com.sg.ramimans.classroster.dao;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 16, 2021
 * purpose: 
 */
public class ClassRosterPersistenceException extends Exception {
    public ClassRosterPersistenceException(String message) {
        super(message);
    }
    public ClassRosterPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
