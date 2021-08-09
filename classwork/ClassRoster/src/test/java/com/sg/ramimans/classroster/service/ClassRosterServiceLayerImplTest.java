/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.ramimans.classroster.service;

import com.sg.ramimans.classroster.dao.ClassRosterAuditDao;
import com.sg.ramimans.classroster.dao.ClassRosterPersistenceException;
import com.sg.ramimans.classroster.dao.classRosterDao;
import com.sg.ramimans.classroster.dto.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rmans
 */
public class ClassRosterServiceLayerImplTest {

    private ClassRosterServiceLayer service;

    public ClassRosterServiceLayerImplTest() {
        classRosterDao dao = new ClassRosterDaoStubImpl();
        ClassRosterAuditDao auditDao = new ClassRosterAuditDaoStubImpl();

        service = new ClassRosterServiceLayerImpl(dao, auditDao);
    }

    @Test
    public void testCreateValidStudent() {
        // Arrange
        Student student = new Student("0002");
        student.setFirstName("Charles");
        student.setLastName("Babbage");
        student.setCohort(".NET-May-1845");
        // Act
        try {
            service.createStudent(student);
        } catch (ClassRosterDuplicateIdException | ClassRosterDataValidationException | ClassRosterPersistenceException e) {
            fail("Student was valid. No exception should have been thrown");
        }
    }

    @Test
    public void testCreateDuplicateIdStudent() {
        //Arrange
        Student student = new Student("0001");
        student.setFirstName("Charles");
        student.setLastName("Babbage");
        student.setCohort(".NET-May-1845");
        //Act
        try {
            service.createStudent(student);
            fail("Expected DupeId Exception was not thrown.");
        } catch (ClassRosterDataValidationException | ClassRosterPersistenceException e) {
            //Assert
            fail("Incorrect exception was thrown.");
        } catch (ClassRosterDuplicateIdException e) {
            return;
        }
    }

    @Test
    public void testCreateStudentInvalidData() throws Exception {
        //Arrange
        Student student = new Student("0002");
        student.setFirstName("");
        student.setLastName("Babbage");
        student.setCohort(".NET-May-1845");
        //Act
        try {
            service.createStudent(student);
            fail("Expected ValidationException was not thrown.");
        } catch (ClassRosterPersistenceException | ClassRosterDuplicateIdException e) {
            //Assert
            fail("Incorrect exception was thrown.");
        } catch (ClassRosterDataValidationException e) {
            return;
        }
    }

    @Test
    public void testGetAllStudents() throws Exception {
        //Arrange
        Student testClone = new Student("0001");
        testClone.setFirstName("Ada");
        testClone.setLastName("Lovelace");
        testClone.setCohort("Java-May-1845");
        //Act & Assert
        assertEquals(1, service.getAllStudents().size(), "Should only have one student");
        assertTrue(service.getAllStudents().contains(testClone), "The one student should be Ada");
    }
    
    @Test
    public void testGetStudent() throws Exception {
        //Arrange
        Student testClone = new Student("0001");
        testClone.setFirstName("Ada");
        testClone.setLastName("Lovelace");
        testClone.setCohort("Java-May-1845");
        //Act & Assert
        Student shouldBeAda = service.getStudent("0001");
        assertNotNull(shouldBeAda, "Getting 0001 should not be null");
        assertEquals(testClone, shouldBeAda, "Student stored under 0001 should be Ada.");
        
        Student shouldBeNull = service.removeStudent("0042");
        assertNull(shouldBeNull, "Removing 0042 should be null.");
        
    }
    @Test
    public void testRemoveStudent() throws Exception {
        //Arrange
        Student testClone = new Student("0001");
        testClone.setFirstName("Ada");
        testClone.setLastName("Lovelace");
        testClone.setCohort("Java-May-1845");
        //Act & Assert
        Student shouldBeAda = service.removeStudent("0001");
        assertNotNull(shouldBeAda, "Removing 001 should not be null.");
        assertEquals(testClone, shouldBeAda, "Student removed from 0001 should be Ada");

        Student shouldBeNull = service.removeStudent("0042");
        assertNull(shouldBeNull, "Removing 0042 should be null.");

    }

}
