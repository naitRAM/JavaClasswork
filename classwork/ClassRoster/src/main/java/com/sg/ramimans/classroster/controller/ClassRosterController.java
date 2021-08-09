package com.sg.ramimans.classroster.controller;
import com.sg.ramimans.classroster.dao.ClassRosterPersistenceException;
import com.sg.ramimans.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.ramimans.classroster.dao.classRosterDao;
import com.sg.ramimans.classroster.dto.Student;
import com.sg.ramimans.classroster.service.ClassRosterDataValidationException;
import com.sg.ramimans.classroster.service.ClassRosterDuplicateIdException;
import com.sg.ramimans.classroster.service.ClassRosterServiceLayer;
import com.sg.ramimans.classroster.ui.UserIOConsoleImpl;
import com.sg.ramimans.classroster.ui.UserIO;
import com.sg.ramimans.classroster.ui.ClassRosterView;
import java.util.List;
/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 13, 2021
 * purpose: 
 */
public class ClassRosterController {
    
    private ClassRosterView view;
    
    private ClassRosterServiceLayer service;
    
    public ClassRosterController(ClassRosterServiceLayer service, ClassRosterView view) {
        this.service = service;
        this.view = view;
    }
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();
                switch (menuSelection) {
                    case 1:
                        listStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3: 
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        } catch (ClassRosterPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
        
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    
    private void createStudent()  throws ClassRosterPersistenceException  {
        view.displayCreateStudentBanner();
        boolean hasErrors = false;
        do {
            Student newStudent = view.getNewStudentInfo();
            try {
                service.createStudent(newStudent);
                view.displayCreateSuccessBanner(); 
                hasErrors = false;
            } catch (ClassRosterDataValidationException | ClassRosterDuplicateIdException e) {
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        } while (hasErrors);
        
        
         
    }
    
    private void listStudents() throws ClassRosterPersistenceException {
        view.displayDisplayAllBanner();
        List<Student> studentList = service.getAllStudents();
        view.displayStudentList(studentList);
    }
    
    private void viewStudent() throws ClassRosterPersistenceException {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student=  service.getStudent(studentId);
        view.displayStudent(student);
    
    }
    
    private void removeStudent()  throws ClassRosterPersistenceException  {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent = service.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }
    
    private void exitMessage() {
        view.displayExitBanner();
    }
}
