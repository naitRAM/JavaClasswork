package com.sg.ramimans.classroster.controller;
import com.sg.ramimans.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.ramimans.classroster.dao.classRosterDao;
import com.sg.ramimans.classroster.dto.Student;
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
    
    private classRosterDao dao;
    
    public ClassRosterController(classRosterDao dao, ClassRosterView view) {
        this.dao = dao;
        this.view = view;
    }
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
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
        
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    
    private void createStudent() {
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();  
    }
    
    private void listStudents() {
        view.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }
    
    private void viewStudent(){
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = dao.getStudent(studentId);
        view.displayStudent(student);
    
    }
    
    private void removeStudent() {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent = dao.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }
    
    private void exitMessage() {
        view.displayExitBanner();
    }
}
