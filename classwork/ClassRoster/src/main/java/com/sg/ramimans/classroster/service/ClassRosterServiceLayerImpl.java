package com.sg.ramimans.classroster.service;

import com.sg.ramimans.classroster.dao.ClassRosterAuditDao;
import com.sg.ramimans.classroster.dao.ClassRosterPersistenceException;
import com.sg.ramimans.classroster.dao.classRosterDao;
import com.sg.ramimans.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Aug. 5, 2021
 * purpose: 
 */
public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer {
    
    private classRosterDao dao;
    private ClassRosterAuditDao auditDao;
    public ClassRosterServiceLayerImpl(classRosterDao dao, ClassRosterAuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }
    @Override
    public void createStudent(Student student) throws ClassRosterDuplicateIdException, ClassRosterDataValidationException, ClassRosterPersistenceException {
        if (dao.getStudent(student.getStudentId()) != null) {
            throw new ClassRosterDuplicateIdException("ERROR: Could not create student. Student Id " + 
                    student.getStudentId() + " already exists.");
        }
        validateStudentData(student);
        dao.addStudent(student.getStudentId(), student);
        auditDao.writeAuditEntry("Student" + student.getStudentId() + " CREATED.");
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        return dao.getAllStudents();
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        return dao.getStudent(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        Student removedStudent = dao.removeStudent(studentId);
        auditDao.writeAuditEntry("Student " + studentId + " REMOVED.");
        return removedStudent;
    }
    
    private void validateStudentData(Student student) throws ClassRosterDataValidationException {
        
        if (student.getFirstName() == null || student.getFirstName().trim().length() == 0 
                || student.getLastName() == null || student.getLastName().trim().length() == 0
                || student.getCohort() == null || student.getCohort().trim().length() == 0) {
            throw new ClassRosterDataValidationException("ERROR: All fields [First Name, Last Name, Cohort] are required.");
        }
    }
    
}
