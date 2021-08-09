package com.sg.ramimans.classroster.service;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Aug. 5, 2021
 * purpose: 
 */
public class ClassRosterDuplicateIdException extends Exception{
    public ClassRosterDuplicateIdException(String message) {
        super(message);
    }
    public ClassRosterDuplicateIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
