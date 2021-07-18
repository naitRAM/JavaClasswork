package com.sg.ramimans.classroster.dto;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 13, 2021
 * purpose: 
 */
public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    // Programming language + cohort month/year
    private String cohort;
    
    public Student (String studentId) {
        this.studentId = studentId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public String getCohort() {
        return cohort;
    }
    
    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
}
