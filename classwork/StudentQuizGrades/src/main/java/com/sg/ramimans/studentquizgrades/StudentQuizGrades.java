package com.sg.ramimans.studentquizgrades;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collection;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 9, 2021
 * purpose: 
 */
public class StudentQuizGrades {
    
    private static final Map<String, List<Integer>> gradesMap = new HashMap<>();
    
    public static void addStudent(String student) {
        if (!gradesMap.containsKey(student)) {
            List<Integer> scores = new ArrayList<>();
            gradesMap.put(student, scores);
        }
    }
    
    public static void removeStudent(String student) {
        if (gradesMap.containsKey(student)) {
            gradesMap.remove(student);
        }
    }
    
    public static void setStudentScore(String student, int score) {
            List<Integer> scores = getStudentScores(student);
            scores.add(score);
            gradesMap.put(student, scores);
    }
    
    public static List<Integer> getStudentScores(String student){
        List<Integer> scores = new ArrayList<>();
        if (gradesMap.containsKey(student)) {
            return gradesMap.get(student);
        }
        return scores;
    }
    
    public static float getStudentAverage(String student) {
        float avg = 0;
        if (gradesMap.containsKey(student)) {
            float accumulator = 0;
            List<Integer> scores = gradesMap.get(student);
            for (Integer score : scores) {
                accumulator += score;
            }
            avg = accumulator/scores.size();
        }
        return avg;
    }
    
    public static Set<String> getStudents () {
        return gradesMap.keySet();
    }
    
    public static float getClassAverage() {
        Set<String> students = gradesMap.keySet();
        float studentAvgAccumulator = 0;
        int numStudents = students.size();
        for (String student : students) {
            studentAvgAccumulator += getStudentAverage(student);
        }
        return studentAvgAccumulator/numStudents;
    }
   
    public static List<String> getTopScorers() {
        List<String> topScorers = new ArrayList<>();
        int topScore = 0;
        Collection<List<Integer>> gradeList = gradesMap.values();
        Set<String> students = gradesMap.keySet();
        for (List<Integer> grades : gradeList) {
            for (Integer grade : grades) {
                if (grade > topScore) {
                    topScore = grade;
                }
            }
        }
        for (String student : students) {
            if (gradesMap.get(student).contains(topScore)) {
                topScorers.add(student);
            }
        }
        return topScorers;
        
    }
    
    public static List<String> getBottomScorers() {
        List<String> bottomScorers = new ArrayList<>();
        int bottomScore = 100;
        Collection<List<Integer>> gradeList = gradesMap.values();
        Set<String> students = gradesMap.keySet();
        for (List<Integer> grades : gradeList) {
            for (Integer grade : grades) {
                if (grade < bottomScore) {
                    bottomScore = grade;
                }
            }
        }
        for (String student : students) {
            if (gradesMap.get(student).contains(bottomScore)) {
                bottomScorers.add(student);
            }
        }
        return bottomScorers;
        
    }
    
    public static void printStudentScores(String student) {
        if (gradesMap.containsKey(student)) {
            List<Integer> scores = gradesMap.get(student);
            System.out.println(student + "'s scores are:");
            for (Integer score : scores) {
                System.out.println(score);
            }
            System.out.println();
        }
    }
    
    public static void printStudentAverage(String student) {
        System.out.println(student + "'s average is " + getStudentAverage(student) + "\n");  
    }
    
    public static void printStudents () {
        System.out.println("The students in this class are: ");
        for (String student : gradesMap.keySet()) {
            System.out.println(student);
        }
        System.out.println();
    }
    
    public static void printClassAverage() {
        System.out.println("Class average is " + getClassAverage() + "\n");
    }
    
    public static void printTopScorers() {
        List<String> topScorers = getTopScorers();
        System.out.println("The top scorer(s): " );
        for (String student : topScorers ) {
            System.out.println(student);
        }
        System.out.println();
    }
    
    public static void printBottomScorers() {
        List<String> bottomScorers = getBottomScorers();
        System.out.println("The bottom scorer(s): " );
        for (String student: bottomScorers) {
            System.out.println(student);
        }
        System.out.println();
    }
    
}
