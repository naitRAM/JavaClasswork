package com.sg.ramimans.classroster.service;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Aug. 5, 2021
 * purpose: 
 */
public class ClassRosterDataValidationException extends Exception{
    public ClassRosterDataValidationException(String message) {
        super(message);
    }
    public ClassRosterDataValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
