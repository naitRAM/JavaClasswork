package com.sg.ramimans.classroster.dao;

import com.sg.ramimans.classroster.dao.ClassRosterPersistenceException;
import com.sg.ramimans.classroster.dao.classRosterDao;
import com.sg.ramimans.classroster.dto.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Aug. 9, 2021
 * purpose: 
 */
public class ClassRosterDaoStubImpl implements classRosterDao {
    public Student onlyStudent;
    public ClassRosterDaoStubImpl() {
        onlyStudent = new Student("0001");
        onlyStudent.setFirstName("Ada");
        onlyStudent.setLastName("Lovelace");
        onlyStudent.setCohort("Java-May-1845");
    }
    
    public ClassRosterDaoStubImpl(Student testStudent) {
        this.onlyStudent = testStudent;
    }
    
    @Override
    public Student addStudent(String studentId, Student student) throws 
            ClassRosterPersistenceException {
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }
    }
    
    @Override
    public Student getStudent (String studentId) throws 
            ClassRosterPersistenceException{
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }
    }
    
    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException{
        List<Student> studentList = new ArrayList<>();
        studentList.add(onlyStudent);
        return studentList;
    }
    
    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException{
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }
        
    }
}
