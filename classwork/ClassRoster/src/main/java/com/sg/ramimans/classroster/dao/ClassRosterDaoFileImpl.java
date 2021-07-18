package com.sg.ramimans.classroster.dao;

import com.sg.ramimans.classroster.dto.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 13, 2021
 * purpose: 
 */
public class ClassRosterDaoFileImpl implements classRosterDao {
    
    private Map<String, Student> students = new HashMap<>();
    @Override
    public Student addStudent(String studentId, Student student) {
        Student prevStudent = students.put(studentId, student);
        return prevStudent;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentId) {
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) {
        Student removedStudent = students.remove(studentId);
        return removedStudent;
    }

}
