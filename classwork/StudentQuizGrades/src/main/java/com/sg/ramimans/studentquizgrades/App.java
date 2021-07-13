package com.sg.ramimans.studentquizgrades;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 9, 2021
 * purpose: 
 */
public class App {
    public static void main (String[] args) {
        
        StudentQuizGrades.addStudent("Patti Page");
        StudentQuizGrades.addStudent("Elvis Presley");
        StudentQuizGrades.addStudent("Jim Morrison");
        StudentQuizGrades.addStudent("Ella Fitzgerald");
        StudentQuizGrades.setStudentScore("Patti Page", 86);
        StudentQuizGrades.setStudentScore("Patti Page", 89);
        StudentQuizGrades.setStudentScore("Elvis Presley", 62);
        StudentQuizGrades.setStudentScore("Elvis Presley", 74);
        StudentQuizGrades.setStudentScore("Jim Morrison", 82);
        StudentQuizGrades.setStudentScore("Jim Morrison", 97);
        StudentQuizGrades.setStudentScore("Ella Fitzgerald", 96);
        StudentQuizGrades.setStudentScore("Ella Fitzgerald", 100);
        StudentQuizGrades.printTopScorers();
        StudentQuizGrades.printBottomScorers();
        StudentQuizGrades.printStudents();
        StudentQuizGrades.printClassAverage();
        StudentQuizGrades.printStudentAverage("Jim Morrison");
        StudentQuizGrades.printStudentScores("Jim Morrison");
         
        
    }
}
